package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름이 국어, 영어, 수학  점수를 키보드로 입력 받아서
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 둘째자리 까지 구하자)
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("이름 : ");
//		String name = scan.next();
//		
//		System.out.print("국어 : ");
//		int score = scan.nextInt();
//		System.out.println("국어 점수 : " + score);
//
//		System.out.print("영어 : ");
//		int score1 = scan.nextInt();
//		System.out.println("영어 점수 : " + score);
//		
//		System.out.print("수학 : ");
//		int score2 = scan.nextInt();
//		System.out.println("수학 점수 : " + score);
//		
//		int c1 = score + score1 + score2 ;
//		double c2 = (int)(c1 / 3.0 * 100) / 100.0;
//		System.out.println("이름 : " + name);
//		System.out.println("총점 : " + c1);
//		System.out.println("평균 : " + c2);
		
		
		
		System.out.print("이름 : ");
		String name1 = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
	
		System.out.print("수학 : ");
		int math = scan.nextInt();
	
		// 요구사항 구하기
		// 처리 = 비즈니스로직
		
		int sum = kor + eng + math ;
		double avg = (int)(sum / 3.0 *100) / 100.0 ;
		
		//출력
		System.out.println("이름 : " + name1);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
