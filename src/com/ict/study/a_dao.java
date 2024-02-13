package com.ict.study;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class a_dao {
	private static SqlSession ss;
	
	private synchronized static SqlSession getsession() {
		if(ss == null) {
			ss = a_dbservice.getFactory().openSession();
		}
		return ss;
	}
	
	public static List<a_vo> getList() {
		List<a_vo> list = null;
		
		list = getsession().selectList("Members.getSelectAll");
		return list;
	}
	
	public static a_vo getOne(int idx) {
		a_vo vo = null;
		vo = getsession().selectOne("Members.getOne", idx);
		return vo;
	}
	
	public static int getIns(a_vo vo) {
		int result = 0;
		result = getsession().insert("Members.getIns", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getDel(int vo) {
		int result = 0;
		result = getsession().delete("Members.getDel", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getUp(a_vo vo) {
		int result = 0;
		result = getsession().update("Members.getUp", vo);
		if(result > 0) {
			ss.commit();
		}
		return result;
	}
	
	public static a_vo getLogin(a_vo vo5) {
		a_vo vo = null;
		vo = getsession().selectOne("Members.login", vo5);
		
		if(vo != null) {
			String pw = vo.getPw();
			boolean res = true;
			if(res) {
				return vo;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
	
}
