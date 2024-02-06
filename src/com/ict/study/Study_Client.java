package com.ict.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Study_Client {
	public static void main(String[] args) {
		Socket s = null;
//		OutputStream os = null;
		BufferedWriter bw = null;
//		InputStream is = null;
		BufferedReader br = null;
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println("데이터 입력");
			String msg = scan.nextLine();
			
			s = new Socket("192.168.219.100", 7002);
			
//			os = s.getOutputStream();
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			bw.write(msg + "\n");
			bw.flush();
			
//			is = s.getInputStream();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String msg2 = br.readLine();
			System.out.println("답변 : " + msg2);
			
		} catch (Exception e) {
			System.out.println("클라이언트 오류");
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
				s.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
