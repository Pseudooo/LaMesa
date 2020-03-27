package com.lamesa.net;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

import com.lamesa.Client;
import com.lamesa.util.TextFormat;

public class ReadThread extends Thread{

	private final Socket socket;
	
	private volatile HashMap<UUID, Response> responses = new HashMap<UUID, Response>();
	
	public ReadThread(Client client, Socket socket) throws IOException {
		this.socket = socket;
	}
	
	/**
	 * Register a response to deal with a given DataGram that is dispatched
	 * the response will be executed with the response payload
	 * @param id
	 * @param res
	 */
	public void registerResponse(UUID id, Response res) {
		this.responses.put(id, res);
		TextFormat.foutput("Registered Response for %s", id.toString());
	}
	
	/**
	 * Runnable for the Threading Superclass
	 */
	@Override
	public void run() {
		
		boolean run = true;
		while(run) {
			
			try {
				// Read the DataGram that's received and execute the appropriate response
				int x = this.socket.getInputStream().read();
				
				byte[] data = new byte[x];
				this.socket.getInputStream().read(data);
				
				ByteArrayInputStream bais = new ByteArrayInputStream(data);
				ObjectInputStream ois = new ObjectInputStream(bais);
				
				DataGram dg = (DataGram) ois.readObject();
				Response res = this.responses.remove(dg.ID());
				
				TextFormat.foutput("Received Response :: %s", dg.ID().toString());
				
				res.takePayload(dg.getPayload());
				res.run();
				
			}catch(Exception e) {
				e.printStackTrace();
				run = false;
			}
			
		}
		
	}
	
}
