package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 스캐너를 이용해서 5명 이름,총점,평균,학점, 순위를 구하자
		
		Scanner scan = new Scanner(System.in);
		String[] name = {"", "", "", "", ""}; // 이름
		int[] kor = {0, 0, 0, 0, 0}; // 국어
		int[] eng = {0, 0, 0, 0, 0}; // 영어
		int[] math = {0, 0, 0, 0, 0}; // 수학
		int[] sum = {0, 0, 0, 0, 0}; // 총점
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0}; // 평균
		String[] hak = {"", "", "", "", ""}; // 학점 초기값
		int[] rank = {1, 1, 1, 1, 1}; // 순위
		
		String str = "";
		
		//입력 받기
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			// 총점, 평균, 학점 구하자.
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
		
		//순위는 항상 따로 구해야 한다. (값이 채워진 상태에서)
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] == sum[j]) continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		// 출력
		System.out.println("이  름\t총  점\t평  균\t학  점\t순  위");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "\n");
		}
		
		
		
		
		
		
		
		
		// 스캐너를 이용해서 5명 이름,총점,평균,학점, 순위를 구하자
		
		String[] name2 = {"","","","",""};
		int[] kor2 = {0,0,0,0,0};
		int[] eng2 = {0,0,0,0,0};
		int[] math2 = {0,0,0,0,0};
		int[] sum2 = {0,0,0,0,0};
		int[] avg2 = {0,0,0,0,0};
		String[] hak2 = {"","","","",""};
		int[] rank2 = {0,0,0,0,0};
		
		
		for (int i = 0; i < rank2.length; i++) {
			System.out.println("이름 : ");
			name2[i] = scan.next();
			System.out.println("국어 : ");
			kor2[i] = scan.nextInt();
			System.out.println("영어 : ");
			eng2[i] = scan.nextInt();
			System.out.println("수학 : ");
			math2[i] = scan.nextInt();
			
			sum2[i] = kor2[i] + eng2[i] + math2[i];
			avg2[i] = (int)((sum2[i] / 3.0 * 10) / 10.0);
			if (avg2[i] >= 90) {
				hak2[i] = "A학점";
			} else if (avg2[i] >= 80) {
				hak2[i] = "B학점";
			} else if (avg2[i] >= 70) {
				hak2[i] = "C학점";
			} else {
				hak2[i] = "F학점";
			}
		}

		for (int i = 0; i < rank2.length; i++) {
			for (int j = 0; j < rank2.length; j++) {
				if(sum2[i]==sum2[j]) continue;
				if (sum2[i] < sum2[j]) rank2[i]++;
			}
		}
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");		
		for (int i = 0; i < rank2.length; i++) {
			System.out.println(name2[i]+"\t"+sum2[i]+"\t"+avg2[i]+"\t"+hak2[i]+"\t"+rank2[i]);
		}
		
		
		
		
	}
}
