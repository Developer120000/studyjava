package com.ict.mybatis;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체 테이블 보고
		List<Ex01_VO> list = Ex01_DAO.getList();
		prn(list);
		
		//
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 특정 데이터 보기");
		System.out.println("2. customer 테이블 데이터 삽입하기");
		System.out.println("3. customer 테이블 데이터 삭제하기");
		System.out.println("4. customer 테이블 데이터 수정하기");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println("검색할 custid : ");
			// mapper 에서 파라미터를 String 으로 받게 설정했으므로 String 으로 받는다
			String custid = scan.next();
			Ex01_VO vo = Ex01_DAO.getOne(custid);
			prn(vo);
			break;
		case 2:
			System.out.println("삽입할 정보를 입력하세요");
			System.out.println("번호 : ");
			String custid2 = scan.next();
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("주소 : ");
			String address = scan.next();
			System.out.println("전화번호 : ");
			String phone = scan.next();
			
			int result = Ex01_DAO.getIns(new Ex01_VO(custid2, name, address, phone));
			if(result > 0) {
				// 성공시 DB에서 전체 테이블 정보 가져오세요
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.println("삭제할 custid : ");
			// mapper 에서 파라미터를 String 으로 받게 설정했으므로 String 으로 받는다
			String custid3 = scan.next();
			Ex01_VO vo2 = new Ex01_VO();
			vo2.setCustid(custid3);
			
			int result2 = Ex01_DAO.getDel(vo2);
			if(result2 > 0) {
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.println("번호 : ");
			String custid4 = scan.next();
			System.out.println("이름 : ");
			String name2 = scan.next();
			System.out.println("주소 : ");
			String address2 = scan.next();
			System.out.println("전화번호 : ");
			String phone2 = scan.next();
			
			int result3 = Ex01_DAO.getUp(new Ex01_VO(custid4, name2, address2, phone2));
			if(result3 > 0) {
				// 성공시 DB에서 전체 테이블 정보 가져오세요
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			}else {
				System.out.println("수정 실패");
			}
			break;
		}

	}

	// customer 테이블 전체 보기
	public static void prn(List<Ex01_VO> list) {
		System.out.println("번호\t이름\t주소\t\t전화번호");
		for (Ex01_VO k : list) {
			System.out.print(k.getCustid() + "\t");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getAddress() + "\t");
			System.out.println(k.getPhone() + "\n");
		}
	}

	// customer 테이블 특정 데이터 보기
	public static void prn(Ex01_VO vo) {
		System.out.println("번호\t이름\t주소\t\t전화번호");
		System.out.print(vo.getCustid() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getAddress() + "\t");
		System.out.println(vo.getPhone() + "\n");
	}
}
