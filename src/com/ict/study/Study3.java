package com.ict.study;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0; // 총 횟수
		int sum2 = 0; // 이긴 횟수
		double avg = 0; // 승률
		String q = ""; // 내 가위바위보
		String w = ""; // 컴퓨터 랜덤
		String e = ""; // 승부
		int r1 = 0; // 내 가위바위보 숫자

		
		esc: while (true) {
			sum++;
			System.out.println("가위바위보!");
			q = scan.next();
			int k = (int)(Math.random() * 3);
			
			if (k == 0) {        // 컴퓨터 변환
				w = "가위";
			} else if (k == 1) {
				w = "바위";
			} else if (k == 2) {
				w = "보";
			} 
			
			if (q == "가위") {     // 사람 변환
				r1 = 0;
			} else if (q == "바위") {
				r1 = 1;
			} else if (q == "보") {
				r1 = 2;
			}
				
			System.out.println(w);
			if (r1 == 0) {
				if (k == 2) {
					e = "You win";
					sum2++;
				} else if (k == 1) {
					e = "You lose";
				} else if (k == 0) {
					e = "무승부";
				}
				System.out.println(e);
			}
			else if (r1 == 1) {
				if (k == 0) {
					e = "You win";
					sum2++;
				} else if (k == 2) {
					e = "You lose";
				} else if (k == 1) {
					e = "무승부";
				}
				System.out.println(e);
			}
			else if (r1 == 2) {
				if (k == 1) {
					e = "You win";
					sum2++;
				} else if (k == 0) {
					e = "You lose";
				} else if (k == 2) {
					e = "무승부";
				}
				System.out.println(e);
			}
			while (true) {
				System.out.println("더 도전하시겠습니까? (y/n)");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (str.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			}
		}
		avg = (int)(sum2 / (sum * 1.0) * 100 * 10) / 10.0;
		System.out.println("수고하셨습니다");
		System.out.println("총 횟수 : "+ sum);
		System.out.println("이긴 횟수 : "+ sum2);
		System.out.println("승률 : " + avg + "%");
	}
}
