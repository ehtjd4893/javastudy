package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) {
		try {
			// 1. oracle.jdbc.driver.oracleDriver 클래스를 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 접속 정보
			String user = "spring"; // 대소문자 구분 없음
			String password = "1111";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	// Oracle 11g Express Edition의 경우 url
																// DB서버 주소 127.0.0.1 ( = localhost )
				
			// 3. 접속
			// DriverManager 클래스가 접속 담당
			// 접속 결과는 Connection 인터페이스에 저장
			// SQLException 발생 가능..(오타 있을 경우) 
			Connection con = DriverManager.getConnection(url, user, password);
			
			// 4. 접속이 성공하면, try - catch 구문의 특성상 여기로 도착함
			System.out.println("DB에 접속되었습니다.");
			
			// 5. 접속 종료
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}


