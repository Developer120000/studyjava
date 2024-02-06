package com.ict.study;

import java.util.Scanner;

public class Study1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// .next() 와 .nextLine() 차이점
		// <.next()>
		// 스페이스,공백 전까지 입력받은 문자열을 리턴한다
		// 버퍼에 입력된 문자나 문자열에서 공백 전까지의 단어를 읽는다
		
		// <.nextLine()>
		// 엔터를 치기 전까지의 입력받은 모든 문자열을 리턴한다

//		System.out.print("문자열 입력 : ");
//		String res = scan.next() ;
//		System.out.println(res);
//		
//		String res1= scan.nextLine() ;
//		
//		System.out.print("문자열 입력 : ");
//		String res2 = scan.nextLine();
//		System.out.println(res2);
		
		int su = 11;
		int su1 = 2;
		double sum = 0;
		sum = (int)(su / (su1 * 1.0) * 10) / 10.0;
		System.out.println(sum);
		
		
		
		
		
		String str = "월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일";
		String q = "banana";
		String w = "Banana";
		int e = 543;
		double r = 346.2155;
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.concat(",1,2,3,4,5,6,7"));
		
		System.out.println(str.contains("화요"));
		
		System.out.println(q.equals(w));
		System.out.println(q.equalsIgnoreCase(w));
		
		System.out.println(String.format("@@ %-10s @@", w));
		System.out.println(String.format("@@ %10d @@", e));
		System.out.println(String.format("@@ %.2f @@", r));
		
		System.out.println(str.indexOf('수'));
		System.out.println(q.indexOf('n'));
		System.out.println(q.lastIndexOf('n'));
		int str1 = str.indexOf("요");
		System.out.println(str1);
		int str2 = str.indexOf("요", str1+1);
		System.out.println(str2);
		int str3 = str.lastIndexOf("요");
		System.out.println(str3);
		int e1 = str.length();
		System.out.println(e1);
		
		System.out.println(str.replace('요', '배'));
		System.out.println(str.replace("요일", "배지밀"));
		
		System.out.println(str.isEmpty());
		
		String str4 = "010-5587-1593";
		System.out.println(str4.substring(9));
		System.out.println(str4.substring(str4.indexOf("-") +1));
		System.out.println(str4.substring(9, 13));
		
		String str5 = "\'****\'";
		System.out.println(str4.replace(str4.substring(9), str5));
		System.out.println(str4.replace(str4.substring(4, 8), str5));
		
		System.out.println(w.toLowerCase());
		System.out.println(w.toUpperCase());
		
		String str6 = str.toString();
		System.out.println(str6);
		
		String t9 = "  java 자바 JAVA  ";
		String t10 = t9.trim();
		
		boolean b1 = t10.startsWith("java"); // true    문자 다안쓰고 j 만써도 true 나옴
		System.out.println(b1);
		boolean b3 = t10.startsWith("자바", 5);
		System.out.println(b3);
		
		boolean b4 = t10.endsWith("JAVA");
		System.out.println(b4);
		
		boolean bo1 = true;
		char ch1 = 'c';
		int num1 = 34;
		long num2 = 37L;
		float num3 = 3.1572f;
		double num4 = 3654.1241;
		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);
		
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg2);
		
		msg = "124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg3 + 10); 
		
		msg = "12345612312";
		long msg5 = Long.parseLong(msg);
		System.out.println(msg5);
		
		msg = "32.14f";
		float msg6 = Float.parseFloat(msg);
		System.out.println(msg6 + 10);
		
		msg = "3.17598";
		double msg7 = Double.parseDouble(msg);
		System.out.println(msg7 + 10);
		
		msg = "A";
		char msg8 = msg.charAt(0);
		System.out.println(msg8 + 1);
		System.out.println((char)(msg8 + 1)); // char 형은 항상 형변환해야 출력시 문자로 보인다.
		
		
		System.out.println(Math.min(65.5, 33.5));
		System.out.println(Math.max(65.5, 33.5));
		System.out.println(Math.round(15.5));
		System.out.println(Math.ceil(7.1));
		System.out.println(Math.floor(7.9));
		System.out.println(Math.random()*10);
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.sqrt(16));
		
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
		// break 와 continue : for 문의 경우 continue 만나면 증감식으로 이동하고 while 문의 경우는 continue 만나면 조건식으로 이동한다. 보통 if 문과 함께 사용한다.
		// break label : 종료  // continue label : continue 이하 수행문을 포기하고, 레이블이 있는 반복문의 증감식으로 이동
		
		
		
		
		
		
		// 위치정보(index, 0부터 시작) 가 숫자로 들어오면 해당 위치에 존재하는 문자를 반환한다.
		
		// 입력된 문자열을 현재문자열과 합친다. ("문자열 + "문자열" 과 같은 결과)
		
		
		//    CharSequence 는 char 값을 순서대로 읽을 수 있다.
		//    문자 하나하나 판별한다 예)욕설이 있는지?
		//	  지금은 String 이라고 생각하자.
		//	  입력된 String 을 넣어주면 해당 문자열에 입력된 String 이 존재하면 true, 존재하지 않으면 false
		
		//	  입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별 O)
		
		//	  입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별 X)
		
		// 형식을 지정하고 형식에 맞춰서 생성
		// %s
		// %d
		// %f
		
		//    입력된 문자(ch), 문자열(str)의 위치값을 알려준다.
		//	  문자나 문자열이 없으면 -1 반환한다.
		
		// 2번째, 3번째 문자 나 글자를 찾기 위함
		
		// 마지막 문자나 문자열을 찾을 때 사용
		
		// 문자열의 길이를 구한다. (1 부터 시작한다.)
		
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.
		
		// 해당 문자열이 비어 있으면 true, 내용이 있으면 false;
		
		
		//     입력된 시작위치 부터 문자열 추출
		//     입력된 시작위치 부터 입력된 끝위치 전까지 문자열 추출 (끝위치는 포함하지 않는다.)
		
		// 해당 문자열을 모두 소문자로 변경
		// 해당 문자열 모두 대문자로 변경
		
		// 모든 객체(클래스) 에서 사용가능
		// 객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		// 문자열로 만들어서 반환하는 메서드
		
		
		
	}
}
