package com.lamesa.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

import com.lamesa.Client;

public class ReadThread extends Thread{

	private final Client client;
	private final Socket socket;
	
	private final HashMap<UUID, Response> responses = new HashMap<UUID, Response>();
	
	public ReadThread(Client client, Socket socket) throws IOException {
		this.client = client;
		this.socket = socket;
		
	}
	
	public void registerResponse(UUID id, Response res) {
		this.responses.put(id, res);
	}
	
	@Override
	public void run() {
		
		boolean run = true;
		while(run) {
			
			try {
				
				int x = this.socket.getInputStream().read();
				byte[] buffer = new byte[x];
				
				this.socket.getInputStream().read(buffer);
				
				System.out.printf("Read %d bytes%n", x);
				
			}catch(Exception e) {
				run = false;
			}
			
		}
		
	}
	
}
