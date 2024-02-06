package com.ict.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Study_Server {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
//		InputStream is = null;
		BufferedReader br = null;
//		OutputStream os = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(7002);
			System.out.println("서버 대기...");
			s = ss.accept();
			
//			is = s.getInputStream();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String ip = s.getInetAddress().getHostAddress();
			String msg = br.readLine();
			
//			os = s.getOutputStream();
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(msg);
			bw.flush();
			
			
		} catch (IOException e) {
			System.out.println("서버 오류");
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
