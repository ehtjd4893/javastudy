package ex03_dml;

/*import java.sql.Connection;
import java.sql.PreparedStatement;*/
import java.sql.*;	// java.sql의 모든 것을 import함
import ex01_connection.DBConnection;

public class InsertMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		 
		try {
			String sql = "INSERT INTO staff values(1,'Alice','Computer','2021-03-24')";
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			
			int result = ps.executeUpdate();
			// executeUpdate() 의 반환값은
			// 변화가 생긴 행(row)의 개수가 반환됨.
			// 실패시 0, 성공시 인서트한 row의 개수 반환
			if(result != 0)
				System.out.println("인서트 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
