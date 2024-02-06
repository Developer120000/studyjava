package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초 일까 ?
		
		int k1 = 3989;
		int s1 = 60*60;
		int s2 = 60;
		
		int su1 = k1 / s1;
		int su2 = k1 - s1;
		int su3 = su2 / s2;
		int su4 = su2 % s2;
		System.out.println(su1+"시간"+su3+"분"+su4+"초");
		
		
		int total = 3989 ;
		int h = 0 ;
		int m = 0 ;
		int s = 0 ;
		int res = 0 ;
		
		h = total / (60 * 60);
		res = total % (60 * 60) ;
		m = res / 60 ;
		s = res % 60 ;
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		
		
	}
}
