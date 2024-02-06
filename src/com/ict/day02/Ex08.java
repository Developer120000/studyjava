package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		//  산술연산자 : + , - , * , /
		// 대상 : char, int, long, double, float
		//      문자형, 정수형, 실수형
		int su1 = 9 ;
		int su2 = 4 ;
		int result = 0 ; // 결과를 저장하는 놈
		result = su1 + su2 ;
		System.out.println("결과 : " + result); // 결과는 나오지만 답만 나옴
		// 결과를 답이아니라 식 전체를 보는방법
		System.out.println("결과 : 9 + 4 = " + result); // 식은 나오지만 나중에 변수값이 변하게되면 일일이 다 변경해야해서 귀찮음
		System.out.println("결과 : su1 + su2 = " + result); // 쌍따옴표 안에 있어서 문자로 나옴
		System.out.println("결과 : " + su1 + "+" + su2 + "=" + result);
		// 변수들은 가두지말고 식들을 가둬서 변수가 변하더라도 일일이 변경할 필요 없는 효율적인 방법
		
		result = su1 - su2 ;
		System.out.println("결과 : " + su1 + "-" + su2 + "=" + result);
		
		result = su1 * su2 ;
		System.out.println("결과 : " + su1 + "*" + su2 + "=" + result);
				
		// 정수와 정수가 산술연산을 하면 정수가 된다.
		result = su1 / su2 ; // 정수끼리 나눈 값은 몫이라 한다.
		System.out.println("결과 : " + su1 + "/" + su2 + "=" + result);	
		
		result = su1 % su2 ;
		System.out.println("결과 : " + su1 + "%" + su2 + "=" + result);
		
		double result2 = su1 / su2 ;
		System.out.println("결과 : " + su1 + "/" + su2 + "=" + result2);
		
		// 정수와 실수가 산술연산을 하면 겨과는 실수가 된다.
		// 정수에 1.0을 곱하면 실수가 된다.
		// 실수로 만든 후 double 로 넘기면 소수점이 나온다
		double result3 = su1 / (su2 * 1.0) ;
		System.out.println("결과 : " + su1 + "/" + su2 + "=" + result3);
		
		// 나머지 //많이 사용됨
		result = su1 % su2 ;
		System.out.println("결과 : " + su1 + "%" + su2 + "=" + result);
	}
}
