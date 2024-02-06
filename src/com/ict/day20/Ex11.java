package com.ict.day20;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : 자바에서 IP주소를 표현하는 클래스
// 				 생성자는 존재하지만 사용하지 못함
//				 6개의 static 메소드를 이용한다.
//			  ** localhost 란 현재 내가 사용하고 있는 컴퓨터를 말한다.
public class Ex11 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			addr = InetAddress.getByName("www.google.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			addr = InetAddress.getByName("m.google.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println();
			
			// 구글 IP 142.250.207.100
			byte[] b = { (byte)(142), (byte)(250), (byte) (207), (byte)(100)};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("=============================");
			
			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress k : arr) {
				System.out.println("이름 : " + k.getHostName());
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString : " + k.toString());
				System.out.println();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			InetAddress addr2 = InetAddress.getLocalHost();
			System.out.println(addr2.getHostName());
			System.out.println(addr2.getHostAddress());
			System.out.println(addr2.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
