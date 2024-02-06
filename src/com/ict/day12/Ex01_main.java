package com.ict.day12;

public class Ex01_main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 만들어지고
		// 그 다음에 자식 클래스가 만들어진다.
		Ex01_sub t = new Ex01_sub();
		System.out.println(t);
		System.out.println();
		
		t.play();
		// 부모클래스의 멤버필드가 private 아니면 접근 가능
		System.out.println(t.addr);
		System.out.println(t.age);
		System.out.println();
		System.out.println();
		Ex01_sup t1 = new Ex01_sup();
		System.out.println(t1.age);
		
		// static 객체, 상속 등과 상관없이 그냥 호출 가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		
		System.out.println(Ex01_sup.car);
		System.out.println(Ex01_sup.GENDER);
		
		
	}
}
