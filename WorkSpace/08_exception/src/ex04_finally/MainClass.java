package ex04_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int a =0;
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수 입력>>>");
			a = sc.nextInt();
			System.out.println("입력은 " + a + "입니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
		}
		
	}

}
