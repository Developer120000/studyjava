package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
// 각 클라이언트를 나타내는 클래스로, Runnable을 구현하여 별도의 스레드에서 클라이언트의 동작을 처리합니다.
public class Ex01_ServerClients implements Runnable {
	Socket s;
	Ex01_Server server;

	// 직렬화 3가지 (대상클래스(VO)), ObjectInputStream, ObjectOutputStream
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickname;

	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}
	
	// 클라이언트가 보낸 프로토콜이나 메시지를 받는다.
	@Override
	public void run() {
		esc:while (true) {
			try {
				// 역직렬화
				Object obj = in.readObject();
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
					case 0:	// 접속해제 (while 문) 밖에서 처리
						// 받은 정보는 그대로 보낸다.
						out.writeObject(p);
						break esc;
					case 1: // 대화명 받기
						nickname = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickname + "님 입장");
						server.sendMsg(p);
						break;
					case 2:	
						p.setMsg(nickname + " : " + p.getMsg());
						server.sendMsg(p);
						break;
					}
				}
			} catch (Exception e) {
			}
		}
		try {
			// cmd 가 0이면 접속해제 이므로 close 한다.
			out.close();
			in.close();
			s.close();

			// 자기자신은 리스트에서 제외, 퇴장 메세지를 나는 받을 필요가 없으니까
			server.removeClient(this);
			// 자신을 제외한 사람들에게는 퇴장 메세지 전달을 하자. 그래서 cmd 2번
			Ex01_Protocol p = new Ex01_Protocol(2, nickname + "님 퇴장");
			
			server.sendMsg(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
