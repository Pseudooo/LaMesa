package com.lamesa.net;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

import com.lamesa.Client;
import com.lamesa.util.TextFormat;

public class ReadThread extends Thread{

	private final Client client;
	private final Socket socket;
	
	private volatile HashMap<UUID, Response> responses = new HashMap<UUID, Response>();
	
	public ReadThread(Client client, Socket socket) throws IOException {
		this.client = client;
		this.socket = socket;
		
	}
	
	public void registerResponse(UUID id, Response res) {
		this.responses.put(id, res);
		TextFormat.foutput("Registered Response for %s", id.toString());
	}
	
	@Override
	public void run() {
		
		boolean run = true;
		while(run) {
			
			try {
				
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
