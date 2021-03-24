package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ex01_connection.DBConnection;

public class CreateTableMainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			// 1. 접속
			con = DBConnection.getConnection();
			
			// 2.쿼리문을 미리 준비
			// PreparedStatement 클래스를 사용하므로...
			// 키워드는 대문자, 테이블/칼럼은 소문자로 작성하는게 좋다.
			String sql = "CREATE TABLE staff( "
					+ "no NUMBER PRIMARY KEY,"
					+ "name VARCHAR2(100),"
					+ "department VARCHAR2(100),"
					+ "hireDate DATE "
					+ ")";
			
			// 3. 쿼리문 처리를 위한 PreparedStatement 객체 생성
			ps = con.prepareStatement(sql);
			
			// 4. 쿼리문 실행
			ps.executeUpdate();
			System.out.println("staff 테이블 생성 완료");

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5. 자원 반납
				try {
					if(ps != null) ps.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
		}

	}

}
