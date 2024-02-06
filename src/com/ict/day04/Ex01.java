package com.ict.day04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 삼향 연산자
		// 형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장;
		
		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1 = 16 ;
		int res = k1 % 2 ;
		
		// 자료형 변수 = (res == 1) ? 참일때 "홀수" : 거짓일때 "짝수";
		// 자료형 변수 = (res == 0) ? 참일때 "짝수" : 거짓일때 "홀수";
		String result = (res == 0) ? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		result = (k1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 57 ;
		String result1 = (k2 >= 60) ? "합격" : "불합격" ;
		System.out.println(k2 + " : " + result1);
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("점수 : ");
//		int k3 = scan.nextInt();
//		String result1 = (k3 >= 60) ? "합격" : "불합격" ;
//		System.out.println(result1);
		
		// k4가 1이면 가격에 0.1 할인(10%) 한다. (얼마에 살 수 있나)
		int k4 = 1 ;
		int price = 1000;
		
		int res2 = (k4 == 1) ? price - (int)(price * 0.1) : price ; // 기본적으로 저장공간 참,거짓 세가지 모두 같아야한다 예)int,long,double등
		int res3 = (k4 == 1) ? price - (price / 10) : price ; 
		int res4 = (k4 == 1) ? (int)(price * 0.9) : price ; 
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		// char k5 = 대문자인지, 대문자가 아닌지 판별하자.
		char k5 = 'Q' ;
		result = (k5 >= 'A' && k5 <= 'Z') ? "대문자" : "대문자 아님" ; 
		System.out.println(result);
		
		// 근무시간 8시간 까지는 시간당 9860원이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		
		int res5 = (time > 8) ? (int)(dan * 1.5 * (time - 8)) + (8 * dan) : time * dan;
		System.out.println(res5);

		
		int time1 = 10;
		int dan1 = 9860;
		int dan2 = (int)(9860 * 1.5);
		
		int res6 = (time > 8) ? (dan2 * (time1 - 8)) + (8 * dan1) : time1 * dan1;
		System.out.println(res6);
		
		
	}
}
