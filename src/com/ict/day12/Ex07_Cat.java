package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{
	int id = 1234123;
	
	public Ex07_Cat() {
//		super([인자]); 생략되어 있다. 부모의 기본생성자를 뜻한다
//				 기본생성자가 없으면 오류, 인자가 있는 생성자만 있으면 그거에 맞춰서
//				 자식생성자도 같은 생성자를 만들어줘야 된다.
//		super : 부모클래스의 주소를 참조
//		super([인자]) : 부모클래스의 생성자, 인자가 있을수도 없을수도 있다.
		super("짜오", 3);
		System.out.println("자식생성자");
	}
	// 모든 자식 클래스는 부모클래스의 생성자를 참조해야 된다.
	public Ex07_Cat(String name) {
		// super([인자]) 와 this([인자]) 는 둘 다 첫 줄에만 사용 가능
		// 즉, 둘 중에 하나만 사용 가능
		super(name, 7);
		// this();
	}
	
	public Ex07_Cat(int age) {
		this("천진반");
	}
	
}
