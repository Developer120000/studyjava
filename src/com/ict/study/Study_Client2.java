package com.ict.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Study_Client2 implements Runnable{
	Socket s = null;
	BufferedWriter bw = null;
	BufferedReader kb = null;
	BufferedReader br = null;
	
	public Study_Client2() {
		try {
			s = new Socket("192.168.219.100", 7003);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			kb = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("데이터 입력 : ");
				String msg = kb.readLine();
				
				bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				bw.write(msg + System.lineSeparator());
				bw.flush();
				
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String msg2 = br.readLine();
				System.out.println("답변 : " + msg2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Study_Client2();
	}
	
}
