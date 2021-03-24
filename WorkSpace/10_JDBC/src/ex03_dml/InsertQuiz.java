package ex03_dml;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import ex01_connection.DBConnection;


public class InsertQuiz {

	public static void main(String[] args) {
		// 임의의 3명 staff 삽입
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO staff(no, name, department, hireDate) VALUES(?,?,?,?)";
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(sql);
			
			int result = 0;
			String[] nameList = {"Yumi","Darius", "Jax"}; 
			String[] dptList = {"Supporter", "Top","Top"};
			Date date = new Date(System.currentTimeMillis());
			String[] dateList = {"2021-03-24","2020-03-24","2019-03-24"};
			for(int i = 0; i < 3; i++) {	
				ps.setInt(1, i+3);
				ps.setString(2,nameList[i]);
				ps.setString(3,dptList[i]);
				ps.setString(4, dateList[i]);
				result += ps.executeUpdate();
			}
			
			if(result == 3 )
				System.out.println("3행 삽입 성공");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)
					ps.close();
				if(con!=null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
