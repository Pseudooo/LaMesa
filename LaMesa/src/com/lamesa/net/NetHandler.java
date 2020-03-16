package com.lamesa.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

public class NetHandler {
	
	private final HashMap<UUID, Request> requests;
	
	private final Socket s;
	
	public NetHandler(Socket s) throws IOException {
		this.requests = new HashMap<UUID, Request>();
		this.s = s;
	}
	
	/**
	 * Dispatch a request to the server
	 * @param req Type of request
	 * @param res Runnable to process response
	 * @throws IOException 
	 * @return
	 */
	public void dispatchRequest(ReqType req, Runnable res) throws IOException {
		
		// TODO Fetch appropriate data from db
		
		// Temporary obj to fill in for tests
		Request r = new Request(req, new String("This is a test"));
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(r);
		oos.flush();
		
		// Byte array to be sent
		byte[] data = baos.toByteArray();
		
		// TODO send length of data
		
	}
	
}
