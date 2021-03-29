package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;

// DAO : Database Access Object
// DB의 CRUD를 처리하는 메소드를 포함하고 있습니다.


public class StaffDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
		
	// constructor (singleton pattern)
	// 1. 하나의 StaffDao만 생성할 수 있습니다.
	// 2. 원리
	//   1) 외부에서는 new StaffDao()가 불가능하도록 설계
	//   2) 내부에서 new StaffDao()를 실행하고 생성된 1개의 인스턴스를
	//     반환하는 메소드를 생성

	// 3. getInstance 메소드 호출 방법
	// private StaffDao(){} 때문에 객체 생성 불가
	// 때문에 클래스 메소드로 StaffDao의 getInstance를 사용해야 함
	// static은 compile time에 실행되기 때문에  
	// staffDao도 static으로 처리해줘야 반환 가능
	private StaffDao() {}
	private static StaffDao staffDao = new StaffDao();
	public static StaffDao getInstance() {
		return staffDao;
	}
		
	// method
	/*** 1. 접속 ***/
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SPRING";
		String password = "1111";
		
		return DriverManager.getConnection(url, user, password);		
	}
	
	/*** 2. 접속 해제 ***/
	public void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/* 3. 가장 최근에 추가된 staff의 no 알아내기 */
	public int selectMaxNo() {
		int no = 0;
		try {
			con = getConnection();
			String sql = "SELECT MAX(no) FROM staff";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next())
				no = rs.getInt(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,rs);}				
		return no;
	}
	
	/* 4. staff 추가 */
	//public int insertStaff(int no, String name, String department, Date hireDate) {
	public int insertStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			String sql = "INSERT INTO STAFF(no, name, department, hireDate) VALUES(?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			ps.setString(2, staffDto.getName());
			ps.setString(3, staffDto.getDepartment());
			result = ps.executeUpdate();// INSERT, DELETE, UPDATE 에 사용
			// SELECT를 할 때는 executeQuary()를 사용
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, ps, null);
		}
		
		return result;	// 삽입되면 1, 실패하면 0 return			
	}
	/* 5. staff 수정하기 */
	public int updateStaff(StaffDto dto) {
		try {
			con = getConnection();
			String sql;
			/*
			 * if(dto.getName() == null) { sql =
			 * "UPDATE staff SET department = ? where no = ?"; }
			 */
			sql = "UPDATE staff SET name = ?, department = ? where no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,dto.getName());
			ps.setString(2,dto.getDepartment());
			ps.setInt(3,dto.getNo());
			result = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return result;
	}
	
	/* 6. staff 삭제 */
	public int deleteStaff(StaffDto dto) {
		try {
			con = getConnection();
			String sql = "DELETE FROM staff WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,dto.getNo());
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return result;
	}
	/* 7. staff 조회 */
	public StaffDto selectOneByNo(int no) {
		StaffDto dto = null;
		
		try {
			con = getConnection();
			String sql = "SELECT no, name, department, hireDate FROM staff WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new StaffDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setDepartment(rs.getString("department"));
				dto.setHireDate(rs.getDate("hireDate"));
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {close(con,ps,rs);}
		
		return dto;
	}
	/* 8. 전체 조회 */
	public List<StaffDto> selectList(){
		List<StaffDto> list = new ArrayList<StaffDto>();
		try {
			con = getConnection();
			String sql = "SELECT * FROM staff";
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
		} finally { close(con,ps,rs); }
		return list;
	}

	
}
