package com.ict.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

// PrintStream 은 모든 데이터를 출력할 수 있다. (입력없음)
// 기본생성자가 없어서 BufferedStream 처럼 FileStream 을 이용하자
public class Ex02 {
	public static void main(String[] args) {
		String pathname = "D:/JS/util/test04.txt";
		File file = new File(pathname);
		
		FileOutputStream fos =null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file);
			ps = new PrintStream(fos);
			// System.Out.println(기본자료형 또는 String) 와 같음
			ps.println('A');
			ps.println(false);
			ps.println(3.14);
			ps.println("Hello World");
			ps.println(92);
			ps.println("자바의 세계의 오신 것을 환영합니다.");
			ps.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 연습	
//		String pathname2 = "C:/JS/util/study1.txt";
//		File file2 = new File(pathname2);
//		
//		PrintStream ps2 = null;
//		
//		try {
//			ps2 = new PrintStream(new FileOutputStream(file2));
//			
//			ps2.println("아직");
//			ps2.println(1 + "발");
//			ps2.println("남았다");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				ps2.close();
//			} catch (Exception e2) {
//			}
//		}
		
		
		
	}
}
