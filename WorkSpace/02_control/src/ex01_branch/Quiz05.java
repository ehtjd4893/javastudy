package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// 점수를 입력 받아서 해당 학점을 출력
		// char grade : S, A, B, C, F
		// char point : +, 0, -, ' '
		// 100 : S
		// 99~97 : A+
		// 96~94 : A0
		// 93~90 : A-
		// 89~87 : B+
		// 86~84 : B0
		// 83~80 : B-
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade, point;
		
		point = '-';
		switch(score % 10) {
		case 9: case 8: case 7:
			point = '+';
			break;
		case 6: case 5: case 4:
			point = '0';
		}
		
		grade = 'F';
		
		switch(score / 10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
		default:
			point = ' ';
		}
		
		//System.out.println(grade + point);	// 아스키 코드의 덧셈 값 (숫자) 출력
		System.out.println(""+ grade + point);	// 학점 정상출력
		System.out.println(grade + "" + point);	// 학점 정상출력
		System.out.println(grade + point + "");	// 아스키 코드의 덧셈 값 출력
		// 53번 줄의 경우 char + char을 처리한 후에 문자열을 더하기 때문에 아스키 코드의 덧셈 값으로 출력됨.
		// 51,52번 줄은 문자열 + char을 먼저 하여 문자열을 한 후에 char를 더하기 때문에 String으로 반환.
		
//		switch(score / 10) {
//		case 10:
//			grade = 'S';
//			break;
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		default:
//			grade = 'F';
//		}
//		
//		if(grade != 'F' && grade != 'S') {
//			switch((score % 10) / 3) {
//			case 3:
//			case 2:
//				point = '+';
//				break;
//			case 1:
//				point = (score % 10) != 3 ? '0' : '-';
//				break;
//			case 0:
//				point = '-';
//				break;
//			default:
//					point = ' ';
//			}
//		}
//		else
//			point = ' ';
//		
//		System.out.println(score + "점은 " + grade + point + "학점입니다.");
		sc.close();
		
	}

}
