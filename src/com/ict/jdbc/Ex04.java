package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// customer 의 이강인 삭제하기
		// sql 하고 결과가 다르게 나오는건 자바는 오토커밋이 되어있어서
		
		// 오라클에 접속을 위한 초기값들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int res = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			String sql = "delete from customer where custid = 6";
			
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			
			if(res > 0) {
				System.out.println("삭제 성공");
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}else {
				System.out.println("삭제 실패");
			}
			
			
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
