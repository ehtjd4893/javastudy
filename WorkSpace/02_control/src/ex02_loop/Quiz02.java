package ex02_loop;

import java.util.Scanner;

// 영화 평점을 입력받아서 ★을 출력
// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -999;
		
		do {
			if(n != -999)
				System.out.print("잘못된 입력입니다. ");
			System.out.print("영화 평점을 입력해주세요.(1~5 사이의 정수)");
			n = sc.nextInt();

			
		} while(!(1 <= n && n <= 5));
		
		String stars = "";			// "빈 문자열("")은 문자열 연결 연산(+)의 경우 초기화로 사용됨.
		for(int i = 0; i < n; i ++)
			stars += "★";
		
		System.out.print("평점: " + n + "(" + stars + ")");
		sc.close();
	}

}
