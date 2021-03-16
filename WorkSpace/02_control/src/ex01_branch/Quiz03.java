package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// switch문 사용, 나이 입력 받아서 성인 또는 미성년자 출력
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		switch(age / 10) {
		case 0:
		case 1:
			System.out.println("미성년자입니다/");
			break;
		default:
			System.out.println("성인입니다.");
		}
		
		
//		int state = 0; // 미성년자를 의미
//		if(age >= 20)
//			state = 1; // 성인을 의미
//		
//		switch(state) {
//		case 0:
//			System.out.println("미성년자입니다.");
//			break;
//		case 1:
//			System.out.println("성인입니다.");
//			break;
////		default:	// 0 또는 1 외의 값이 나올 수 없으므로 필요 없는 부분.
////			System.out.println("알 수 없음"); 
//		}
		
		
//		switch(age) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:		
//		case 6:
//		case 7:
//		case 8:
//		case 9:
//		case 10:		
//		case 11:
//		case 12:
//		case 13:
//		case 14:
//		case 15:
//		case 16:
//		case 17:
//		case 18:
//		case 19:
//			System.out.println("미성년자입니다.");		
//			break;
//		default:
//			System.out.println("성인입니다.");		
//		}
		sc.close();
	}

}
