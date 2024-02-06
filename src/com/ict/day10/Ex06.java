package com.ict.day10;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("학생 수 : ");
//		int su = scan.nextInt();
//		
//		// 학생 수 만큼 배열의 크기를 만들자
//		// 해당 배열 안에는 클래스가 들어간다
//		// Ex05 클래스로 만든 객체를 배열에 자료형으로 사용
//		// 즉 해당 배열안에 Ex05로 만든 객체의 주소만 존재
//		Ex05[] arr = new Ex05[su];
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("이름 : ");
//			String name = scan.next();
//			
//			System.out.println("국어 : ");
//			int kor = scan.nextInt();
//
//			System.out.println("영어 : ");
//			int eng = scan.nextInt();
//			
//			System.out.println("수학 : ");
//			int math = scan.nextInt();
//			
//			Ex05 p = new Ex05();
//			p.process(name, kor, eng, math);
//			
//			arr[i] = p;
//		}
//		// 순위
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				if (i == j) continue;
//				if (arr[i].sum < arr[j].sum) {
//					arr[i].rank ++;
//				}
//			}
//		}
//		
//		// 정렬
//		// 임시저장 (클래스) // 클래스의 정렬이기떄문에 클래스로 만들어준다
//		Ex05 tmp = new Ex05();
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i].rank > arr[j].rank) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		// 출력
//		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i].name + "\t");
//			System.out.print(arr[i].sum + "\t");
//			System.out.print(arr[i].avg + "\t");
//			System.out.print(arr[i].hak + "\t");
//			System.out.print(arr[i].rank + "\n");
//		}

		
//		System.out.println("학생 수 : ");
//		int su = scan.nextInt();
//		
//		Ex05[] ex05 = new Ex05[su];
//		
//		for (int i = 0; i < ex05.length; i++) {
//			System.out.println("이름 : ");
//			String name2 = scan.next();
//			System.out.println("국어 : ");
//			int kor2 = scan.nextInt();
//			System.out.println("영어 : ");
//			int eng2 = scan.nextInt();
//			System.out.println("수학 : ");
//			int math2 = scan.nextInt();
//			
//			Ex05 ex051 = new Ex05();
//			ex051.play1(name2, kor2, eng2, math2);
//			
//			ex05[i] = ex051;
//		}
//		
//		for (int i = 0; i < ex05.length; i++) {
//			for (int j = 0; j < ex05.length; j++) {
//				if (i == j) continue;
//				if (ex05[i].sum < ex05[j].sum)
//					ex05[i].rank++;
//			}
//		}
//		Ex05 tmp2 = new Ex05();
//		for (int i = 0; i < ex05.length-1; i++) {
//			for (int j = i + 1; j < ex05.length; j++) {
//				if (ex05[i].rank > ex05[j].rank) {
//					tmp2 = ex05[i];
//					ex05[i] = ex05[j];
//					ex05[j] = tmp2;
//				}
//			}
//		}
//		
//		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
//		for (int i = 0; i < ex05.length; i++) {
//			System.out.print(ex05[i].name+"\t"+ex05[i].sum+"\t"+ex05[i].avg+"\t"+ex05[i].hak+"\t"+ex05[i].rank+"\n");
//		}
//		
		
		
		
		
//		// 학생 수 만큼 배열의 크기를 만들자
//		// 해당 배열 안에는 클래스가 들어간다
//		// Ex05 클래스로 만든 객체를 배열에 자료형으로 사용
//		// 즉 해당 배열안에 Ex05로 만든 객체의 주소만 존재
		
		System.out.println("학생 수 : ");
		int su1 = scan.nextInt();
		
		Ex05[] arr = new Ex05[su1];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			String name1 = scan.next();
			
			System.out.println("국어 : ");
			int kor1 = scan.nextInt();

			System.out.println("영어 : ");
			int eng1 = scan.nextInt();
			
			System.out.println("수학 : ");
			int math1 = scan.nextInt();
			
			Ex05 t1 = new Ex05();
			t1.play1(name1, kor1, eng1, math1);
			
			arr[i] = t1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}else if(arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) {
					Ex05 tmp = new Ex05();
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름\t총점\t평균\t학점\t순위");
			System.out.println(arr[i].name + "\t" + arr[i].sum + "\t" + arr[i].avg + "\t" + arr[i].hak + "\t" + arr[i].rank);
			
			
		}
		
		
		
	}
}
