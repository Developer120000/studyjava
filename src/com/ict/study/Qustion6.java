package com.ict.study;

import java.util.Iterator;
import java.util.Scanner;

public class Qustion6 {
	public static void main(String[] args) {
		// do~while 문, break 와 continue, 다중 for 문 break 와 continue, break 와 break label,
		// continue 와 continue label
		// 이스케이프 문자(제어문자)
		// \n => 줄바꿈, \t => 탭, \' => ', \" => "    "출력시 따옴표나 쌍따옴표 안에서 쓰인다"
		
		// 0-10 까지 출력
		
		
		// 0-10 짝수 출력
		int q = 0;
		do {
			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		} while (q < 11);
		
		// 1-10 까지 출력 6에서 break 사용  // 출력을 나중에
		int q1 = 1;
		do {
			if (q1 == 6) break;
			System.out.println(q1);
			q1++;
		} while (q1 < 11);
		
		// 1-10 까지 출력 6에서 break 사용   // 출력을 먼저
		int q2 = 1;
		do {
			System.out.println(q2);
			if (q2 == 6) break;
			q2++;
		} while (q2 < 11);
		
		
		// 1-10 까지 출력 6에서 continue 사용
		int q3 = 0;
		do {
			q3++;
			if (q3 == 6) continue;{
			System.out.print(q3);
			}
			
		} while (q3 < 11);
		System.out.println();
		
		
		// 1-10 까지 출력 6에서 continue 사용  // 출력을 먼저 // 출력이 먼저 오면 쓸모가 없음

		
		// 1-10 까지 짝수만 출력

		
		// 다중 for 문 break 와 continue 개념파악
				
		// 1-10 출력 (break)
		
		// 1-10 출력 (break label)

		// 1-10 출력
		
		// 숫자를 받아서 홀수 인지 짝수 인지 출력
		Scanner scan = new Scanner(System.in);
		

		String str1 = "";
		
//		esc: while (true) {
//			System.out.println("숫자 입력 : ");
//			int str = scan.nextInt();
//			
//			if (str % 2 == 0) 
//				str1 = "짝수";
//			if (str % 2 == 1)
//				str1 = "홀수";
//			System.out.println(str1+"입니다.");
//			while (true) {
//				System.out.println("계속할까요? 1.yes, 2.no");
//				int str2 = scan.nextInt();
//				if (str2 == 1) break;
//				if (str2 == 2) break esc;
//				System.out.println("제대로 입력하세요");
//			}
//		}
//		System.out.println("수고하셨습니다");
		
		
		
		// 숫자 받아서 전체횟수, 짝수횟수, 확률 퍼센트(소수점 첫자리)
		String str3 = "";
		int e = 0;
		int e1 = 0;
		
		esc: while (true) {
			System.out.println("숫자 입력 : ");
			int str4 = scan.nextInt();
			e++;
			if (str4 % 2 == 0) {
				str3 = "짝수";
				e1++;}
			if (str4 % 2 == 1) 
				str3 = "홀수";
			System.out.println(str3+"입니다.");
			while (true) {
				System.out.println("계속할까요? 1.yes, 2.no");
				int str5 = scan.nextInt();
				if (str5 == 1) break;
				if (str5 == 2) break esc;
				System.out.println("제대로 입력하세요");
			}
		}
		double e2 = (e1 / (e * 1.0)) * 100 ;
		System.out.println("수고하셨습니다");
		System.out.println("전체 횟수 : " + e);
		System.out.println("짝수 횟수 : " + e1);
		System.out.println("확률 : " + String.format("%.2f", e2)) ;
		System.out.println("확률 : " + Math.round(e2)) ;
		
		
		//버리기 확인
		
//		int sum = su1+su2+su3 ; // 총점
//		double avg = (int)(sum / 3.0 * 10) / 10.0 ; //평균 //소수점 첫째자리까지 남기려면 10 먼저 곱하고 100을 나눈다.
//		double avg2 = (int)(sum / 3.0 * 100) / 100.0 ; //평균 //소수점 둘째자리 남기려면 100을 먼저 곱하고 100을 나눈다.
//		
//		System.out.println("이름 : " + s1);
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);
//		System.out.println("평균 : " + avg2);
//		
//		// 끝의 5원을 버리고자 한다.
//		int k1 = (198745/10) * 10 ; //일의자릿수 버리려면 10을 먼저 나누고 10을 곱한다
//		int k2 = (198745/100) * 100; //십의자릿수 버리려면 100을 먼저 나누고 100을 곱한다
//		System.out.println(k1);
//		System.out.println(k2);
	}
}
