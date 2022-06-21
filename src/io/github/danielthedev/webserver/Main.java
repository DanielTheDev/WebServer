package io.github.danielthedev.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(443);
		
		Socket client;
		while((client = socket.accept()) != null) {
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			
		}
		
		
	}
	
}
