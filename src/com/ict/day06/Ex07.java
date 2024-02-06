package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 전체횟수, 짝수횟수, 확률 퍼센트(소수점 첫자리)
//		int su = 0 ; //전체
//		int su1 = 0 ; //짝수
//		int su2 = 0 ; //홀수
//		double sum = 0 ; //확률
//		
//		esc: while (true) {
//			String res = "";
//			
//			System.out.println("숫자 입력 : ");
//			int k1 = scan.nextInt();
//			
//			if (k1 % 2 == 0) {
//				res = "짝수";
//				++su1 ;
//			} else {
//				res = "홀수";
//				++su2 ;
//			}
//			System.out.println(k1 + "는 "+res+"입니다.");
//			while (true) {
//				System.out.println("계속할까요?(1.yes, 2.no) >>");
//				int res2 = scan.nextInt();
//				if (res2 == 1) continue esc;
//				if (res2 == 2) break esc;
//				System.out.println("제대로 입력하세요");
//			}
//		}
//		su = su1 + su2;
//		sum = (int)(su1 / su) * 100.0;
//		System.out.println(sum);
//		System.out.println("전체 횟수 : "+su);
//		System.out.println("짝수 횟수 : "+su1);
//		System.out.println("짝수 확률 : "+ sum + "%");
//		System.out.println("수고하셨습니다");

		
		
		
		int count = 0; // 전체 횟수
		int even = 0; // 짝수 횟수
		esc:while (true) {
			count ++ ;
			System.out.print("숫자 입력 : ");
			int su3 = scan.nextInt();
			String result = "";
			if (su3 % 2 == 0) {
				even ++ ;
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(su3 + "는 " + result + " 입니다.");
			while (true) {
				System.out.println("계속할까요?(1.yes, 2.no) >>");
				int res = scan.nextInt();
				if (res == 1) continue esc;
				if (res == 2) break esc;
				
				System.out.println("제대로 입력하세요");
			}
		}
		System.out.println("수고 하셨습니다.");
		double per = (even / (count * 1.0)) * 100 ;
		System.out.println(per);
		System.out.println("전체 횟수 : " + count);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("퍼센트 : " + ((int)(per*100)/100.0) + "%");
		
		
	}
}
