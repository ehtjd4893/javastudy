package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 주민번호(하이픈 없이) 전체 입력 받아서 남녀 구분 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 13자리를 입력하세요(-, 공백 없이)");
		String id = sc.next();
//		char genderNum = id.charAt(6);
//		boolean isMan = (genderNum == '1' || genderNum == '3') ? true : false;
		int iGender = Integer.parseInt(id.substring(6, 7));
		boolean isMan = iGender % 2 == 1 ? true : false;
		System.out.println(isMan ? "남" : "여");
		sc.close();
		
		// 아스키코드 값 중 알아두면 좋은 것.
		// '0' = 48
		// 'A' = 65
		// 'a' = 97
	}

}
