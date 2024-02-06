package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
// ServerSocket을 통해 클라이언트의 접속을 기다리고, 각 클라이언트에 대한 처리를 담당
public class Ex01_Server {
	ArrayList<Ex01_ServerClients> list = null; // 현재 접속 중인 클라이언트들을 저장
	ServerSocket ss =null;
	public Ex01_Server() {
		try {
			list = new ArrayList<Ex01_ServerClients>();
			ss = new ServerSocket(7009);
			System.out.println("서버 시작 !!");
			
			play();
		} catch (Exception e) {
		}
	}
	// 클라이언트의 접속을 받아들이고, 각 클라이언트에 대한 처리를 시작합니다.
	public void play() {
		while(true) {
			try {
				Socket s = ss.accept();
				Ex01_ServerClients clients = 
						new Ex01_ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);
			} catch (Exception e) {
			}
		}
	}
	
	// 모든 리스트에 있는 사람에게 메세지 전달
	public void sendMsg(Ex01_Protocol p) {
		for (Ex01_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 리스트에 자기 자신을 삭제
	public void removeClient(Ex01_ServerClients sc) {
		list.remove(sc);
	}
	
	public static void main(String[] args) {
		new Ex01_Server();
	}
}
