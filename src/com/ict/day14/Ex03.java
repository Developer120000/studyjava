package com.ict.day14;

// Local 내부클래스
public class Ex03 {
	String name = "둘리";
	private int age = 3;
	
	public Ex03() {
		System.out.println("외부" + this);
	}
	
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	// 내부클래스를 가지고 있는 메소드
	public void play() {
		int age = 147;
		int cnt = 10;
		
		class Inner02{
			String addr = "서울";
			public Inner02() {
				System.out.println("내부 : " + this);
			}
			
			public void like() {
				System.out.println(name);
				System.out.println(age); // 이름이 같은 변수의 우선순위로 지역변수가 나온다
//				System.out.println(this.age); // 외부클래스의 this 와 내부클래스의 this 가 다르므로 사용불가
				System.out.println(this.addr); // 이름이 같은 변수의 우선순위로 지역변수가 나온다
				
				// 외부클래스의 메소드 사용 가능
				sound();
			} // 내부 메소드 끝
			public void setA(int k) {
				System.out.println(k);
			}
			// 외부클래스의 메소드 사용 불가,
//			sound();
			
		} // 내부 클래스 끝
		Inner02 inner02 = new Inner02(); // 내부클래스의 끝과 외부 메소드의 끝 사이에 만든다
//		System.out.println(name);
//		System.out.println(this.age); // 결과 : 3
		inner02.like();
		System.out.println("===========");
		inner02.setA(this.age);
		
	} // 외부 메소드 끝
} // 외부 클래스 끝
