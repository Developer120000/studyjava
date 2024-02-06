package com.ict.day11;

public class Ex02 {
	public static void main(String[] args) {
		
		// Ex01 객체 생성
		// Ex01 에 생성자가 없어서 기본생성자를 사용
		// Ex01 의 생성자를 만들자
		Ex01 ex01 = new Ex01("도우너", 11);
		
		// 이름, 나이, 주소 출력
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
		System.out.println();
		
		// 이름을 임꺽정, 나이를 34, 주소를 함경도 변경 하자
		ex01.setName("임꺽정");
		ex01.setAge(34);
		ex01.setAddr("함경도");
		
		
		System.out.println(ex01.getName());
		System.out.println(ex01.getAge());
		System.out.println(ex01.getAddr());
		System.out.println();
		
		Ex01 ex012 = new Ex01("도우너", 11);
		System.out.println(ex012.getName());
		System.out.println(ex012.getAge());
		System.out.println(ex012.getAddr());
	}
}
