package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;

public class StaffDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	private static StaffDao staffdao = new StaffDao();
	
	private StaffDao() {}
	public static StaffDao getInstance() {
		return staffdao;
	}
	
	// 접속
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SPRING";
		String password = "1111";
		
		return DriverManager.getConnection(url, user, password);
	}
	
	// 접속 해제	
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		
			try {
				if(rs != null) rs.close();	
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	// 가장 높은 번호의 사원번호
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
				no = rs.getInt(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { close(con, ps, rs);}
		
		return no;
	}
	
	// 사원 추가
	public int insertStaff(StaffDto dto) {
	
		try {
			con = getConnection();
			sql = "INSERT INTO staff(no, name, department, hireDate) VALUES(?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getNo());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getDepartment());
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { close(con,ps,null);}
		return result;
	}
	
	// 사원 수정
	public int updateStaff(StaffDto dto) {
		try {
			con = getConnection();
			sql = "UPDATE staff SET name = ?, department = ? where no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getDepartment());
			ps.setInt(3, dto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,null);}
		
		return result;
	}
	
	// 사원 삭제
	public int deleteStaff(StaffDto dto) {
		try {
			con = getConnection();
			sql = "DELETE FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getNo());
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,null);}
		return result;
	}
	
	// staff 조회
	public StaffDto selectOne(int no) {
		StaffDto dto = null;
		try {
			con = getConnection();
			sql = "SELECT * FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new StaffDto();
				dto.setNo(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setDepartment(rs.getString(3));
				dto.setHireDate(rs.getDate(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,rs);}
		
		return dto;
	}
	
	
	// 전체 조회
	public List<StaffDto> selectList(){
		List<StaffDto> list = new ArrayList<>();
		try {
			con = getConnection();
			sql = "SELECT * FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				StaffDto dto = new StaffDto();
				dto.setNo(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setDepartment(rs.getString(3));
				dto.setHireDate(rs.getDate(4));
				list.add(dto);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,rs);}
		return list;
	}
}
