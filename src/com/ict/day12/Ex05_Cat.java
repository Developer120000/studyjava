package com.ict.day12;

public class Ex05_Cat extends Ex05_Animal{
	int tail = 10;
	
	// 부모 메소드를 가져와서 자식클래스가 마음대로 변경할 수 있다.
	// 오버라이딩이라고 한다.
	// @Override => 어노테이션
	// @Override => 부모 클래스의 메소드를 자식클래스가 가져와서 재정의 한다.
	public void sound1() {
		System.out.println("어흥");
	}
//	@Override
//	public void sound() {
//		System.out.println("야옹~ 야옹~");
//	}
//	@Override
//	public void like() {
//		System.out.println("잠자기");
//	}
	
	public void play() {
		System.out.println("놀기");
	}
	
}
