package com.ict.day05;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 for 문 : for 문 안에 또 다른 for 문이 존재하는 것
//		for (int i = 0; i < 4; i++) {
//			System.out.println("명령문1");
//			for (int j = 0; j < 6; j++) {
//				System.out.println("i = " + i + ", j = " + j);
//			}
//			System.out.println("명령문2");
//		}
//		System.out.println();
		
		// 구구단 세로
		System.out.println("구구단-1:");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		System.out.println();
		
		// 구구단 가로
		System.out.println("구구단-2:");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
				if (j == 9) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		// 구구단 가로 (풀이)
		System.out.println("구구단-2:");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + " ");

			}
			System.out.println();
		}
		System.out.println();
		
		// 구구단 가로세로
		System.out.println("구구단-3:");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i * j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 이중 for 문
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			}
		
	}
}
