package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else 문
		// 삼향연산자와 비슷하게 처리
		// 즉, 조건식이 참일 때 실행, 거짓일 때 각각 나눠서 처리한다.
		// 주의사항) 한줄은 블록 생략 가능
		// if(조건식){
		//    조건식이 참일 때 실행 ;
		//    조건식이 참일 때 실행 ;
		//    조건식이 참일 때 실행 ;
		// }else{
		//    조건식이 거짓일 때 실행 ;
		//    조건식이 거짓일 때 실행 ;
		//    조건식이 거짓일 때 실행 ;
		// }
		
		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수
		int k1 = 16 ;
		String res = "" ; // 초보자때는 선언만 하지말고 초기값을 지정해주자
		if (k1 % 2 == 0) {
			res = "짝수" ;
		} else {
			res = "홀수" ;
		}
		System.out.println("k1는 " + res + "입니다.");
		
		// int k2가 60 이상이면 합격, 아니면 불합격
		int k2 = 70 ;
		String res1 = "" ;
		if (k2 >= 60) {
			res1 = "합격" ;
		} else {
			res1 = "불합격" ;
		}
		System.out.println("k2는 " + res1 + "입니다.");
		
		// k3 가 1이면 가격에 0.1 할인(10%) 한다.(얼마에 살 수 있나)
		int k3 = 1 ;
		int price = 1000 ;
		int res2 = 0 ;
		if (k3 == 1) {
			res2 = (int)(price * 0.9)  ;
		} else {
			res2 = price ;
		}
		System.out.println("구매가격 : " + res2);
		
		
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자.
		char k4 = 'A' ;
		String res3 = "" ;
		if (k4 >= 'A' && k4 <= 'Z') {
			res3 = "대문자" ;
		} else {
			res3 = "대문자 아님" ;
		}
		System.out.println("k4 : " + res3);
		
		// 근무시간이 8시간 까지는 시간당 9860 이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time = 10 ;
		int dan = 9860 ;
		int res4 = 0 ;
		int limit = 8 ;
		if (time > 8) {
			res4 = ((time - limit) * (int)(dan * 1.5)) + (dan * limit) ;
		} else {
			res4 = time * dan ;
		}
		System.out.println("일급 : " + res4);
		
		
		
		
		
	}
}
