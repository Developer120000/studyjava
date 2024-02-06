package com.ict.study;

import java.util.Iterator;

public class Qustion5 {
	public static void main(String[] args) {
		// switch case, for 문, 중첩 for 문, while 문, while 무한루프, 
		
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
		
		// 다른방법
		int k2 = 3;
		switch (k2) {
		case 1: menu = "카페모카"; break; 
		case 2: menu = "카페라떼"; break; 
		case 3: menu = "아메리카노"; break;
		case 4: menu = "과일쥬스"; break; 
		}
		System.out.println(menu);
		System.out.println();
		
		// char k2가 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k3 = 'c';
		switch (k3) {
		case 'a' : menu = "아프리카"; break;
		case 'b' : menu = "브라질"; break;
		case 'c' : menu = "캐나다"; break;
		default: menu = "한국"; 
		}
		System.out.println(menu);
		System.out.println();
		
		// char k3 가 A이거나 a이면 한국 B이거나 b이면 캐나다 C이거나 c이면 브라질 나머지 아프리카
		if (k3 == 'a'|| k3=='A') {
			menu = "한국";
		} else if (k3=='b'||k3=='B') {
			menu = "캐나다";
		} else if (k3=='c'||k3=='C') {
			menu = "브라질";
		} else{
			menu = "아프리카";
		}
		System.out.println(menu);
		System.out.println();
		
		// char k4 가 A이거나 a이면 아프리카 B이거나 b이면 브라질 C이거나 c이면 캐나다 나머지 한국
		// 간략방법
		char k4 = 'b';
		switch (k4) {
		case 'a':  
		case 'A': menu = "아프리카"; break;
		case 'b': 
		case 'B': menu = "브라질"; break;
		case 'c': 
		case 'C': menu = "캐나다"; break;
		default:
			menu = "한국";
		}
		System.out.println(menu);
		System.out.println();

		// String k5 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		String k5 = "일본";
		switch (k5) {
		case "한국":	menu = "서울"; break;
		case "중국":	menu = "베이징"; break;
		case "일본":	menu = "도쿄"; break;
		case "미국":	menu = "워싱턴"; break;
		}
		System.out.println(menu);
		System.out.println();
		
		if (k5 == "미국") {
			menu = "워싱턴";
		} else if (k5 == "한국") {
			menu = "서울";
		} else if (k5 == "중국") {
			menu = "베이징";
		}else {
			menu = "도쿄";
		}
		System.out.println(menu);
		System.out.println();
		
		
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F

		// 10-20 출력
		for (int i = 10; i < 21; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		int k6 = 10;
		while (k6 < 21) {
			System.out.print(k6+" ");
			k6++;
		}
		System.out.println();
		System.out.println();
		
		int k7 = 10;
		while (true) {
			if (k7 > 20) break;
			System.out.print(k7+ " ");
			k7++;
		}
		
		System.out.println();
		System.out.println();
		
		// 10-20 까지 짝수만 출력
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 10-20 까지 짝수만 출력 (다른방법)
		int k8 = 10;
		while (k8 < 21) {
			if (k8 % 2== 0) {
			System.out.print(k8 + " ");
			}
			k8++;
		}
		System.out.println();
		System.out.println();
		
		int k9 = 10;
		do {
			if (k9 % 2==0) {
				System.out.println(k9+" ");
			}
			k9++;
		} while (k9 < 21);
		System.out.println();
		
		
		// 10-20 까지 홀수만 출력
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 1) {
				System.out.println(i+" ");
			}
		}
		System.out.println();
		
		// 10-20 까지 홀수만 출력 (다른방법)
		int q = 10;
		while (q <21) {
			if (q % 2 ==1) {
				System.out.println(q+" ");
			}
			q++;
		}
		System.out.println();
		
		// 5단 출력
		for (int i = 1; i < 10; i++) {
			for (int j = 5; j < 6; j++) {
				System.out.println(j +"*"+i+"="+j*i);
			}
		}
		int q1 = 5;
		int q2 = 1;
		while (q2 < 10) {
			System.out.println(q1+"*"+q2+"="+q1*q2);
			q2++;
		}
		System.out.println();
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		
		int q3 = 0;
		while (q3 < 4) {
			System.out.println("0000");
			q3++;
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}

		// 0-10 의 누적합 (합계 구하기)
		int q4 = 0;
		for (int i = 0; i < 11; i++) {
			q4 = q4 + i;
		}
		System.out.println(q4);
		System.out.println();
		
		int q5 = 0;
		int q6 = 0;
		while (q5 < 12) {
			q6 = q6+q5;
			q5++;
		}
		System.out.println(q6);
		System.out.println();
		
		// 0-10 홀수의 합계, 짝수의 합계를 각각 구하자
		
		
		// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1) 의 합은?
		int q7 = 1;
		for (int i = 1; i < 8; i++) {
			q7 = q7 * i;
		}
		System.out.println(q7);
		System.out.println();
		
		int q8 = 1;
		int q9 = 1;
		while (q8 < 8) {
			q9 = q8 * q9;
			q8++;
		}
		System.out.println(q9);
		System.out.println();
		
		// 구구단 세로
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		System.out.println();
		
		
		// 구구단 가로

		// 구구단 가로세로

		// 이중 for 문
				
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1

		
		// 0-10 출력 while

		// 10-20 까지 짝수만 출력


		// 0-10 까지 출력 while 무한루트
		int w1 = 0;
		while (true) {
			if (w1 > 10) break;{
				System.out.println(w1);
			}
			w1++;
		}
		System.out.println();
		

		// 10-20 까지 짝수만 출력
		int w2 = 10;
		while (true) {
			if (w2 > 20) break;{
				if (w2 % 2 == 0) {
					System.out.print(w2);
				}
				w2++;
			}
		}
		System.out.println();
		
		// a - h 까지 출력 (while 무한루프 버전)
		char w3 = 'a';
		while (true) {
			if (w3 > 'h') break; {
				System.out.println(w3);
			}
			w3++;
		}
		System.out.println();
		
		// a - h 까지 출력 (그냥 while 문)
		char w4 = 'a';
		while (w4 < 'i') {
			System.out.println(w4);
			w4++;
		}
		
		
		
		
	}
}
