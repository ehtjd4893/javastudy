package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ex01_connection.DBConnection;

public class SelectListMainClass {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT * FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Map> list = new ArrayList<Map>();
			while(rs.next()) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("no", rs.getInt(1));
				m.put("name", rs.getString(2));
				m.put("department", rs.getString(3));
				m.put("hireDate", rs.getDate(4));
				list.add(m);
			}
			System.out.println("검색된 staff 수:" + list.size());
			for(Map<String,Object> m: list) {
				System.out.println(m);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
