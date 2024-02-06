package com.ict.day11;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 ex11 = new Ex11();
		System.out.println("main : " + ex11);
		
		
		// Ex13 에 있는 static 전역변수는 그냥 호출이 가능하다
		System.out.println(Ex13.num);
	}
}
