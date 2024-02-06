package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		
		
		// 변경 전 이름
		System.out.println(t.getName());
		
		// 홍길동 이름을 둘리로 변경하자.
		t.setName("둘리");
		
		// 변경 후 이름
		System.out.println(t.getName());
		
		// 변경 전 나이
		System.out.println(t.getAge());
		
		// 홍길동 이름을 나이 변경
		t.setAge(15000);
		
		// 변경 후 나이
		System.out.println(t.getAge());
		
		
		
	}
}
