package com.ict.day14;

//import com.ict.day14.Ex02.Inner01;

public class Ex02_Main {
	public static void main(String[] args) {
		// 멤버 내부클래스는 별도로 객체 생성 안됨
//		Inner01 t1 = new Inner01;
		
		// 외부 클래스를 통해서 내부클래스 객체를 생성
		Ex02 t1 = new Ex02(); // 외부클래스 객체 생성 먼저
		t1.sound();
//		Inner01 t2 = t1.new Inner01(); // 상단 3번 라인에 임폴트 생성해서 사용하든
		// 내부클래스 주소에는 $ 표시가 있다.
		Ex02.Inner01 t2 = t1.new Inner01(); // 앞에 Ex02.을 붙여서 생성하면 된다
		
		t2.play();

		t1.new Inner01();
		
	}
}
