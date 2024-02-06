package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt();
		// k1 홀수,짝수 판별
		// 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장;
		String result = (k1 % 2 == 0) ? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		System.out.print("점수 : ");
		int k2 = scan.nextInt();
		// 받은 점수가 60점 이상이면 합격 아니면 불합격
		String result2 = (k2 >= 60)  ? "합격" : "불합격" ;
		System.out.println("결과 : " + result2);
		
		
		// 근무시간 8시간 까지는 시간당 9860원이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		
		int dan = 9860;
		int dan1 = (int)(9860 * 1.5);
		
		System.out.print("일한 시간 : ");
		int q1 = scan.nextInt();
		int result3 = (q1 > 8) ? (int)(dan1 *(q1-8)) + (8 * dan) : (dan * q1);		
		System.out.println("일급 : " + result3 + "원");
	}
}
