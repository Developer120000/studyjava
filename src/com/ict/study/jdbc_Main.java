package com.ict.study;

import java.util.Scanner;

public class jdbc_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체 데이터 보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int num = scan.nextInt();
		
		switch (num) {
		case 1: jdbc_DAO.getInstance().getSelectAll();
			break;
		case 2: System.out.println("검색할 custid : ");
				int custid = scan.nextInt();
				jdbc_DAO.getInstance().getSelectOne(custid);
			break;

		}
		
	}
}
