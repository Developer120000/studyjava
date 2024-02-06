package com.ict.day03;

public class Ex02 {
	public static void main(String[] args) {
		// 비교연산자 : >, <, >=, <=, ==(같다), !=(다르다, 같지않다)
		// 비교연산자를 사용할 수 있는 기본 자료형 : 문자형, 정수형, 실수형
		// 비교연산 결과는 무조건 논리형이다.
		// 논리형(boolean)은 기본적으로 조건식에 사용된다.
		
		int su1 = 90 ;
		int su2 = 80 ;
		// 정수끼리 비교
		boolean result = su1 > su2 ; // 비교연산자를 사용했으면 논리형에 저장해야 한다.
		System.out.println(result);
		
		double su3 = 97.4 ;
		double su4 = 89.0 ;
		// 실수끼리 비교
		result = su3 > su4 ;
		System.out.println(result);
		
		// 정수와 실수 비교 가능
		result = su1 > su4 ;
		System.out.println(result);
		
		char su5 = 'a'; //문자형도 숫자로 저장되기 때문에 비교연산이 가능하다
		char su6 = 'A';
		// 문자끼리 비교
		result = su5 > su6 ;
		System.out.println(result);
		
		// 정수 와 문자 비교
		result = su1 > su5 ;
		System.out.println(result);
	}
}
