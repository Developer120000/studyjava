package com.ict.day12;

public class Ex04_main {
	public static void main(String[] args) {
		// 자식 클래스를 객체 생성하면 (생성자 호출)
		// 자식 클래스의 부모클래스의 생성자를 호출
		Ex04_Game t = new Ex04_Game();

		// 게임하기
		t.play();
		// 자식클래에게 없지만 부모클래에게 있으므로 사용 가능
		t.sound();
		// 부모의 부모클래스에 존재해도 사용 가능
		t.call();
		t.sms();

		System.out.println(t.number);

		Ex04_DCa t1 = new Ex04_DCa();
		t1.picture();
		t1.call();
		
		
	}
}
