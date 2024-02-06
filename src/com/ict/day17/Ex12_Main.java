package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {
//		Ex12 t = s -> System.out.println(s + "님 환영");
		
		Ex12 t = returnString(); // 반환값으로 쓰이는 람다식
		t.showString("Hello ");
		
		showMyString(t); // 매개변수로 전달하는 람다식
		
		// 원래 자바 방식1
		showMyString(new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str + "님 방가방가");
			}
		});
		
		// 원래 자바 방식2
		Ex12 t2 = returnString2();
		t2.showString("Lamda");
	}
	// 매개변수로 전달하는 람다식, 자바방식
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}
	
	// 반환값으로 쓰이는 람다식 // 반환형에 클래스이름을 넣어 이름을 받고 리턴한다
	public static Ex12 returnString() {
		return s -> System.out.println(s + "님 환영");
	}
	
	// 원래 자바 방식2
	public static Ex12 returnString2() {
		return new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str + "님 Hi");
			}
		};
	}
}
