package com.lamesa.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import com.lamesa.Client;

public class WriteThread extends Thread {
	
	private final Client client;
	private final Socket socket;
	
	private final PrintWriter pw;
	
	public WriteThread(Client client, Socket socket) throws IOException {
		this.client = client;
		this.socket = socket;
		
		// TODO: Consider auto-flush=false
		this.pw = new PrintWriter(this.socket.getOutputStream(), true);
	}
	
	@Override
	public void run() {
		// TODO: run
	}
	
	public void send(String data) {
		this.pw.println(data);
	}
	
}
