package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex02_DAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = Ex02_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	public static List<Ex02_VO> getList(){
		List<Ex02_VO> list = null;
		
		list = getSession().selectList("Members.getSelectAll");
		return list;
	}
	
	public static Ex02_VO getOne(String idx) {
		Ex02_VO vo = null;
		vo = getSession().selectOne("Members.getSelectOne", idx);
		return vo;
	}
	
	public static int getIns(Ex02_VO vo) {
		int result = 0;
		result = getSession().insert("Members.getInsert", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getDel(Ex02_VO vo) {
		int result = 0;
		result = getSession().delete("Members.getDelete", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getUp(Ex02_VO vo) {
		int result = 0;
		result = getSession().update("Members.getUpdate", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
}
