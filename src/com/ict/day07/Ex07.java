package com.ict.day07;

import java.util.Arrays;
import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		// 순위 구하기  // 순위구하기는 자리정렬과 방식이 다름
		// 1. 모든 사람의 순위를 1등으로 초기값 부여
		// 2. 모든 사람과 비교해야 된다. (자기자신 제외)
		// 3. 나(i) 보다 남(j) 이 크면 내 순위를 증가 시킨다.
		
		int[] su = {90, 80, 70, 95, 65, 85, 75};
		int[] rank = {1, 1, 1, 1, 1, 1, 1};   // 자리를 바꾸는게 아니라 순위가 변동된다.
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (su[i] == su[j]) continue; // 자기 자신 제외
				if (su[i] < su[j]) {
					rank[i]++;
				}
					
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		System.out.println();
		
		
		
		
		
		int[] su1 = {453,685,238,596,593,192,495,798,528};
		int[] rank1 = new int[9];
		Arrays.fill(rank1, 1);
		
		for (int i = 0; i < rank1.length; i++) {
			for (int j = 0; j < rank1.length; j++) {
				if (su1[i] == su1[j]) continue;
				if (su1[i] < su1[j]) rank1[i]++;
			}
		}
		for (int i = 0; i < rank1.length; i++) {
			System.out.println(rank1[i]);
		}
		System.out.println();
		
		
		
		
		int[] su2 = {234,743,247,965,349,987,347,235,7889,254,89,543};
		int[] rank2 = new int[su2.length];
		Arrays.fill(rank2, 1);
		
		for (int i = 0; i < rank2.length; i++) {
			for (int j = 0; j < rank2.length; j++) {
				if (su2[i] == su2[j]) continue;
				if (su2[i] < su2[j]) rank2[i]++;
			}
		}
		
		for (int i = 0; i < rank2.length; i++) {
			System.out.println(rank2[i]);
		}
		System.out.println();
		
			int tmp2 = 0;	
		for (int i = 0; i < rank2.length-1; i++) {
			for (int j = i+1; j < rank2.length; j++) {
				if (su2[i] > su2[j]) {
					tmp2 = su2[i];
					su2[i] = su2[j];
					su2[j] = tmp2;
				}
			}
		}
		for (int i = 0; i < rank2.length; i++) {
			System.out.println(su2[i]);
		}

		
	}
}
