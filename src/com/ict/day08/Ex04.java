package com.ict.day08;

import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr= new int[5][5];
		
		//         번호, 총점, 평균, 학점, 순위
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 285, 90, 'A', 1};
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		// 순위를 구해보자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				// 각 배열의 총점을 비교하자
				if (arr[i][1] < arr[j][1]) {
				arr[i][4]++;
				}
			}
		}
		
		// 정렬 하기 위해 임시 배열 만들기
		int[] tmp = new int[5];
		
		// 정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println(i + "자리 바꾸기" + j);
				}
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");;
				}
		}
			System.out.println();
		}

		
		
		
//		double[][] arr2 = new double[3][8];
//		//         번호, 국어,영어,수학,총점,평균,학점,순위
//		double[] q1 = {11, 90, 80, 85, 0, 0, ' ', 1}; 
//		double[] q2 = {12, 85, 84, 85, 0, 0, ' ', 1}; 
//		double[] q3 = {13, 90, 75, 95, 0, 0, ' ', 1}; 
//		
//		arr2[0] = q1;
//		arr2[1] = q2;
//		arr2[2] = q3;
//		
//		double[][] sum2 = new double[arr2.length][arr2.length];
//		double[][] avg2 = new double[arr2.length][arr2.length];
//		double[][] hak2 = new double[arr2.length][arr2.length];
//		
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if(j > 0 && j < 4) {
//					sum2[i][j] = arr2[j][1] + arr2[j][2] + arr2[j][3];
//					avg2[i][j] = (int)(sum2[i][j] / 3.0 * 10) / 10.0;
//				}
//
//				if (avg2[i][5] >= 90) {
//					arr2[i][6] = 'A';
//				} else if (avg2[i][5] >= 80) {
//					arr2[i][6] = 'B';
//				} else if (avg2[i][5] >= 70) {
//					arr2[i][6] = 'C';
//				} else {
//					arr2[i][6] = 'F';
//				}
//				arr2[i][4] = sum2[i][j];
//				arr2[i][5] = avg2[i][j];
//				arr2[i][6] = arr2[i][j];
//			}
//		}
//	
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if (i == j) continue;
//				if (arr2[i][4] < arr2[j][4]) 
//					arr2[i][7]++;
//			}
//		}
//		
//		double[] tmp2 = new double[3];
//		for (int i = 0; i < arr2.length-1; i++) {
//			for (int j = i+1; j < arr2.length; j++) {
//				if (arr2[i][7] > arr2[j][7]) {
//					tmp2 = arr2[i];
//					arr2[i] = arr2[j];
//					arr2[j] = arr2[i];
//				}
//			}
//		}
//		System.out.print("번 호\t국 어\t영 어\t수 학\t총 점\t평 균\t학 점\t순 위\n");
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				if (j == 6) {
//					System.out.print((char)(arr2[i][j]) + "\t");
//				} else {
//					System.out.print((int)(arr2[i][j]) + "\t");
//				}
//			}
//			System.out.println();
//		}
		
		
			
	}
}
