package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		
		// Ex01 클래스를 객체로 만들자
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자로 만들어진다.
		// 기본생성자란 인자가 없는 생성자를 말한다 => 클래스이름()
		// 인스턴스는 객체를 만들어야 접근이 가능하다
		// Ex01 t = new 생성자([인자]);
		   Ex01 t = new Ex01();
		   System.out.println(t);
		   System.out.println(t.name);
		   System.out.println(t.kor);
		   System.out.println(t.MATH);

		   
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		
		System.out.println(t.eng);
		System.out.println(t.COMPUTER);
		// 객체 생성전에는 Ex01 로만 부를수 있었는데 생성 후에는
		// 참조변수로도 가능하다 하지만 권장사항은 아니다.
		System.out.println();
		
		// 변수와 상수
		t.kor = 90;   // 변수는 데이터를 변경할 수 있다. 하지만
		System.out.println(t.kor); // 실제로 직접 접근해서 값을 변경하는 경우는 없다.
		
//		t.MATH = 100; // final 이 붙은 즉, 상수는 데이터를 변경할 수 없다.
		
		
		
		
	}
}
