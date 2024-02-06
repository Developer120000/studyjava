package com.ict.study;

import java.util.Scanner;

public class Qustion4 {
	public static void main(String[] args) {
		// 삼향 연산자, Scanner scan, 중첩 삼향 연산자, if 문, if-else 문, 다중 if 문
		
		
		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 59;
		String res = "";
		
		if (k2 >= 60) {
			res = "합격";
		} else {
			res = "불합격";
		}
		System.out.println(res);
		System.out.println();
		
		res = (k2 >= 60) ? "합격" : "불합격";
		System.out.println(res);
		
		
		// k4가 1이면 가격에 0.1 할인(10%) 한다. (얼마에 살 수 있나)
		int k4 = 1;
		int z1 = 1000;
		int chd = (k4 == 1) ? (int)(z1 * 0.9) : z1;
		System.out.println(chd);
		
		// char k5 = 대문자인지, 대문자가 아닌지 판별하자.
		char k5 = 'a';
		String q = (k5 >= 'a' && k5 <= 'z') ? "소문자" : "소문자아님";
		System.out.println(q);
		
		// 근무시간 8시간 까지는 시간당 9860원이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int c = 9860;
		int c1 = (int)(9860 * 1.5);
		int dlf = 10;
		int re = 0;
		re = (dlf > 8) ? (dlf-8) * c1 + c * 8 : dlf * c;
		System.out.println(re);
		
		
		// k1 홀수,짝수 판별
		int k1 = 1;
		String q1 = (k1 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(q1);
		
		
		// 받은 점수가 60점 이상이면 합격 아니면 불합격
		int j1 = 72;
		String q2 = (j1 < 60) ? "합격" : "불합격";
		System.out.println(q2);
		
		
		// 근무시간 8시간 까지는 시간당 9860원이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("일한 시간?");
		int q3 = scan.nextInt();
		
		int c2 = 9860;
		int c3 = (int)(9860 * 1.5);
		int j2 = (q3 > 8) ? (q3-8) * c3 + 8*c2 : q3*c2;
		System.out.println("급여 : "+j2);
		
		//int k3이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		int k3 = 77; 
		String q4 = (k3 >= 90) ? "A" : (k3 >= 80) ? "b" : (k3 >= 70) ? "c" : "f"; 
		System.out.println(q4);
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하자
		char a = 'D';
		String q5 = (a >= 'A' && a <='z') ? "대문자" : (a >= 'a' && a <= 'z') ? "소문자" : "기타문자";
		System.out.println(q5);
		
		// int k4가 1 또는 3 이면 남자, 나머지 여자
		int l4 = 1;
		String a1 = (l4 == 1 || l4 ==3) ? "남자" : "여자";
		System.out.println(a1);
		
		//int k4 가 1 또는 3이면 남자
		//         2 또는 4이면 여자
		int l = 4;
		String a2 = (l == 1 || l == 3) ? "남자" : (l == 2 || l == 4) ? "여자" : "외국인";
		System.out.println(a2);
		
		//int k6 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		//         2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 여자
		//스캐너 활용
		System.out.println("뒷자리 : ");
		int l1 = scan.nextInt();
		
		String l2 = (l1 == 1 || l1 == 3) ? (l1 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자" :
			        (l1 == 2 || l1 == 4) ? (l1 == 2) ? "1900년대 태어난 여자" : "2000년대 태어난 여자" : "외국인";
		System.out.println(l2);
		
		
		
		// 두 수 중 큰 수를 구하자
		int p1 = 15;
		int p2 = 23;
		String p3 = (p1 > p2) ? "p1" : "p2";
		System.out.println("큰수는 "+p3);
		
		int p4 = Math.max(p1, p2);
		System.out.println(p4);
		
		// int k1이 60이상 합격
		int t = 24;
		String t1 = (t >= 60) ? "합격" : "불합격";
		System.out.println(t1);
		
		int t3 = 61;
		String t2 = "";
		if (t3 >= 60) {
			t2 = "합격";
		}
		System.out.println(t2);
		
		// int k2가 60이상이면 합격, 60미만이면 불합격
		// int k3이 60이상이면 합격, 60미만이면 불합격  //짧게 쓰는 방법
		int t4 = 53;
		String t5 = "불합격";
		
		if (t4 >= 60) {
			t5 = "합격";
		} 
		System.out.println(t5);
		System.out.println();
		

		
		
		// int k1이 홀수인지 짝수인지 판별하자
		int w = 3;
		String w1 = "";
		if (w % 2 == 0) {
			w1 = "짝수";
		}
		if (w % 2 == 1) {
			w1 = "홀수";
		}
		System.out.println(w1);
		System.out.println();
		
		// int k2가 60 이상이면 합격, 아니면 불합격
		
		// k3 가 1이면 가격에 0.1 할인(10%) 한다.(얼마에 살 수 있나)
		int w2 = 1;
		int w3 = 1000;
		int w4 = 0;
		
		if (w2 == 1) {
			w4 = w3 - (w3 / 10);
		} else {
			w4 = w3;
		}
		System.out.println(w4);
		System.out.println();
		
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자.
		char e = 'g';
		String e1;
		if (e >= 'a' && e <= 'z') {
			e1 = "소문자";
		} else {
			e1 = "소문자 아님";
		}
		System.out.println(e1);
		System.out.println();
		
		// 근무시간이 8시간 까지는 시간당 9860 이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int e2 = 9860;
		int e3 = (int)(9860 * 1.5);
		int e4 = 10;
		int e5 = 0;
		
		if (e4 > 8) {
			e5 = ((e4-8)*e3) + 8*e2;
		} else {
			e5 = e2*e4;
		}
		System.out.println(e5);
		System.out.println();
		
		
		// int k1의 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F		
		
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		
		// char k3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
		
		// menu 가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		String r = "";
		int r2 = 3;
		int r3 = 2;
		int r4 = 10000;
		int r5 = 0;
		int r6 = 0;
		int r7 = 0;
		
		if (r2 == 1) {
			r = "카페모카";
			r5 = 3500;
		} else if (r2 == 2) {
			r = "카페라떼";
			r5 = 4000;
		} else if (r2==3) {
			r = "아메리카노";
			r5 = 3000;
		} else {
			r = "과일쥬스";
			r5 = 3500;
		}
		r6 = (r5 * r3) /10;
		r7 = r4 - (r6 + (r5*r3));
		
		System.out.println("메뉴 : "+r);
		System.out.println("부가세 : "+r6);
		System.out.println("잔돈 : "+r7);
		
	}
}
