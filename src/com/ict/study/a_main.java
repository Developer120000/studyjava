package com.ict.study;

import java.util.List;
import java.util.Scanner;

import com.ict.mybatis2.Ex01_VO;

public class a_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<a_vo> list = a_dao.getList();
		
		prn(list);
		
		System.out.println("선택하세요");
		System.out.println("1. Members 테이블 특정 데이터 보기");
		System.out.println("2. Members 테이블 데이터 삽입하기");
		System.out.println("3. Members 테이블 데이터 삭제하기");
		System.out.println("4. Members 테이블 데이터 수정하기");
		System.out.println("5. Members 테이블 로그인 하기");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1:	System.out.println("검색할 idx : ");
				int idx = scan.nextInt();
				
				a_vo vo = a_dao.getOne(idx);
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
			
			a_vo vo2 = new a_vo();
			
			vo2.setIdx(idx2);
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setUsername(username);
			vo2.setAge(age);
			
			int result = a_dao.getIns(vo2);
			if(result > 0){
				List<a_vo> list2 = a_dao.getList();
				prn(list2);
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			System.out.println("삭제할 idx : ");
			int idx3 = scan.nextInt();
			int result2 = a_dao.getDel(idx3);
			if(result2 > 0 ) {
				List<a_vo> list2 = a_dao.getList();
				prn(list2);
			}else {
				System.out.println("삭제 실패");
			}
			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.println("idx : ");
			String idx4 = scan.next();
			System.out.println("닉네임 : ");
			String username2 = scan.next();
			System.out.println("나이 : ");
			String age2 = scan.next();
			
			a_vo vo4 = new a_vo();
			vo4.setIdx(idx4);
			vo4.setUsername(username2);
			vo4.setAge(age2);
			
			int result3 = a_dao.getUp(vo4);
			if(result3 > 0 ) {
				List<a_vo> list2 = a_dao.getList();
				prn(list2);
			}else {
				System.out.println("수정 실패");
			}
			break;
		case 5:
			System.out.println("id : ");
			String id2 = scan.next();
			System.out.println("pw : ");
			String pw2 = scan.next();
			
			a_vo vo5 = new a_vo();
			vo5.setId(id2);
			vo5.setPw(pw2);
			
			a_vo vo6 = a_dao.getLogin(vo5);
			if(vo6 != null) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		}
		
	}
	
	public static void prn(a_vo vo) {
		System.out.println("번호\t아이디\t비밀번호\t닉네임\t나이\t가입날짜");
		System.out.print(vo.getIdx() + "\t");
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getPw() + "\t");
		System.out.print(vo.getUsername() + "\t");
		System.out.print(vo.getAge() + "\t");
		System.out.println(vo.getRegdate().substring(0, 10) + "\n");
	}
	
	public static void prn(List<a_vo> list) {
		System.out.println("번호\t아이디\t비밀번호\t닉네임\t나이\t가입날짜");
		for (a_vo k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getUsername() + "\t");
			System.out.print(k.getAge() + "\t");
			System.out.println(k.getRegdate().substring(0, 10) + "\n");
		}
	}
	

	
}
