package com.ict.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// String 으로 숫자 받아서 Integer 사용, equals 사용

		esc: while (true) {
			try {
				System.out.println("숫자 입력 : ");
				String su = scan.next();
				// 숫자가 아닌 것을 넣으면 오류 발생 (try ~ catch 예외처리)
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
				} // 안 while

			} catch (NumberFormatException e) {
				System.out.println("문자를 입력하면 안돼요");
			}
			System.out.println("밖 while 전");
		} // 밖 while
		System.out.println("수고하셨습니다.");

	}
}
