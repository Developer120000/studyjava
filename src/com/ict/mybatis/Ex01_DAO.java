package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메소드들을 가지고 있는 클래스
public class Ex01_DAO {
	// MyBatic 에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			// 수동 커밋을 해야 된다.
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메소드들 => mapper.xml 을 호출 하는 메소드
	// select 는 결과(resultType) 여러개, 하나냐에 따라 구분
	// 			 파라미터가 없냐, 하나이냐(VO), 두개 이상(List<VO>) 이냐 에 따라 구분
	
	// customer 테이블의 전체 내용 보기 : 결과 - 여러개 - List<VO> 로 받아야한다.
	//									  파라미터는 없다.
	public static List<Ex01_VO> getList(){
		List<Ex01_VO> list = null;
		// 결과가 여러개 나올수 있을 때 selectList 사용 (한개나올수 있더라도 여러개 나올 확률이 있다면)
		// getSession().selectList(mapper.xml 의 namespace.id);
		list = getSession().selectList("customer.getSelectAll");
		return list;
		// 다른거에서는 커밋때문에 따로써줘야한다.
		// select 일때는 바로 return 써도된다
//		return getSession().selectList("customer.getSelectAll");
	}
	
	// customer 테이블의 특정 데이터보기
	// select : 하나 (vo 또는 int 또는 String... )
	// 			파라미터가 있음
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	
	public static int getCnt() {
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}
	
	// insert, update, delete 는 결과 무조건 int
	// insert, update, delete 는 결과 커밋도 해야한다.
	// insert, update, delete 의 파라미터 타입은
	// 하나일때는 VO, String, int ...
	// 두개 이상일때는 무조건 VO 만들어서 넣자
	public static int getIns(Ex01_VO vo) {
		int result = 0;
		result = getSession().insert("customer.getInsert", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getDel(Ex01_VO vo) {
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getUp(Ex01_VO vo) {
		int result = 0;
		result = getSession().update("customer.getUpdate", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
}
