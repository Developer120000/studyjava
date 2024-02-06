package com.ict.study;

import com.ict.day17.Ex09;

public class Study6_5 {
	public static void main(String[] args) {
		int su1 = 30;
		int su2 = 60;
		
		// 람다식2
		Ex09 t = (num1, num2) -> num1 > num2 ? num1 : num2;
		System.out.println(t.getMax(10, 25));

		// 객체 생성 기본 방법
		Ex09 t1 = new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				if (num1 > num2) {
					return num1;
				} else {
					return num2;
				}
			}
		};
		System.out.println(t1.getMax(su1, su2));

		// 람다식1
		Ex09 t2 = (num1, num2) -> {
			if (num1 > num2) {
				return num1;
			} else {
				return num2;
			}
		};
		System.out.println(t2.getMax(70, 65));

		
		// 어나니머스 형식 출력 어떻게?
		new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				if (num1 > num2) {
					return num1;
				} else {
					return num2;
				}
			}
		}.getMax(8, 17);
		
		
	}
}	
