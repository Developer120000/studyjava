package com.ict.study;

import java.util.Scanner;

public class Qustion3 {
	public static void main(String[] args) {
		
		
		// 이름이 홍길동인 사람의 점수가
		// 국어90, 영어80, 수학 70 이다.
		// 총점과 평균을 구하자
		// 출력을 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
		String res = "홍길동";
		int kor = 90;
		int eng = 80;
		int ma = 80;
		int su = 0;
		double w1 = 0;
		
		su = kor+eng+ma ;
		w1 = (su / (3 * 1.0));
		System.out.println("이름 : "+res);
		System.out.println("총점 : "+su);
		System.out.println("평균 : "+(int)(w1*10)/10.0);
		
			
		
		// 끝의 5원을 버리고자 한다.
		int su1 = 198305;
		int su2 = 0;
		su2 = (su1 / 10) * 10;
		System.out.println(su2);
		
		// 2시간 40분 30초를 초로 환산 하여라 (몇 초 일까요?)
		int q1 = 2;
		int q2 = 40;
		int q3 = 30;
		System.out.println((q1 * 60* 60) + (q2 * 60) + q3);
		
		
		
		// 3989초는 몇시간, 몇분, 몇초 일까 ?
		int total = 0;
		int e2 = 0;
		int e3 = 3989;
		int e4 = 0;
		int e5 = 0;
		e2 = e3 / 3600 ;
		total = e3 % 3600;
		e4 = total / 60;
		e5 = total % 60;
		System.out.println(e2+""+e4+""+e5);
		
		// 카페모카 6500원이다.
		// 친구와 둘이서 15000원을 내고 2잔을 주문했다.
		// 잔돈은 얼마인가?(단, 부가세 10% 별도)
		int a1 = 6500;
		int a2 = 2;
		int pay = 15000;
		int vat = 0;
		int mo = 0;
		
		vat = a1*a2 / 10;
		mo = pay - (a1*a2+vat);
		System.out.println(mo);
		
		// 이름이 국어, 영어, 수학  점수를 키보드로 입력 받아서
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 둘째자리 까지 구하자)
		Scanner scan = new Scanner(System.in);
		
		String res2 = "";
		int kor1 = 0;
		int eng1 = 0;
		int ma1 = 0;
		int co = 0;
		double vud = 0;
		
		System.out.print("이름?");
		res2 = scan.next();
		System.out.print("국어 점수?");
		kor1 = scan.nextInt();
		System.out.print("영어 점수?");
		eng1 = scan.nextInt();
		System.out.print("수학 점수?");
		ma1 = scan.nextInt();
		
		co = kor1 + eng1 + ma1;
		vud = (int)(co / 3.0 *100)/100.0;
		System.out.println("총점 : " +co);
		System.out.println("평균 : " +vud);
		
	}
}
