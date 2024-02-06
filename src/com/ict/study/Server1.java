package com.ict.study;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.ict.day21.ServerClients;

public class Server1 {
//	ArrayList<ServerClients> list = null;
//	ServerSocket ss = null;
//	public Server1() {
//		list = new ArrayList<ServerClients>();
//		ss = new ServerSocket(7010);
//		System.out.println("서버 시작");
//		
//		play();
//	}
//	
//	public void play() {
//		while (true) {
//			Socket s = ss.accept();
//			ServerClients clients = new ServerClients(s, this);
//			new Thread(clients).start();
//			list.add(clients);
//			
//		}
//	}
//	
//	public void sendMsg(Protocol p) {
//		for (ServerClients k : list) {
//			k.out.writeObject(p);
//		}
//	}
//	
//	
//	public void removeClient(ServerClients sc) {
//		list.remove(sc);
//	}
//	
//	public static void main(String[] args) {
//		new Server1();
//	}
//	
}
