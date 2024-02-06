package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		int var1 = 100; // 값이 변하지 않는다.
		int var2 = t.add(var1); // 리턴받아서 값이 변한다.
		
		//값이 변하지 않는다.
		System.out.println("값 : " + var1); // 100
		System.out.println("값 : " + var2); // 101
		System.out.println();
		
		// Call By Reference
		// 배열에 인자값 대입하려면 배열을 미리 만들어 한다. 
		int[] su = {1, 10, 100, 1000};
		// 인자가 객체(배열도 포함) 자료형 : Call By Reference
		// 참조된 값이 변할 수 도 있다.
		t.add2(su);
		int[] su1 = su;
		// 배열안에 값이 변한다.
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		for (int i = 0; i < su1.length; i++) {
			System.out.println(su1[i]);
		}
	}
}
