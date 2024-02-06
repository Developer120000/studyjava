package com.ict.day06;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// continue 와 continue label
		// continue : continue 이하 수행문을 포기하고 해당 for 문의 증강식으로 이동 (for 문)
		// continue label : continue 이하 수행문을 포기하고, 레이블이 있는 반복문의 증감식으로 이동
		
		// 1-10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			if(i==6) continue;
			System.out.print(i+" ");
		}
		System.out.println();
		
		esc : for (int i = 1; i < 11; i++) {
			if(i==6) continue esc;
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("다중 for 문에서 continue label 사용");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2) continue;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println();
		
		esc : for (int i = 1; i < 4; i++) {         //결과는 같아도 계산하는 횟수가 적다 5번 덜 계산한다
			for (int j = 1; j < 6; j++) {
				if (i == 2) continue esc;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		
		
		
	}
}
