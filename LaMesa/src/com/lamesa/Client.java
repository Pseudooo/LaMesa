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
import com.lamesa.ui.myprofilewindow;
import com.lamesa.util.TextFormat;

public class Client {
	
	public static NetHandler nh;
	
	public String name = "", phone = "", email = "";
	
	public final static int KEY_SIZE = 32;
	
	// Address+port of server
	private final String host;
	private final int port;
	
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	
	private final ReadThread rt;
	
	private byte[] key;
	
	/**
	 * Create a new client instance that will automatically connect to the server
	 * @param host - Host name
	 * @param port - Port for host
	 * @throws Exception Connection exceptions
	 */
	public Client(String host, int port) throws Exception {
		
		myprofilewindow.c = this;
		
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
		
		nh = new NetHandler(this.socket, this.rt);
		
	}
	
	/**
	 * @throws HandshakeFailedException
	 */
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
