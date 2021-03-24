package ex01_connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
	
	// method
	// 1. 결과타입 : Connection
	// 2. 메소드명 : getConnection
	// 3. 매개변수 : 없음
	
	public static Connection getConnection() throws Exception {
		// oracle driver를 메모리에 올린다.(사용준비)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String user = "SPRING";
		String password = "1111";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;	
	}
	
}
