package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		Ex15 t = new Ex15();
		
		String name = t.play01("둘리");
		System.out.println("name : " + name);
		System.out.println(t.name);
		
		int res = t.play02(90, 90, 90);
		System.out.println("res : " + res);
		System.out.println(t.sum); // 지역변수에 저장해서 0으로 나온다
		
		int res2 = t.play03(80, 80, 80);   
		System.out.println("res2 : " + res2);
		System.out.println(t.sum); // sum 전역변수에도 저장이 되서 값이 반환된다
		
		
	}
}
