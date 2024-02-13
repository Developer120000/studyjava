package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

//**순서 매우 중요**
//사용자 > Main > DAO > mapper > DB > mapper > DAO > Main > 출력

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 전체 테이블 보기
		// DB 처리하려면 무조건 DAO 로 가야한다.
		// 값이 4줄이 들어있으니까 List로 받아야한다.
		List<Ex01_VO> list = Ex01_DAO.getList();
		// prn2 에 static 안쓰고 객체생성해서 출력하는 방법
		Ex01_Main main = new Ex01_Main();
		main.prn2(list);
		
		System.out.println("선택하세요");
		System.out.println("1. Members 테이블 특정 데이터 보기");
		System.out.println("2. Members 테이블 데이터 삽입하기");
		System.out.println("3. Members 테이블 데이터 삭제하기");
		System.out.println("4. Members 테이블 데이터 수정하기");
		System.out.println("5. Members 테이블 로그인 하기");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println("검색할 idx : ");
			String idx = scan.next();
//			idx 검색 - 기본키 - 하나 - VO 로 나온다.
//			하나인지 여러개인지 모를때는 여러개로 받자 - 리스트로 받아서 size() 를 체크하자
			Ex01_VO vo = Ex01_DAO.getOne(idx);
//			vo 받는 prn 메서드를 만들자(오버로딩)
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
			
			// 날짜는 오늘 날짜로 sysdate 사용
//			파라미터가 여러개 - VO 로 만들자
			Ex01_VO vo2 = new Ex01_VO();
//			setter 를 이용하여 받은 정보 넣어주자
			vo2.setIdx(idx2);
			vo2.setId(id);
			vo2.setPw(pw);
			vo2.setUsername(username);
			vo2.setAge(age);
			
//			insert, delete, update 는 결과가 무조건 int
			int result = Ex01_DAO.getIns(vo2);
//			삽입 성공 시 테이블 전체 데이터 보기
			if(result > 0) {
//				위에 있는 list 를 사용하면 DB 갔다온게 아니기 때문에 
				//	삽입 성공 후 변경된 테이블을 볼 수 없다.
				//	다시 DB 에 가서 리스트를 가져오자
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				main.prn2(list2);
			}else {
				System.out.println("삽입 실패");
			}
			break;
		case 3:
			// 파라미터가 하나일 때 스트링 처리 
			System.out.println("삭제할 idx : ");
			String idx3 = scan.next();
			int result2 = Ex01_DAO.getDel(idx3);
			if(result2 > 0) {
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				main.prn2(list2);
			}else {
				System.out.println("삭제 실패");
			}
			break;
			
			// 파라미터가 하나일 때 vo 사용해서 처리
//			System.out.println("삭제할 idx : ");
//			String idx3 = scan.next();
//			Ex01_VO vo3 = new Ex01_VO();
//			vo3.setIdx(idx3);
//			
//			int result2 = Ex01_DAO.getDel(vo3);
//			if(result2 > 0) {
//				List<Ex01_VO> list2 = Ex01_DAO.getList();
//				main.prn2(list2);
//			}else {
//				System.out.println("삭제 실패");
//			}
//			break;
		case 4:
			System.out.println("수정할 정보를 입력하세요");
			System.out.println("idx : ");
			String idx4 = scan.next();
			System.out.println("닉네임 : ");
			String username2 = scan.next();
			System.out.println("나이 : ");
			String age2 = scan.next();
			
			Ex01_VO vo4 = new Ex01_VO();
			vo4.setIdx(idx4);
			vo4.setUsername(username2);
			vo4.setAge(age2);
			
			int result3 = Ex01_DAO.getUp(vo4);
			if(result3 > 0) {
				// 성공시 DB에서 전체 테이블 정보 가져오세요
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				main.prn2(list2);
			}else {
				System.out.println("수정 실패");
			}
			break;
		case 5 : 
			System.out.println("id : ");
			String id2 = scan.next();
			System.out.println("pw : ");
			String pw2 = scan.next();
			
			Ex01_VO vo5 = new Ex01_VO();
			vo5.setId(id2);
			vo5.setPw(pw2);
			
			Ex01_VO vo6 = Ex01_DAO.getLogin(vo5);
			if(vo6 != null) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		}
	}
	
//		public static void prn(List<Ex01_VO> list) {
//			System.out.println("번호\t이름\t주소\t\t전화번호");
//			for (Ex01_VO k : list) {
//				System.out.print(k.getIdx() + "\t");
//				System.out.print(k.getId() + "\t");
//				System.out.print(k.getPw() + "\t");
//				System.out.print(k.getUsername() + "\t");
//				System.out.print(k.getAge() + "\t");
//				System.out.println(k.getRegdate().substring(0, 10) + "\n");
//			}
//		}
		
		// static 안쓰고 객체생성해서 출력하는 방법
		public void prn2(List<Ex01_VO> list) {
			System.out.println("번호\t아이디\t비밀번호\t닉네임\t나이\t가입날짜");
			for (Ex01_VO k : list) {
				System.out.print(k.getIdx() + "\t");
				System.out.print(k.getId() + "\t");
				System.out.print(k.getPw() + "\t");
				System.out.print(k.getUsername() + "\t");
				System.out.print(k.getAge() + "\t");
				System.out.println(k.getRegdate().substring(0, 10) + "\n");
			}
		}

		public static void prn(Ex01_VO vo) {
			System.out.println("번호\t아이디\t비밀번호\t닉네임\t나이\t가입날짜");
			System.out.print(vo.getIdx() + "\t");
			System.out.print(vo.getId() + "\t");
			System.out.print(vo.getPw() + "\t");
			System.out.print(vo.getUsername() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.println(vo.getRegdate().substring(0, 10) + "\n");
		}
}
