package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if 문
		// 형식) if(조건식){
		//         조건식 1이 참일 때 실행;
		//		   조건식 1이 참일 때 실행;
		// 	   }else if(조건식2){
		//         조건식1에는 거짓이면서 조건식2에는 참일 때 실행;
		//         조건식1에는 거짓이면서 조건식2에는 참일 때 실행;
		// 	   }else if(조건식3){
		//         조건식1,2에는 거짓이면서 조건식3에는 참일 때 실행;
		//         조건식1,2에는 거짓이면서 조건식3에는 참일 때 실행;
		//     }else{
		//		   조건식 1,2,3 이 모든 거짓인 경우;
		//         조건식 1,2,3 뺀 나머지 다
		//     }
		
		// int k1의 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F
		int k1 = 89 ;
		String res = "" ;
		if (k1 >= 90) {
			res = "A학점" ;
		} else if (k1 >= 80) {
			res = "B학점" ;
		} else if (k1 >= 70) {
			res = "C학점" ;
		} else {
			res = "F학점" ;
		}
		System.out.println("학점 결과 : " + res);
		
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '가' ;
		String res1 = "" ;
		if (k2 >= 'A' && k2 <= 'Z') {
			res1 = "대문자" ;
		} else if (k2 >= 'a' && k2 <= 'z') {
			res1 = "소문자" ;
		} else if (k2 >= '0' && k2 <= '9') {  // 숫자 비교할때 '홑따옴표' 써야됨
			res1 = "숫자" ;
		} else {
			res1 = "기타문자" ;
		}
		System.out.println("문자 결과 : " + res1);
		
		
		// char k3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
		char k3 = 'a' ;
		String res2 = "" ;
		if (k3 == 'a' || k3 == 'A') {
			res2 = "아프리카" ;
		} else if (k3 == 'b' || k3 == 'B') {
			res2 = "브라질" ;
		} else if (k3 == 'c' || k3 == 'C') {
			res2 = "캐나다" ;
		} else {
			res2 = "한국" ;
		}
		System.out.println("k3의 국적은 " + res2 + "이다");
		
		
		// menu 가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		int menu = 1 ;
		int input = 10000 ;
		int su = 2 ;
		int dan = 0 ;
		int total = 0 ;
		int vat = 0 ;
		int output = 0 ;
		String drink = "" ;
				
		if (menu == 1) {
			drink = "카페모카" ;
			dan = 3500 ;
			su = 2 ;
			vat = (int)((dan*su) * 0.1) ;
			total = (dan*su) + vat ;
			output = input - total ;
		} else if (menu == 2) {
			drink = "카페라떼" ;
			dan = 4000 ;
			su = 2 ;
			vat = (int)((dan*su) * 0.1) ;
			total = (dan*su) + vat ;
			output = input - total ;
		} else if (menu == 3) {
			drink = "아메리카노" ;
			dan = 3000 ;
			su = 2 ;
			vat = (int)((dan*su) * 0.1) ;
			total = (dan*su) + vat ;
			output = input - total ;
		} else if (menu == 4){
			drink = "과일쥬스" ;
			dan = 3500 ;
			su = 2 ;
			vat = (int)((dan*su) * 0.1) ;
			total = (dan*su) + vat ;
			output = input - total ;
		}
		System.out.println("잔돈 : " + output);
		
		
		menu = 1 ;
		input = 10000 ;
		su = 2 ;
		dan = 0 ;
		total = 0 ;
		vat = 0 ;
		output = 0 ;
		drink = "" ;
		
		if (menu == 1) {
			drink = "카페모카" ;
			dan = 3500 ;
		} else if (menu == 2) {
			drink = "카페라떼" ;
			dan = 4000 ;
		} else if (menu == 3) {
			drink = "아메리카노" ;
			dan = 3000 ;
		} else if (menu == 4) {
			drink = "과일쥬스" ;
			dan = 3500 ;
		}
		// 단가 * 수량
		total = dan * su ;
		vat = (int)(total * 0.1) ;
		output = input - (total + vat) ;
		System.out.println("지불 금액 : " + input);
		System.out.println("선택 음료 : " + drink);
		System.out.println("음료 단가 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("총 금액 : " + (total + vat));
		System.out.println("잔 돈 : " + output);
	}
}
