package com.ict.day06;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록(for 문, while 문, switch case) 을 탈출할 때 사용하는 예약어
		// continue : continue 문 이하 수행문을 포기하고 다음회차로 진행하는 예약어
		// for 문의 경우 continue 만나면 증감식으로 이동하고 while 문의 경우는 continue 만나면 조건식으로 이동한다.
		// 보통 if 문과 함께 사용한다.

		// 이스케이프 문자(제어문자)
		// \n => 줄바꿈, \t => 탭, \' => ', \" => "    "출력시 따옴표나 쌍따옴표 안에서 쓰인다"

		// 1-10 까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10 까지 출력 6에서 break 사용  // 출력을 나중에
		for (int i = 1; i < 11; i++) {
			if (i == 6)	break;
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10 까지 출력 6에서 break 사용   // 출력을 먼저
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)	break;
		}
		System.out.println();

		// 1-10 까지 출력 6에서 continue 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)	continue;		// 6이 되면 실행을 무시하고 다시 증감식으로 간다.
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10 까지 출력 6에서 continue 사용  // 출력을 먼저
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)	continue;		// continue 가 실행 뒤에오면 의미가 없음
		}
		System.out.println();

		// 1-10 까지 짝수만 출력
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1)continue; {
				System.out.println(i);
			}
		}
	}
}
