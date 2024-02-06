package com.ict.day11;

public class Ex13 {
	// static : 객체 생성과 상관없이 미리 만들어진 필드와 메소드
	//			클래스와 지역 변수에는 사용할 수 없다.
	//			모든 객체가 접근해서 사용할 수 있음(단, private 이면 안됨)
	//			static 영역에 만들어진다.
	
	int su = 10;
	static int num = 10;
	private static int age = 42;
	
	public Ex13() {
		su++;
		num++;
	}
	
	public void play() {
		int k = su + 1000;
		System.out.println("k : " + 1000);
		int k2 = num + 1000;
		System.out.println("k2 : " + 1000);
	}
	
	// static 메소드는 전역변수 사용 못함
	// 지역변수에 static 사용 못함
	// static 메소드는 static 전역변수만 사용 가능
	public static int play2() {
//		int k = su + 1000
		int k2 = num + 1000;
//		static int k3 = 1000;
		return k2;
	}
	
}
