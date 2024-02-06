package com.ict.day04;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼향 연산자 : 삼향 연산자 안에 삼향 연산자가 존재
		// 형식) 자료형 변수 = (조건식) ? ((조건식) ? 참일때 : 거짓일때) : 거짓일때 실행할 문장 ;
		// 형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : ((조건식2) ? 참일때 : 거짓일때) ;  보통 거짓일때 물어보는 이 형식을 더 많이 씀
		
		//int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		int k1 = 80 ;
		String result = (k1 >= 90) ? "A학점" : ((k1 >=80) ? "B학점" : "F학점") ;
		System.out.println("결과 : " + result);
		
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("점수 : ");
		int k2 = scan.nextInt();
		String result2 = (k2 >= 90) ? "A" : (k2 >= 80) ? "B" : "F" ;
		System.out.println("학점 : " + result2);
		
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char k3 = 'd' ;
		String res = (k3 >= 'A' && k3 <= 'Z') ? "대문자" : (k3 >= 'a' && k3 <= 'z') ? "소문자" : "기타문자" ; 
		System.out.println(res);
		
//		System.out.println("알파벳 : ");
//		char res1 = scan.next();
//		String result3 = (res1 >= 'a' && res1 <= 'z') ? "소문자" : (res1 >= 'A' && res1 <= 'Z') ? "대문자" : "기타문자" ;
//		System.out.println("알파벳 : " + res1 + "는" + result3 + "입니다");
		
		
		// int k4가 1 또는 3 이면 남자, 나머지 여자
		int k4 = 1 ;
		String result4 = ((k4 == 1) || k4 == 3) ? "남자" : "여자" ;
		System.out.println(result4);
		//스캐너 활용
		System.out.print("주민 뒤 1번째 : ");
		int k5 = scan.nextInt();
		String result5 = ((k5 == 1) || k5 == 3) ? "남자" : "여자" ;
		System.out.println("당신은 " + result5 + "입니다");
		
		
		//int k4 가 1 또는 3이면 남자
		//         2 또는 4이면 여자
		int t1 = 2;
		String result6 = ((t1 == 1 || t1 == 3) ? "남자" : (t1 == 2 || t1 == 4) ? "여자" : "외국인") ;
		System.out.println(result6);
		
		
		//int k6 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		//         2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자
		int k6 = 1;
		String result7 = (k6 == 1 || k6 == 3) ? ((k6 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자") :
		                 ((k6 == 2 || k6 == 4) ? ((k6 == 2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자") : "외국인");
		System.out.println(result7);
		//스캐너 활용
		System.out.print("주민 뒷자리 : ");
		int k7 = scan.nextInt();
		String result8 = (k7 == 1 || k7 == 3) ? ((k7 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자") :
			             ((k7 == 2 || k7 == 4) ? ((k7 == 2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자") : "외국인") ;
		System.out.println("당신은 " + result8 + "입니다");
		
		
		// 두 수 중 큰 수를 구하자
		int su1 = 14 ;
		int su2 = 9 ;
		int result9 = (su1 > su2) ? su1 : su2 ;
		System.out.println("결과 : " + result9);
		
		int res2 = Math.max(su1, su2);
		System.out.println(res2);
		
	}
}
