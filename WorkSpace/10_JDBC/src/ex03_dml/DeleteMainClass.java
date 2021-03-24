package ex03_dml;


import java.sql.*;

import ex01_connection.DBConnection;
public class DeleteMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			String sql = "DELETE from staff where no = ?";
			con = DBConnection.getConnection();
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, 3);
			int result = ps.executeUpdate();
			
			if(result != 0)
				System.out.println("삭제 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(ps != null)
					ps.close();
				if(con != null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
		
			}
			
		}
		

	}

}
