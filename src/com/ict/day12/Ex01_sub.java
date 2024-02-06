package com.ict.day12;

// 상속관계(is a 관계) : 자식클래스가 부모클래스의 멤버필드와 멤버메소드를
//					 마음대로 사용할 수 있는 클래스들 간의 관계
// 		포유류 (부모)

// 사람, 강아지, 고양이, 고래 (자식)
// 이 때 사람은 포유류 이다. (is a 관계) O
// 포유류는 사람이다. X

// 형식) 자식클래스 extends 부모클래스
// 특징) 모든 클래스는 하나의 부모클래스를 갖는다.
//		없으면 Object 가 부모클래스이다.
// 		모든 클래스는 Object 를 부모클래스로 가지고 있다.
// 		다중 상속을 지원하지 않는다.(부모클래스가 하나만 존재한다.)
// 자식 클래스는 부모클래스와 Object 클래스 둘다 사용가능하다

// 자식클래스
public class Ex01_sub extends Ex01_sup{
	String name = "홍반장";
	int age = 13;
	private double weight = 81.9;
	
	public Ex01_sub() {
		System.out.println("자식 생성자 : " + this);
	}
	public void play() {
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모변수(super)
		// 지역변수가 없으면 전역변수를 사용하고 없으면 부모변수 사용한다
		String name = "홍두깨";
		System.out.println(name);	   // 홍두깨
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동
		System.out.println();
		
		System.out.println(age);
		System.out.println(this.age);
		System.out.println();
		
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		System.out.println();
		
		// 자기자신의 private 은 접근 가능
		System.out.println(weight);

		// 부모의 private 은 접근 불가
//		System.out.println(dog);
		
	}
}
