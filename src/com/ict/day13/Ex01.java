package com.ict.day13;

// 인터페이스 : 서비스를 제공하는 목록
//			상수와 추상메소드로 구성되어 있음
//			생성자가 없음 (객체 생성 안됨)
// **다중상속 = 상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현 할 수 있다.
//			인터페이스가 같다라는 뜻은 대체가 가능하다는 뜻이다.
// 			java 8 버전부터 지원 : 1)static 메소드 추가, 2)default 메소드(완전한 메소드) 추가 (나중에 공부하자)
class Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
//	 public abstract void sound(); // 일반 클래스에서는 추상 메소드를 사용하려면 abstract 가 붙어야 사용 가능하다
//	 public void play();

	
	
}
	// 상속시 같은 클래스끼리는 extends 사용(인터페이스가 인터페이스,일반클래스가 일반 or 추상 클래스)
	// 다른 클래스에서는 implements 사용 (일반 or 추상 클래스가 인터페이스 클래스 받는것만 가능,인터페이스는 상수와 추상메소드만 가능하기때문)

interface Ex02{
	// 인터페이스는 상수와 추상메소드만 가지고 있기 때문에 static,abstract 가 생략되도 상수와 추상메소드다
	// 인터페이스는 상수이기때문에 대문자를 사용해야한다
	// static final 생략 되어 있음
	int SU1 = 10;
	static int SU2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
	
	// 일반 메소드는 사용 못함
//	 public void like() {}
	
	// abstract 생략 가능
	public abstract void sound();
	public void play();
	
	
	
}