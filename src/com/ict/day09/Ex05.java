package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야
		// Ex04 가 가지고 있는 필드와 메소드를 사용할 수 있다.
		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();
		
		System.out.println(t.name);
		
		// Ex04 에 있는 play01 메소드를 호출하자
		// play01 이 void 이기 때문에 데이터를 가져오지는 않는다.
//		System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
//		System.out.println(4);
		
		t.play02();
//		System.out.println(t.sum);
		// 지역변수는 메소드를 호출할때 생성되는데 되돌아오기전에 값이 삭제된다
		// 반환형이 있는걸 사용하거나 전역변수에 저장해서 사용해야한다
		
		int k = t.play03(); // 반환되는 자료형에 맞춰서 저장해야한다
		System.out.println(k);
		
		
		
	}
}
