package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Ex02_VO> list = Ex02_DAO.getList();
		prn(list);
		
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 특정 데이터 보기");
		System.out.println("2. customer 테이블 데이터 삽입하기");
		System.out.println("3. customer 테이블 데이터 삭제하기");
		System.out.println("4. customer 테이블 데이터 수정하기");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println("검색할 idx : ");
			String idx = scan.next();
			Ex02_VO vo = Ex02_DAO.getOne(idx);
			prn(vo);
			break;
		case 2:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.println("번호 : ");
			String idx2 = scan.next();
			System.out.println("아이디 : ");
			String id = scan.next();
			System.out.println("비밀번호 : ");
			String pw = scan.next();
			System.out.println("닉네임 : ");
			String username = scan.next();
			System.out.println("나이 : ");
			String age = scan.next();
			System.out.println("가입날짜 : ");
			String regdate = scan.next();
			
			int result = Ex02_DAO.getIns(new Ex02_VO(idx2, id, pw, username, age, regdate));
			if(result > 0) {
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.println("삭제할 idx : ");
			String idx3 = scan.next();
			Ex02_VO vo2 = new Ex02_VO();
			vo2.setIdx(idx3);
			
			int result2 = Ex02_DAO.getDel(vo2);
			if(result2 > 0) {
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.println("번호 : ");
			String idx4 = scan.next();
			System.out.println("아이디 : ");
			String id2 = scan.next();
			System.out.println("비밀번호 : ");
			String pw2 = scan.next();
			System.out.println("닉네임 : ");
			String username2 = scan.next();
			System.out.println("나이 : ");
			String age2 = scan.next();
			System.out.println("가입날짜 : ");
			String regdate2 = scan.next();
			
			int result3 = Ex02_DAO.getUp(new Ex02_VO(idx4, id2, pw2, username2, age2, regdate2));
			if(result3 > 0) {
				// 성공시 DB에서 전체 테이블 정보 가져오세요
				List<Ex02_VO> list2 = Ex02_DAO.getList();
				prn(list2);
			}else {
				System.out.println("수정 실패");
			}
			break;
		}
	}
	
		public static void prn(List<Ex02_VO> list) {
			System.out.println("번호\t이름\t주소\t\t전화번호");
			for (Ex02_VO k : list) {
				System.out.print(k.getIdx() + "\t");
				System.out.print(k.getId() + "\t");
				System.out.print(k.getPw() + "\t");
				System.out.print(k.getUsername() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.println(k.getRegdate() + "\n");
			}
		}

		public static void prn(Ex02_VO vo) {
			System.out.print(vo.getIdx() + "\t");
			System.out.print(vo.getId() + "\t");
			System.out.print(vo.getPw() + "\t");
			System.out.print(vo.getUsername() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.println(vo.getRegdate() + "\n");
		}
}
