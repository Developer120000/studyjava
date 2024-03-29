package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		Ex11 t = s -> System.out.println(s); // s 를 받아서 s 출력
		
		t.showString("Hello lamda_1");
		// static 메소드는 static 메소드만 호출 가능
		showMyString(t);
		
		showMyString(new Ex11() {
			@Override
			public void showString(String str) {
				System.out.println("Hello lamda_3");
			}
		});
	}
	
	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda_2");
	}
	
}
