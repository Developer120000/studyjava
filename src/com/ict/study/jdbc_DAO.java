package com.ict.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int res = 0;

	private static jdbc_DAO dao = new jdbc_DAO();

	public static jdbc_DAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@192.168.219.101:1521:xe";
			String user = "c##study";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
		}
		return null;
	}

	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("번호\t이름\t주소\t\t전화번호");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void getSelectOne(int custid) {

		try {
			conn = getConnection();

			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t이름\t주소\t\t전화번호");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (SQLException e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
	}
}