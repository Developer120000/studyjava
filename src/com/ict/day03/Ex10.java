package com.ict.day03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 패키지가 java.lang에 존재하는 클래스를 사용할 때는 import 를 할 필요 없다. 확인은 shift+F2 누르고 왼쪽상단에 나옴
		// java.long 이외에 존재하는 클래스를 사용하기 위해서 import 를 해야 된다.
		// 해당 클래스의 위치를 표시하므로 해당 클래스를 사용할 수 있게 한다.
		
		// 키보드에 입력한 정보를 받아서 scan 변수에 저장
		Scanner scan = new Scanner(System.in);
		
		// .next() : 입력한 내용을 String 형으로 처리하는 메서드
		System.out.print("이름 : ");
		String name = scan.nextLine(); // 키보드로 입력되서 scan 에 저장된 정보를 끄집어내서 스트링으로 바꿔준다
		System.out.println("당신의 이름 : " + name);
		
		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("당신의 나이 : " + (age+1)); // String 문자열에 숫자를 더하면 문자열로 이어짐

		// .nextInt() : 입력한 내용을 int 형으로 처리하는 메서드
		System.out.print("나이2 : ");
		int age2 = scan.nextInt();
		System.out.println("당신의 나이2 : " + (age2+1)); //문자 넣으면 오류
		
		// .nextDouble() : 입력한 내용을 double 형으로 처리하는 메서드
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.println("당신의 키는 " + height + "입니다.");
		
	}
}
