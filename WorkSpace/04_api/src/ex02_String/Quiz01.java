package ex02_String;

import java.util.Scanner;

// 시간을 입력받아서 출력하기

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력 >>> ");
		int hour = sc.nextInt();

		System.out.print("분 입력 >>> ");
		int min = sc.nextInt();

		System.out.print("초 입력 >>> ");
		int sec = sc.nextInt();

		String strH = hour + "";
		String strM = min + "";
		String strS = sec + "";
		
		if(strM.length() == 1)	// min < 10
			strM = "0" + strM;
		
		if(strS.length() == 1)	// sec < 10
			strS = "0" + strS;
		
		System.out.println(strH + ":" + strM + ":" + strS );
		
//		System.out.println(hour + ":" 
//					+ (min < 10 ? "0" + min : min) + ":" 
//					+ (sec < 10 ? "0" + sec : sec));		
		
		sc.close();
	}

}
