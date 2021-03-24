package ex03_dml;
import java.sql.*;

import ex01_connection.DBConnection;
public class InsertMainClass2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConnection.getConnection();
			// 쿼리문에 변수 처리되는 부분은 ?으로 처리
			String sql = "INSERT INTO staff(no, name, department, hireDate) VALUES(?,?,?,?)";
			
			// 변수 처리( ?에 값 전달 )
			ps = con.prepareStatement(sql);
			ps.setInt(1, 2);		// 1번째 ?에 no 전달
			ps.setString(2, "David");	// 2번째 ?에 name 전달
			ps.setString(3, "Car");	// 3번째 ?에 dpt 전달
			ps.setDate(4, new Date(System.currentTimeMillis()));	// 4번째 ?에 date 전달
			
			int result = ps.executeUpdate();
			
			if(result != 0)
				System.out.println("입력 성공");
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
