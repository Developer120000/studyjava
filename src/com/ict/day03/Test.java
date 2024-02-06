package com.ict.day03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		String 클래스에서 .next() 와 .nextLine() 는 키보드에 입력된 내용을 String으로 저장 시키는 역할을 한다.
//		.next() 와 .nextLine() 의 차이점을 알아 보기  (01/05 까지)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name1 = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
	
		System.out.print("수학 : ");
		int math = scan.nextInt();
//	
//		// 요구사항 구하기
//		// 처리 = 비즈니스로직
//		
//		int sum = kor + eng + math ;
//		double avg = (int)(sum / 3.0 *100) / 100.0 ;
//		
//		//출력
//		System.out.println("이름 : " + name1);
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);

		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("국어 : ");
		int name2 = scan.nextInt();
		
		System.out.print("영어 : ");
		String name3 = scan.nextLine();
		
		System.out.print("수학 : ");
		String name4 = scan.nextLine();
		
		
	}
}
