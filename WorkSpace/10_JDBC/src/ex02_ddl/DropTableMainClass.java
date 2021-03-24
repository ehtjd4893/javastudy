package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ex01_connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {

		// try {} 블록과 finally {} 블록에서 모두 사용하기 위해 main() 메소드(try 바깥)에 선언한다.
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			ps = con.prepareStatement(sql);
			
			ps.executeUpdate();
			System.out.println("staff 테이블 삭제 완료");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null)	ps.close();
				if(con != null)	con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
