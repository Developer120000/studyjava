package com.ict.day14;

import java.util.Scanner;

// throws : 예외전가, 예외양도
//			예외가 발생하면 예외처리를 하지 않고 자신을 호출한 곳으로 예외객체를 전달.
//			나중에라도 예외처리를 하는 것이 좋다.
public class Ex11 {
	
	public void setData(String str) { // 책임전가받은 내용을 try ~ catch 로 예외처리
//		try {
			// str 의 길이가 0보다 크면 (str 이 null 이 아니면) 
			if(str.length() > 0) {
				// 첫글자 추출
				String res = str.substring(0, 1);
				prnData(res);
			}
//		} catch (NumberFormatException e) {
//			System.out.println("숫자만 입력하세요");
//		}
	}
	
	// NumberFormatException 발생하면 해당 메소드를 호출한 곳(res)으로 NumberFormatException 를 던진다.
	// res 로 책임전가
	public void prnData(String str) throws NumberFormatException{
		// 예외처리
//		try {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
//		} catch (NumberFormatException e) {
//			System.out.println("첫글자는 반드시 숫자여야 한다.");
//		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("정수 입력 : ");
			String msg = scan.next();
			
			// static 은 static 만 호출 가능하다 setData 를 이용하려면 객체생성 해야함
			Ex11 ex11 = new Ex11();
			ex11.setData(msg);
		} catch (NumberFormatException e) {
			System.out.println("제대로 입력하세요");
		}
		System.out.println("수고하셨습니다.");
		
	}
}
