package com.ict.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		// 학생 수 : 
//		System.out.print("학생 수 : ");
//		int su = scan.nextInt();
//		double[][] arr = new double[su][8];
//		
//		for (int i = 0; i < arr.length; i++) {
//			double[] p = new double[8];
//		// for 문 안에서 배열을 새로 만들어서 저장하고 집어넣는 형식을 **많이 쓴다, 직접넣는 형식은 가변형에는 쓸수가 없다 
//			System.out.print("번호 : ");
//			p[0] = scan.nextInt();
//			
//			System.out.print("국어 : ");
//			p[1] = scan.nextInt();
//
//			System.out.print("영어 : ");
//			p[2] = scan.nextInt();
//		
//			System.out.print("수학 : ");
//			p[3] = scan.nextInt();
//			
//			p[4] = p[1] + p[2] + p[3];
//			
//			p[5] = (int)(p[4] / 3.0 * 10) / 10.0;
//			
//			if(p[5] >= 90) {
//				p[6] = 'A';
//			} else if (p[5] >= 80) {
//				p[6] = 'B';
//			} else if (p[5] >= 70) {
//				p[6] = 'C';
//			} else {
//				p[6] = 'F';
//			}
//			p[7] = 1 ;
//			// ** 다차원배열에 넣기
//			arr[i] = p ;
//		}
//		
//		// 번호, 국어, 영어, 수학
//		
//		// 총점, 평균, 학점
//		
//		// 순위
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if(i == j) continue;
//				if(arr[i][4] < arr[j][4]) {
//					arr[i][7]++;
//				}
//			}
//		}
//		
//		// 정렬
//		// 임시 저장할 배열
//		double[] tmp = new double[8];
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i][7] > arr[j][7])
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//			}
//		}
//		
//		// 출력
//		System.out.println("번호\t총점\t평균\t학점\t순위");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				// 국어, 영어, 수학 출력에서 제외 방법
//				if(j == 1 || j == 2 || j ==3) continue;
//				
//				// 평균 이므로 double 그대로 출력
//				if(j == 5) {
//					System.out.print(arr[i][j] + "\t");
//				// 학점은 char
//				}else if(j == 6) {
//					System.out.print((char)(arr[i][j]) + "\t");
//				} else {      // 평균 말고는 정수이므로 int 변환
//					System.out.print((int)(arr[i][j]) + "\t");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		// 번호, 국어,영어,수학,총점,평균,학점,순위
		System.out.println("학생 수 : ");
		int su2 = scan.nextInt();
		double[][] arr2 = new double[su2][8];
		
		for (int i = 0; i < arr2.length; i++) {
			double[] p2 = new double[8];
			System.out.print("번호 : ");
			p2[0] = scan.nextInt();
			System.out.print("국어 : ");
			p2[1] = scan.nextInt();
			System.out.print("영어 : ");
			p2[2] = scan.nextInt();
			System.out.print("수학 : ");
			p2[3] = scan.nextInt();
			
			p2[4] = p2[1] + p2[2] + p2[3];
			p2[5] = (int)(p2[4] / 3.0 * 10) / 10.0;
			
			if (p2[5] >= 90){
				p2[6] = 'A';
			} else if (p2[5] >= 80) {
				p2[6] = 'B';
			} else if (p2[5] >= 70) {
				p2[6] = 'C';
			} else {
				p2[6] = 'F';
			}
			p2[7] = 1;
			arr2[i] = p2;
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2.length; k++) {
				if (i == k) continue;
				if (arr2[i][4] < arr2[k][4])
					arr2[i][7]++;
			}
		}
		double[] tmp2 = new double[8];
		for (int i = 0; i < arr2.length-1; i++) {
			for (int k = i + 1; k < arr2.length; k++) {
				if (arr2[i][7] > arr2[k][7]) {
					tmp2 = arr2[i];
					arr2[i] = arr2[k];
					arr2[k] = tmp2;
				}
			}
		}
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (j == 1 || j == 2 || j == 3) continue;
				if (j == 5) {
					System.out.print(arr2[i][j]+"\t");
				} else if (j == 6) {
					System.out.print((char)(arr2[i][j]) + "\t");
				} else {
					System.out.print((int)(arr2[i][j])+"\t");
				}
			}
			System.out.println();
		}
		
		
	}
}
