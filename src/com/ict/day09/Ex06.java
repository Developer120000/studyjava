package com.ict.day09;

public class Ex06 {
	String name = "홍길동";
	static int kor = 80;
	static int eng = 95; 
	static int math = 95;
	int total = 0;
	
	// static 메소드
	public static void play01() {
		// static 메소드가 전역변수를 사용하기 위해서는 전역변수도 static 이여야 한다.
		int sum = kor + eng + math;
		// 지역변수에는 static 을 사용할 수 없다.
//		static int sum = kor + eng + math; 
		
//		System.out.println(name); // 스태틱 메소드에서 인스턴스 필드 사용 불가
		System.out.println(kor);
		System.out.println(sum);
	}
	
	public static int play02() {
		int sum = kor + eng + math;
		return sum;
		
		
		
	}
}
