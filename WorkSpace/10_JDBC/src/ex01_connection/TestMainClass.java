package ex01_connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		try {
			/* ==== 인스턴스 메소드 getConnection() ==== 
			DBConnection dbc = new DBConnection();
			Connection con = dbc.getConnection();
			*/
			
			// ==== 클래스 메소드 getConnection() ====
			// 클래스 메소드는 static으로 처리.
			Connection con = DBConnection.getConnection();
			System.out.println("DB 접속에 성공했다!");
			con.close();
			System.out.println ("DB 접속을 해제했다!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
