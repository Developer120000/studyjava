package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 숫자를 받아서 홀수 인지 짝수 인지 출력
		esc : while (true) {
		String res = "";
		System.out.print("숫자 입력 : ");
		int su = scan.nextInt();
		
		if (su % 2 == 1) {
			res = "홀수";
		} else {
			res = "짝수";
		}
		System.out.println(su + "는 "+ res + "입니다.");
		while (true) {
		System.out.println("계속 할까요?(1.yes, 2.no) >>");
		int result = scan.nextInt();
		if (result == 1) continue esc;
		if (result == 2) break esc;
		System.out.println("제대로 입력하세요");
		} // 안쪽 while
		} // 바깥쪽 while
		System.out.println("수고하셨습니다");
		
	}
}
