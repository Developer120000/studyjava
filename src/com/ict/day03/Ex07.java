package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		// 2시간 40분 30초를 초로 환산 하여라 (몇 초 일까요?)
		
		int su1 = 2;
		su1 *= 60*60;
		int su2 = 40;
		su2 *= 60;
		int su3 = 30;
		
		System.out.println((su1+su2+su3)+"초");
		
		int h = 2 * 60 * 60 ;
		int m = 40 * 60 ;
		int s = 30 ;
		int total = h + m + s ;
		System.out.println("2시간 40분 30초는 " + total + "초 입니다.");
		
	}
}
