package com.ict.day07;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 정하기
		int[] su = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
		
		// 자리 변경을 위한 임시 변수
		int tmp = 0;
		// 처음에 있는 숫자가 다음 숫자들을 순서대로 비교한다 (더 작은 숫자가 나올때 까지)
		// 작은 숫자랑 자리교체하고 두번째 숫자가 그다음 숫자들을 순서대로 비교하는걸 반복
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				// System.out.println("i = " + i + ", j = " + j);
				// i < j => 오름차순, i > j => 내림차순
				if (su[i] > su[j]) {
					// 자리변경 // 컴퓨터는 서로 자리교체가 안되서 임시 변수에 넣고 하나씩 이동한다.
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
					System.out.println(i + "자리 바꾸기" + j);
				}
			}	
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println();
		
		
		
		int[] su1 = new int[7];
		su1[0] = 35;
		su1[1] = 457;
		su1[2] = 67;
		su1[3] = 53;
		su1[4] = 93;
		su1[5] = 62;
		su1[6] = 75;
		
		int tmp1 = 0;
		
		for (int i = 0; i < su1.length-1; i++) {
			for (int j = i+1; j < su1.length; j++) {
				if (su1[i] < su1[j]) {
					tmp1 = su1[i];
					su1[i] = su1[j];
					su1[j] = tmp1;
				}
			}
		}
		for (int i = 0; i < su1.length; i++) {
			System.out.println(su1[i]);
		}
		
		
		
	}
}
