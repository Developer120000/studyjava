package com.ict.day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Ex09 coff = new Ex09();
        coff.sName("커피음료");
        coff.sPrice(1500);

        Ex09 ion = new Ex09();
        ion.sName("이온음료");
        ion.sPrice(2300);

        Ex09 cola = new Ex09();
        cola.sName("탄산음료");
        cola.sPrice(2000);

        Ex09 juice = new Ex09();
        juice.sName("과일음료");
        juice.sPrice(1800);

        Ex09 water = new Ex09();
        water.sName("물");
        water.sPrice(1200);
        
        
        Ex09[] arr = {coff, ion, cola, juice, water};

        Scanner scan = new Scanner(System.in);

        System.out.println("금액을 투입하세요 >> ");

        int input = scan.nextInt();
        
//        esc:while(true) {
//
//            if(input < 1500) {
//                System.out.println("금액이 부족합니다.");
//                System.out.println("잔돈 : " + input);
//            }
//            else {
//                System.out.println("커피\t이온\t탄산\t과일\t반환");
//
//                //각 음료수의 가격을 가져와서 비교하자.
//                for (int i = 0; i < arr.length; i++) {
//                    if(arr[i].gPrice() <= input) {
//                        System.out.print("O\t");
//                    }
//                    else {
//                        System.out.print("X\t");
//                    }
//
//                }
//                System.out.println();
//                System.out.println("선택하세요 >> ");
//                String drink = scan.next();
//
//
//                int output = 0;
//
//                switch(drink) {
//                    case "커피": output = input - arr[0].gPrice(); break;
//                    case "이온": output = input - arr[1].gPrice(); break;
//                    case "탄산": output = input - arr[2].gPrice(); break;
//                    case "과일": output = input - arr[3].gPrice(); break;
//                    case "반환": output = input; break esc;
//                    default: System.out.println("제대로 입력하세요"); continue;
//                }
//                System.out.println("잔돈: " + output);
//
//                while(true) {
//
//                    if(output >= 1500) {
//                        System.out.println("다시 고를껍니까? 1.y/2.n");
//                        int again = scan.nextInt();
//                         if(again == 1) {
//                             input = output;
//                             continue esc;
//                 
//                         }
//                         else if(again == 2) break esc;
//                         else {
//                             System.out.println("다시 입력하세요");
//                         }
//                    }
//
//                }
//
//        }//큰while
//
//        }
//        System.out.println("맛있게 드세요");

        // 풀이방법
        int output = 0;
        
        esc : while (true) {
        	System.out.println("남은 돈 : " + input);
			if (input < 1200) {
				System.out.println("금액이 부족합니다.");
				output = input;
				break esc;
			}else {
				System.out.println("커피\t이온\t탄산\t과일\t물\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {
						System.out.print(" O\t");
					} else {
						System.out.print(" X\t");
					}
				}

			System.out.println();
			System.out.println("선택하세요 >> ");
			String drink = scan.next();
			switch (drink) {
				case "커피" : output = input - arr[0].gPrice(); break;
				case "이온" : output = input - arr[1].gPrice(); break;
				case "탄산" : output = input - arr[2].gPrice(); break;
				case "과일" : output = input - arr[3].gPrice(); break;
				case "물" : output = input - arr[4].gPrice(); break;
				case "반환" : output = input; break esc;
			}
			}
			// 잔돈을 물건을 살 수 있는 input 으로 전환
			input = output;
		}
		System.out.println("잔돈 : " + output);
        
        
        
        
        }

}