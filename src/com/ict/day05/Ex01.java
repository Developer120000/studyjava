package com.ict.day05;

public class Ex01 {
	private static final char A = 0;

	public static void main(String[] args) {
		// switch case : 다중 if~else 문과 같은 조건문
		// if 문 조건식 boolean 형, 즉 비교연산, 논리연산, boolean 형일때
		// switch 문 인자값이 int 이하, char, String 일때 사용
		//			 long, 실수형일때 사용 불가
		// 형식) switch(인자값 = int, char, String){
		//			case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장 ; break;
		//			case 조건값2 : 인자값과 조건값2이 같을 때 수행할 문장 ; 
		//			             인자값과 조건값2이 같을 때 수행할 문장 ; break; 
		//			case 조건값3 : 인자값과 조건값3이 같을 때 수행할 문장 ; break;
		//			default : 조건값 1,2,3 모두 같지 않을 때 수행할 문장;
		//		  }
		// **주의사항 : break 가 없으면 break 를 만날 때 까지 모든 실행문을 실행한다.
		// break 문의 역활은 현재 실행 중인 범위({}블록) 를 벗어나는 역활을 한다.
		// default 는 생략 가능
		// 범위지정시엔 if 문이 만들기 빠르고 좋다
		
		
		// int k1 이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스
		
		int k1 = 1 ;
		String menu = "" ;
		
		if (k1 == 1) {
			menu = "카페모카" ;
		} else if (k1 == 2) {
			menu = "카페라떼" ;
		} else if (k1 == 3) {
			menu = "아메리카노" ;
		} else if (k1 == 4) {
			menu = "과일쥬스" ;
		}
		System.out.println("메뉴 : " + menu);
		System.out.println();
		
		
		// if 문 은 위에 조건부터 걸러서 찾기때문에 속도가 느리다. switch 문은 바로 맞는걸 찾아가서 속도가 빠르다.
		// break 만나면 현재 있는 블록에서 빠져나간다 break 가 없으면 다음 break 나 중괄호를 만날때까지 실행된다.
		switch (k1) {
		case 1: System.out.println("카페모카"); break ;
		case 2: System.out.println("카페라떼"); break ;
		case 3: System.out.println("아메리카노"); break ;
		case 4: System.out.println("과일쥬스"); break ;
		}
		
		// char k2가 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k2 = 'B';
		String res = "" ;
		
		switch (k2) {
		case 'A' : res = "아프리카";
		           break ;
		case 'B' : res = "브라질"; 
		           break ;
		case 'C' : res = "캐나다"; 
		           break ;
		default: res = "한국"; 
		           break ;
		}
		System.out.println("결과 : " + res);
		
		
		// char k3 가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		char k3 = 'A' ;
		String res1 = "";
		
		switch (k3) {
		case 'a' : res1 = "아프리카";
				   break ;
		case 'A' : res1 = "아프리카";
		           break ;
		case 'b' : res1 = "브라질";
		           break ;
		case 'B' : res1 = "브라질";
		           break ;
		case 'c' : res1 = "캐나다";
		           break ;
		case 'C' : res1 = "캐나다";
		           break ;
		default: res1 = "한국";
		}
		System.out.println("결과 : " + res1);
		
		// char k4 가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		// 결과 값이 같은면 break 를 이용해서 하나만 두고 지워도 된다. or 관계가 된다
		char k4 = 'b' ;
		String res2 = "";
		
		switch (k4) {
		case 'a' : 
			
		case 'A' : res2 = "아프리카";
				break ;
		case 'b' : 
			
		case 'B' : res2 = "브라질";
				break ;
		case 'c' : 
			
		case 'C' : res2 = "캐나다";
				break ;
		default: res2 = "한국";
		}
		System.out.println("결과 : " + res2);
		
		// String k5 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		String k5 = "미국";
		String res3 = "";
		
		switch (k5) {
		case "한국" : res3 = "서울" ;
				break;
		case "중국" : res3 = "베이징" ;
				break;
		case "일본" : res3 = "도쿄" ;
				break;
		case "미국" : res3 = "워싱턴" ;
				break;
		}
		System.out.println("결과 : " + res3);
		
		// switch 문 범위가 넓어지면 사용하지 말자 (if 문 사용하자)
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		
		int k6 = 65 ;
		String res4 = "";
		// 범위가 넓으면 하나한 작성하기 힘들어서 if 문 사용하자
//		switch (k6) {
//			case 100 : break;
//			case 98 : break;
//			case 97 : break;
//
//			default:
//				break;
//		}
		
		// 굳이 switch 문 사용한다면 10을 나눠서 이 방법을 사용할 수도 있다.
		switch ((int)(k6/10)) {
			case 10 :
			case 9 : res4 = "A" ; break ;
			case 8 : res4 = "B" ; break ;
			case 7 : res4 = "C" ; break ;
			default: res4 = "F" ; break ;
		}
		System.out.println("결과 : " + res4);
		
		// if 문 사용
		if (k6 >= 90) {
			res4 = "A" ;
		} else if (k6 >= 80) {
			res4 = "B" ;
		} else if (k6 >= 70) {
			res4 = "C" ;
		} else {
			res4 = "F" ;
		}
		System.out.println("학점 : " + res4);
		
	}
}
	