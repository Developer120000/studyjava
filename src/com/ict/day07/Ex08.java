package com.ict.day07;

import java.util.Arrays;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		
		// 홍, 김, 이, 박, 고 에 총점, 평균(소수점 첫째자리), 학점, 순위를 구하자
		
		String[] name = {"홍", "김", "이", "박", "고"};
		int[] kor = { 80, 90, 80, 70, 100}; // 국어
		int[] eng = {85, 95, 96, 75, 100}; // 영어
		int[] math = {100, 100, 80, 70, 100}; // 수학
		
		int[] sum = {0, 0, 0, 0, 0}; // 총점
		
		// 소수점 첫째자리 까지 구하자
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0}; // 평균
		String[] hak = {"", "", "", "", ""}; // 학점 초기값
		int[] rank = {1, 1, 1, 1, 1}; // 순위
		
		// 총점, 평균, 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}
		
		// 순위 구하기
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] == sum[j]) continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print("총점 : " + sum[i] + "\t");
			System.out.print("평균 : " + avg[i] + "\t");
			System.out.print("학점 : " + hak[i] + "\t");
			System.out.print("순위 : " + rank[i] + "\n");
		}
		

		
		
		
		// 홍, 김, 이, 박, 고 에 총점, 평균(소수점 첫째자리), 학점, 순위를 구하자
		String[] s = {"홍","김","이","박","고"};
		int[] kor2 = {85,43,37,98,76};
		int[] eng2 = {45,48,97,58,73};
		int[] math2 = {55,63,37,69,77};
		
		int[] sum2 = new int[s.length];
		int[] avg2 = new int[s.length];
		String[] hak2 = new String[s.length];
		int[] rank2 = new int[s.length];
		
		Arrays.fill(sum2, 0);
		Arrays.fill(avg2, 0);
		Arrays.fill(hak2, "");
		Arrays.fill(rank2, 1);
		
		for (int i = 0; i < rank2.length; i++) {
			sum2[i] = kor2[i] + eng2[i] + math2[i];
			avg2[i] = (int)((sum2[i] / 3.0 * 10) / 10.0);
			if (avg2[i] >= 90) {
				hak2[i] = "A학점";
			} else if (avg2[i] >= 80) {
				hak2[i] = "B학점";
			} else if (avg2[i] >= 70){
				hak2[i] = "C학점";
			} else {
				hak2[i] = "F학점";
			}
		}
		
		for (int i = 0; i < rank2.length; i++) {
			for (int j = 0; j < rank2.length; j++) {
				if (i == j) continue;
				if (sum2[i] < sum2[j])
					rank2[i]++;
			}
		}
		
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < rank2.length; i++) {

			System.out.print(s[i] + "\t");
			System.out.print(sum2[i] + "\t");
			System.out.print(avg2[i] + "\t");
			System.out.print(hak2[i] + "\t");
			System.out.print(rank2[i] + "\n");
		}
		
		
		
		
	}
}
