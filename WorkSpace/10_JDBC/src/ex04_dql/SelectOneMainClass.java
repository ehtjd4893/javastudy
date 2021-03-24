package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import ex01_connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT no, name, department, hireDate From staff WHERE no = 2";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();		
			// select 실행은 executeQuery() 메소드
			// rs에 저장된 데이터는 반드시 next() 메소드를 호출해 꺼낸다
			// next() 메소드 : 결과 행에서 순서대로 한 행씩 꺼냅니다.
			
			// getInt(1), getInt("no")를 통해 받을 수 있음
			// getString(2), getString("name")
			//getDate(4), getDate("hireDate") 
			if(rs.next()) {
			//	int no = rs.getInt(1);
			//	String name = rs.getString(2);
			//	String dpt = rs.getString(3);
			//	Date date = rs.getDate("hireDate");
			//  System.out.println("no: " + no + ", name: " + name + ", department: " + dpt + ", hireDate: " + date );
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("no", rs.getInt("no")+"");
				hm.put("name", rs.getString(2));
				hm.put("department", rs.getString(3));
				hm.put("hireDate", rs.getDate("hireDate") + "");
				
				System.out.print(hm);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(ps != null) ps.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}

	}

}
