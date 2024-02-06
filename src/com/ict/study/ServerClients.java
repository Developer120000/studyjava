package com.ict.study;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerClients implements Runnable{
	Socket s;
	Server1 server;
	
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickname;
	
	public ServerClients(Socket s, Server1 server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (IOException e) {
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
