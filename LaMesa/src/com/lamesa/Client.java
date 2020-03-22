package com.lamesa;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

import com.lamesa.net.NetHandler;
import com.lamesa.net.ReadThread;
import com.lamesa.net.exceptions.HandshakeFailedException;
import com.lamesa.util.TextFormat;

public class Client {
	
	public final static int KEY_SIZE = 32;
	
	// Address+port of server
	private final String host;
	private final int port;
	
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	
	private final NetHandler nh;
	
	private final ReadThread rt;
	
	private byte[] key;
	
	public Client(String host, int port) throws Exception {
		
		this.host = host;
		this.port = port;
		
		try { // Attempt to connect and open both streams
			this.socket = new Socket(this.host, this.port);
			
			this.is = this.socket.getInputStream();
			this.os = this.socket.getOutputStream();
			
		}catch(IOException e) {
			throw e;
		}
		
		try { // Attempt to perform handshake
			performHandshake();
		}catch(HandshakeFailedException e) {
			throw e;
		}
		
		this.rt = new ReadThread(this, this.socket);
		this.rt.start();
		
		this.nh = new NetHandler(this.socket, this.rt);
		
	}
	
	private void performHandshake() throws HandshakeFailedException {
		
		byte[] buffer = new byte[KEY_SIZE];
		byte[] P, G, x;
		
		try {
			// COLLECT P, G and x from socket
			this.is.read(buffer);
			P = Arrays.copyOf(buffer, KEY_SIZE);
			
			is.read(buffer);
			G = Arrays.copyOf(buffer, KEY_SIZE);
			
			is.read(buffer);
			x = Arrays.copyOf(buffer, KEY_SIZE);
			
		}catch(Exception e) {
			throw new HandshakeFailedException("Failed to collect P, G and x");
		}
		
		new SecureRandom().nextBytes(buffer); // Generate b from sec pool
		byte[] b = Arrays.copyOf(new BigInteger(buffer).abs().toByteArray(), KEY_SIZE);
		
		// Compute y
		byte[] y = Arrays.copyOf(
				new BigInteger(G).modPow(new BigInteger(b), new BigInteger(P)).toByteArray()
				, KEY_SIZE);
		
		try {
			this.os.write(y);
		}catch(Exception e) {
			throw new HandshakeFailedException("Failed to write y");
		}
		
		byte[] k = Arrays.copyOf(new BigInteger(x).modPow(new BigInteger(b), new BigInteger(P))
				.toByteArray(), KEY_SIZE);
		
		try {
			this.key = MessageDigest.getInstance("SHA-256").digest(k);
		} catch (NoSuchAlgorithmException e) {
			throw new HandshakeFailedException("Failed to get SHA256 instance");
		}
		
		TextFormat.foutput("Secret: %s", TextFormat.formatKey(this.key));
	}
	
}
