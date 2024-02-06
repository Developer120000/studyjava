package com.ict.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Study_Server2 implements Runnable {
	ServerSocket sc = null;
	Socket s = null;

	BufferedReader br = null;
	BufferedWriter bw = null;

	public Study_Server2() {
		try {
			sc = new ServerSocket(7003);
			System.out.println("서버 대기중..");

			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				s = sc.accept();
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));

				String msg = br.readLine();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속");

				bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

				bw.write(msg + System.lineSeparator());
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Study_Server2();
	}

}
