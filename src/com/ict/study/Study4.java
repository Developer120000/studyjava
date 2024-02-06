package com.ict.study;

import java.util.Scanner;

public class Study4 {
	public static void alert1() {
		System.out.println("다시 입력해주세요");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int win = 0;
		double score = 0.0;
		stop:while (true) {
			count++;
			int random = (int) (Math.random() * 3 + 1);
			String s1 = "";
			String s2 = "";
			String sen = "";

			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.print("1: 보, 2: 가위, 3: 바위 : ");
			int mine = scan.nextInt();
			if (mine == 1) {
				s2 = "보";
			} else if (mine == 2) {
				s2 = "가위";
			} else if (mine == 3) {
				s2 = "바위";
			} else {
				alert1(); continue;
			}
			if (random != mine) {
				
				if (random == 1) {
					s1 = "보";
					if (mine == 2) {
						sen = "you win";
						win++;
					} else if (mine == 3) {
						sen = "you lose";
					}

				} else if (random == 2) {
					s1 = "가위";
					if (mine == 1)
						sen = "you lose";
				 else if (mine == 3) {
					sen = "you win";
					win++;
				}}

				else if (random == 3) {
					s1 = "바위";

					if (mine == 1) {

						sen = "you win";
						win++;
					} else if (mine == 2) {

						sen = "you lose";
					}
					
				}
			} else {
				s1 = s2;
				sen = "it's draw";
			}

			System.out.println("com: " + random + " vs you: " + mine);
			System.out.println(s1 + " vs " + s2 + "\n" + sen);
			score = (int)(win / (count * 1.0) * 100 * 10) / 10.0;
			while (true) {
				System.out.println();
				System.out.print("continue? 1:yes, 2:no");
				int game = scan.nextInt();
				if (game == 1)
					continue stop;
				else if (game == 2) {
					System.out.println("\nTotal : " + count + "\nWin : " + win + "\nWin rate : " + score +"%");
					break stop;
				}
				else
					alert1();

			}
		}
	}
}