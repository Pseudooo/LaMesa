package com.lamesa.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

import com.lamesa.util.TextFormat;

public class NetHandler {
	
	private final Socket s;
	private final ReadThread rt;
	
	public NetHandler(Socket s, ReadThread rt) throws IOException {
		this.s = s;
		this.rt = rt;
	}
	
	/**
	 * Dispatch a request to the server
	 * @param req Type of request
	 * @param res Runnable to process response
	 * @throws IOException 
	 * @return
	 */
	public void dispatch(Object payload, Response res) throws IOException {
		
		DataGram dg = new DataGram(payload);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(dg);
		oos.flush();
		
		// Byte array to be sent
		byte[] data = baos.toByteArray();
		
		TextFormat.foutput("Dispatching DataGram :: %s", dg.ID());
		
		// Write the length and data to stream
		this.s.getOutputStream().write(data.length);
		this.s.getOutputStream().write(data);
		
		// Register a response to be run when server responds
		this.rt.registerResponse(dg.ID(), res);
		
	}
	
}
