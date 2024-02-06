package com.ict.day07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// String 으로 숫자 받아서 Integer 사용, equals 사용

		esc: while (true) {
			System.out.println("숫자 입력 : ");
			String su = scan.next();
			// 숫자가 아닌 것을 넣으면 오류 발생 (나중에 try~cath 처리)
			int s1 = Integer.parseInt(su);

			String res = "";
			if (s1 % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");
			while (true) {
				System.out.println("계속할까요? (Y/N)");
				String msg = scan.next();

				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			}
		}
		System.out.println("수고하셨습니다.");

	}
}
