package com.ict.day09;

public class Ex04 {
	// 인스턴스 필드
	String name = "홍길동";
	int kor = 80;
	int eng = 95;
	int math = 85;
	int total = 0;
	
	// 메소드() : 기능, 동작
	// ** 해당 메소드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
	// 메소드 형식 : [접근제한자][메소드 종류] 반환형 메소드 이름([인자]) {실행할 내용}
	//			 일반 메소드는 메소드 종류를 생략한다.
	//			 접근 제한자 일반적으로 public 를 사용한다.
	//		  ** 반환형 : 호출한 곳으로 되돌아갈 때 가지고 가는 데이터의 자료형
	//					데이터가 없는 경우는 void 라는 예약어를 사용
	//			 반환형이 있는 메소드 맨 마지막 줄에는 return 예약어를 반드시 사용
	
	
	// 인스턴스 메소드
	public void play01() {
//		System.out.println(2);
		total = kor + eng + math ;  // 전역 변수에 저장
//		System.out.println(3);
	}
	
	public void play02() {
		int sum = kor + eng + math ; // 지역 변수에 저장
	}
	
	public int play03() { // sum 에 자료형인 int 를 가져간다
		int sum = kor + eng + math ;
		return sum ;  // 되돌아갈때 sum 을 가지고 간다
	}
	
	public int play04() { // 반환형을 썼는데 return 이 없으면 오류
		total = kor + eng + math;
		return total; // 값을 변경하고 반환 해준다
	}
	
	
}
