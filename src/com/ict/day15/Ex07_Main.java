package com.ict.day15;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ex07_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ex07 담을 set 컬렉션을 만들자.
		HashSet<Ex07> set1 = new HashSet<Ex07>();
//		esc: while (true) {
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
//			Ex07 p = new Ex07(name, kor, eng, math);
//			set1.add(p);
//
//			while (true) {
//				System.out.println("계속할까요(y/n) >> ");
//				String str = scan.next();
//				if (str.equalsIgnoreCase("y")) {
//					continue esc;
//				} else if (str.equalsIgnoreCase("n")) {
//					break esc;
//				} else {
//					continue;
//				}
//			}
//		}
//
//		// 순위
//		for (Ex07 i : set1) {
//			for (Ex07 j : set1) {
//				if (i.getSum() < j.getSum()) {
//					i.setRank(i.getRank() + 1);
//				}
//			}
//		}

		// 정렬 HashSet 은 정렬 못함

		// 출력
//		for (Ex07 k : set1) {
//			System.out.print(k.getName() + "\t");
//			System.out.print(k.getSum() + "\t");
//			System.out.print(k.getAvg() + "\t");
//			System.out.print(k.getHak() + "\t");
//			System.out.print(k.getRank() + "\n");
//		}
		// 출력 다른방법
//		Iterator<Ex07> it = set1.iterator();
//		while (it.hasNext()) {
//			Ex07 ex07 = (Ex07) it.next();
//			System.out.print(ex07.getName() + "\t");
//			System.out.print(ex07.getSum() + "\t");
//			System.out.print(ex07.getAvg() + "\t");
//			System.out.print(ex07.getHak() + "\t");
//			System.out.print(ex07.getRank() + "\n");
//		}

//		HashSet<Ex07> it2 = new HashSet<Ex07>();
//
//		esc: while (true) {
//			System.out.println("이름 : ");
//			String name2 = scan.next();
//			System.out.println("국어 : ");
//			int kor2 = scan.nextInt();
//			System.out.println("영어 : ");
//			int eng2 = scan.nextInt();
//			System.out.println("수학 : ");
//			int math2 = scan.nextInt();
//
//			Ex07 t = new Ex07(name2, kor2, eng2, math2);
//			it2.add(t);
//
//			while (true) {
//				System.out.println("계속 할까요? y / n");
//				String a = scan.next();
//				if (a.equalsIgnoreCase("y")) {
//					continue esc;
//				} else if (a.equalsIgnoreCase("n")) {
//					break esc;
//				} else {
//					System.out.println("다시 입력하세요");
//				}
//			}
//		}
//
//		// 순위
//		for (Ex07 k : it2) {
//			for (Ex07 k1 : it2) {
//				if (k.getSum() < k1.getSum()) {
//					k.setRank(k.getRank() + 1);
//				}
//			}
//		}
//
//		// 출력
//		Iterator<Ex07> it3 = it2.iterator();
//		while (it3.hasNext()) {
//			Ex07 k = it3.next();
//			System.out.print(k.getName() + "\t");
//			System.out.print(k.getSum() + "\t");
//			System.out.print(k.getAvg() + "\t");
//			System.out.print(k.getHak() + "\t");
//			System.out.print(k.getRank() + "\n");
//		}

		HashSet<Ex07> set3 = new HashSet<Ex07>();

		ex: while (true) {
			System.out.println("이름 : ");
			String name3 = scan.next();
			try {
				System.out.println("국어 : ");
				int kor3 = scan.nextInt();
				
				System.out.println("영어 : ");
				int eng3 = scan.nextInt();
				
				System.out.println("수학 : ");
				int math3 = scan.nextInt();
				
				Ex07 t3 = new Ex07(name3, kor3, eng3, math3);
				
				set3.add(t3);
			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력하세요");
				String k = scan.nextLine();
				continue ex;
			}
			
			while (true) {
				System.out.println("계속할까요? (y, n)");
				String ans = scan.next();
				if(ans.equalsIgnoreCase("y")) {
					continue ex;
				}else if(ans.equalsIgnoreCase("n")) {
					break ex;
				}else {
					System.out.println("다시 입력하세요");
				}
			}
		}
		
		for (Ex07 q : set3) {
			for (Ex07 q1 : set3) {
				if(q.getSum() < q1.getSum()) {
					q.setRank(q.getRank() + 1);
				}
			}
		}
		
		Iterator<Ex07> it3 = set3.iterator();
		while (it3.hasNext()) {
			Ex07 k = it3.next();
			System.out.println(k.getName());
			System.out.println(k.getSum());
			System.out.println(k.getAvg());
			System.out.println(k.getHak());
			System.out.println(k.getRank());
		}
		
	}
}
