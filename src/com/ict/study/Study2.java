package com.ict.study;

public class Study2 {
	public static void main(String[] args) {
		
		
		System.out.println(Math.min(65.5, 33.5));
		System.out.println(Math.max(65.5, 33.5));
		System.out.println(Math.round(15.5));
		System.out.println(Math.ceil(7.1));
		System.out.println(Math.floor(7.9));
		System.out.println(Math.random()*10);
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.sqrt(16));
		System.out.println();
		// 이스케이프 문자(제어문자)
		// \n => 줄바꿈, \t => 탭, \' => ', \" => "    "출력시 따옴표나 쌍따옴표 안에서 쓰인다"
		
		
		// 삼향 연산자 : 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장;                 // if-else로 거의 대체 가능할듯?
		// 중첩 삼향 연산자 : 자료형 변수 = (조건식) ? ((조건식) ? 참일때 : 거짓일때) : 거짓일때 실행할 문장 ;
		//              : 자료형 변수 = (조건식) ? 참일때 실행할 문장 : ((조건식2) ? 참일때 : 거짓일때) ;     보통 거짓일때 물어보는 이 형식을 더 많이 씀
		// 단순 if 문 : 조건이 참일때만 실행, 거짓일 경우는 무시한다. 주의사항 : 실행할 문장이 한 줄이면 {}(블록) 생략 가능
		// if ~ else 문 : 즉, 조건식이 참일 때 실행, 거짓일 때 각각 나눠서 처리한다. 주의사항: 한줄은 블록 생략 가능
		// 다중 if 문
		// switch case : 다중 if~else 문과 같은 조건문, 범위지정시엔 if 문이 만들기 빠르고 좋다, int 이하, char, String 일때 사용
		// for 문 : 정해진 규칙에 따라 실행문을 반복 처리 한다. 조건식이 참일 때 실행, 거짓이면 실행하지 않음, 초기식,조건식,증감식이 for 괄호옆에 다 들어감
		// 중첩 for 문 : for 문 안에 또 다른 for 문이 존재하는 것
		// while 문 : for 문과 같은 반복문, while 의 끝을 만나면 조건식으로 이동, 초기식이 바깥에 있고 while 괄호에 조건식 들어감, 마지막 증감식 들어감
		// while 문 무한루프 : while 괄호 옆에 true가 들어가고 if문으로 빠져나갈 조건 break; 만들고 실행내용,증감식으로 마무리
		// do ~ while 문 : while 문과 같은 반복문 (선 처리 후비교), 초기식이 바깥에 있고 실행내용먼저 적고 증감식 오고 마지막 아래 while 괄호에 조건식 들어감    
		// break 와 continue : for 문의 경우 continue 만나면 증감식으로 이동하고 while 문의 경우는 continue 만나면 조건식으로 이동한다.
		//                     보통 if 문과 함께 사용한다.
		// break label : 종료  // continue label : continue 이하 수행문을 포기하고, 레이블이 있는 반복문의 증감식으로 이동
		
		int[] su = {90,80,70,95,65,85,75};
		int[] rank = {1, 1, 1, 1 ,1, 1, 1} ;

		for (int i = 0; i < su.length; i++) {
		    for (int j = 0; j < su.length; j++) {
		        // 자기 자신 제외
		        if(su[i] == su[j]) continue;
		        if(su[i] < su[j]) {
		            rank[i]++;
		        }
		    }
		}

		for (int i = 0; i < rank.length; i++) {
		    System.out.println(rank[i]);
		}
		System.out.println(); 

		
		
		
		
		
		
		
		
		
		
	}
}
