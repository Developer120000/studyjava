package com.ict.day14;

import com.ict.day14.Ex04.Inner03;

public class Ex04_Main {
	public static void main(String[] args) {	
		// 별도의 객체 생성 없이 사용 가능
		System.out.println(Inner03.room);
		// 별도로 만들어진다.
		Inner03 test = new Inner03();
		Inner03.prn(); // 내부 스태틱 클래스의 내부 인스턴스 메소드 호출
		System.out.println(Ex04.cnt);
		
		
	}
}
