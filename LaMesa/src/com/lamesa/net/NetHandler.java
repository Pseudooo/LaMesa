package com.lamesa.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

public class NetHandler {
	
	private final Socket s;
	
	public NetHandler(Socket s) throws IOException {
		this.s = s;
	}
	
	/**
	 * Dispatch a request to the server
	 * @param req Type of request
	 * @param res Runnable to process response
	 * @throws IOException 
	 * @return
	 */
	public void dispatchRequest(Object payload, Response res) throws IOException {
		
		DataGram dg = new DataGram(payload);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(dg);
		oos.flush();
		
		// Byte array to be sent
		byte[] data = baos.toByteArray();
		
		this.s.getOutputStream().write(data.length);
		this.s.getOutputStream().write(data);
		
	}
	
}
