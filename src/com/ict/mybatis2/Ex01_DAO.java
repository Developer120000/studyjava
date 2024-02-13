package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex01_DAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		// null 일때는 만들고 아닐때는 만들어져있는것을 반환
		if(ss == null) {
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	
	// DB처리하는 메소드들
	//	List<Ex01_VO> list = Ex01_DAO.getList(); 메인에서 복사해 가져와서 쓰자
	public static List<Ex01_VO> getList(){
		// 결과 여러줄이면 selectList()
		List<Ex01_VO> list = null;
		//	namespace.id
		//	테이블이름.메서드이름 가지고 메퍼로 가자
		// DB와의 연결을 가지고 있는 getSession 메소드 쓴다
		list = getSession().selectList("Members.getSelectAll");
		return list;
	}
	
	// idx 를 받아서 특정 데이터 보기
	public static Ex01_VO getOne(String idx) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("Members.getSelectOne", idx);
		return vo;
	}
	
	// 정보 받아서 삽입하기
	public static int getIns(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("Members.getInsert", vo);
		// 성공했을 때 커밋해라
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	// idx 받아서 특정 데이터 삭제하기 String 처리
	public static int getDel(String idx) {
		int result = 0;
		result = getSession().delete("Members.getDelete", idx);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	// vo 받아서 특정 데이터 삭제하기
//	public static int getDel(Ex01_VO vo3) {
//		int result = 0;
//		result = getSession().delete("Members.getDelete2", vo3);
//		if(result > 0) {
//			ss.commit();
//		}
//		return result;
//	}
	
	public static int getUp(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("Members.getUpdate", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	//	VO 받아서 특정 데이터 수정
	public static Ex01_VO getLogin(Ex01_VO vo5) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("Members.login", vo5);
		
		// 아이디가 맞지 않으면 null 이 되므로 return null;
		if(vo != null) {
		// pw 를 얻어내자 (DB 에 암호화가 되어있다.)
		String pw = vo.getPw();
		
		// 우리가 입력한 pw 를 암호화 하자.(나중에 더 배워서)
		// String s_pw = vo5.getpw().암호화 메소드 사용;
		
		// DB 에서 꺼낸 pw 와 암호화된 pw 를 비교하자 (나중에 배워서)
		// 이것이 true 면 성공, false 이면 실패
		boolean res = true;
		if(res) {
			// true
			return vo;
		}else {
			// false
			return null;
		}
	}else {
		return null;
		}
	}
	
}
