package ex03_dml;
import java.sql.*;

import ex01_connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "UPDATE staff SET department = ? where no = ?";
		try {
			 con = DBConnection.getConnection();
			 
			 ps = con.prepareStatement(sql);
			 ps.setString(1, "AD");
			 ps.setInt(2, 3);
			 int result = ps.executeUpdate();
			 if(result != 0 )
				 System.out.println(result + "개의 행 업데이트 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null)
					ps.close();
				if(con !=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
