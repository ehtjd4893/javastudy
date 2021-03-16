package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// switch문 사용, 단계를 숫자로 입력받아서 구분 출력
		// 1 입력: 기승전결
		// 2 입력: 승전걸
		// 3 입력: 전결
		// 4입력 : 결
		// 나머지 입력: 알 수 없음
		Scanner sc = new Scanner(System.in);
		System.out.println("단계(1~4)를 입력해주세요.");
		int stage = sc.nextInt();
		
		switch (stage) {
		case 1:
			System.out.print("기");		
		case 2:
			System.out.print("승");		
		case 3:
			System.out.print("전");		
		case 4:
			System.out.println("결");		
			break;
		default:
			System.out.println("알 수 없음");
			break;
		}
		
//		switch (stage) {
//		case 1:
//			System.out.print("기승전결");		
//			break;
//		case 2:
//			System.out.print("기승");	
//			break;
//		case 3:
//			System.out.print("기승전");		
//			break;
//		case 4:
//			System.out.println("기승전결");		
//			break;
//		default:
//			System.out.println("알 수 없음");
//			break;
//		}
		sc.close();
	}

}
