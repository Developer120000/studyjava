package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어90, 영어80, 수학 80 이다.
		// 총점과 평균을 구하자
		// 출력을 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
		
		
		String s1 = "홍길동"; //이름
		int su1 = 90; // 국어
		int su2 = 80; // 영어
		int su3 = 80; // 수학
		
		// 요구사항 (처리 = 비즈니스로직)
		
		int sum = su1+su2+su3 ; // 총점
		double avg = (int)(sum / 3.0 * 10) / 10.0 ; //평균 //소수점 첫째자리까지 남기려면 10 먼저 곱하고 100을 나눈다.
		double avg2 = (int)(sum / 3.0 * 100) / 100.0 ; //평균 //소수점 둘째자리 남기려면 100을 먼저 곱하고 100을 나눈다.
		
		System.out.println("이름 : " + s1);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		
		// 끝의 5원을 버리고자 한다.
		int k1 = (198745/10) * 10 ; //일의자릿수 버리려면 10을 먼저 나누고 10을 곱한다
		int k2 = (198745/100) * 100; //십의자릿수 버리려면 100을 먼저 나누고 100을 곱한다
		System.out.println(k1);
		System.out.println(k2);
	}
}
