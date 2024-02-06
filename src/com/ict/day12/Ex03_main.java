package com.ict.day12;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체 생성하면 부모클래스가 먼저 생성 된다.
		Ex03_sub t1 = new Ex03_sub();
		
		System.out.println();
		// 	부모				자식
		Ex03_sup t2 = new Ex03_sub(); // Ex03_sub(자식) is a Ex03_sup(부모)
		
//			자식				부모			=> 컴파일 오류
//		Ex03_sub t3 = new Ex03_sup(); // 
		
	}
}
