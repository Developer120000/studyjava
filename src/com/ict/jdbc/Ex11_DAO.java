package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO(Date Access Object) : DB의 데이터에 접근하기 위한 객체
// DB에 접근하기 위한 로직을 분리하기 위해 사용
// 직접DB에 접근하여 data 를 삽입, 삭제, 수정, 검색을
// 조작할 수 있는 기능을 가진 클래스

// DB에 접속해서 각종 SQL 처리하는 클래스
public class Ex11_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int result = 0;
	
	// 싱글턴 패턴 : 소프트웨어 디자인 패턴 중 하나이다.
	//				 생성자가 여러차례 호출 되더라도 실제 생성되는 객체는 하나이고
	//				 최초 생성 이후에는 호출된 생성자는 최초 생성자가 생성한 객체를 리턴한다.
	//				 프로그램이 끝날 때 까지 객체를 하나만 사용한다.
	//				 Spring 은 기본적으로 싱글턴 패턴을 사용
	
	private static Ex11_DAO dao = new Ex11_DAO();
	public static Ex11_DAO getInstance() {
		return dao;
	}
	
	// DB 접속 메소드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}
	
	// 나머지 메소드들은 사용자의 요구에 맞는 메소드를 만들어서 처리한다.
	// customer 테이블 전체 보기
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("번호\t이름\t주소\t\t전화번호");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (Exception e) {
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
	
	// 검색할 custid 를 받자
	public void getSelectOne(int custid) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			rs = pstmt.executeQuery();
			System.out.println("번호\t이름\t주소\t\t전화번호");
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (Exception e) {
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
	
	// customer 테이블에 데이터 삽입하자
	// 삽입 성공 여부 int 결과를 반환형으로 써서 main case3에 결과 반환 
	public int getInsert(int custid, String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql = "insert into customer(custid, name, address, phone) "
					+ " values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			result = pstmt.executeUpdate();
			return result;
			
		} catch (Exception e) {
		}
		return 0;
	}
	
	// 삭제할 custid 를 받자
	public void getDelete(int custid) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			result = pstmt.executeUpdate();
			
			// 성공하면 전체보기 메소드 호출
			if(result > 0) {
				getSelectAll();
			}else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
		}
		
	}
	
	public void getUpdate(int custid, String name, String address, String phone) {
		try {
			conn = getConnection();
			String sql = "update customer set name = ?, address = ?, phone = ? where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			result = pstmt.executeUpdate();
			
			// 성공하면 전체보기 메소드 호출
			if(result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
		} 
	}
	
	
	
	
}
