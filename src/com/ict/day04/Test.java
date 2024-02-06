package com.ict.day04;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		
		int su1 = 29;
		int su2 = 15;
		
		boolean b1 = (su1 >= 10) && (su1 <= 35);
		System.out.println(b1);
		
		boolean b2 = (su1 >= 30) || (su1 >= 31);
		System.out.println(b2);
		
		boolean b3 = true;
		System.out.println(!b3);
		System.out.println(!!b3);
		System.out.println(!!!b3);
		
		
		// 10-20 출력
		for (int i = 10; i < 21; i++) {
			System.out.println("결과 : " + i);
		} 
		
		// 10-20 까지 짝수만 출력
		for (int i = 10; i < 21; i=i+2) {
			System.out.println("결과 :" + i);
		}
		
		// 10-20 까지 짝수만 출력 (다른방법)
		for (int i = 10; i < 21; i++) {
			if (i % 2 ==0) {
				System.out.println(i);
			}
		}
		// 10-20 까지 홀수만 출력
		for (int i = 11; i < 21; i=i+2) {
			System.out.println(i);
		}
		// 10-20 까지 홀수만 출력 (다른방법)
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println(5 +" * " + i + " = " + 5 * i);
		}
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0 ) {
				System.out.println();
			}
		}
		System.out.println();
		
		// 0-10 의 누적합 (합계 구하기)
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum = sum + i;
		} 
		System.out.println(sum);
		System.out.println();
		
		// 0-10 홀수의 합계, 짝수의 합계를 각각 구하자
		int sum1 = 0 ;
		int sum2 = 0 ;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		} 
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println();
		
		
		// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1) 의 합은?
		int sum3 = 1;
		for (int i = 7; i > 0; i--) {
			sum3 = sum3 * i ;
		}
		System.out.println(sum3);
	}
}
