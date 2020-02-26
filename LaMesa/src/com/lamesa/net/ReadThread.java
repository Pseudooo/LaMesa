package com.lamesa.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.lamesa.Client;

public class ReadThread {

	private final Client client;
	private final Socket socket;
	private final BufferedReader br;
	
	public ReadThread(Client client, Socket socket) throws IOException {
		this.client = client;
		this.socket = socket;
		
		this.br = new BufferedReader(
				new InputStreamReader(this.socket.getInputStream()));
		
	}
	
}
