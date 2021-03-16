package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		// 무한루프 만들기
		// 데이터의 개수가 몇개인지 정확히 모르겠을 때 while문을 주로 이용
//		while(true) {
//			System.out.println("무한루프입니다.");	
//			
//		}
		
//		int n = 1;
//		while( n <= 10) {
//			System.out.println(n++);
//		}
//		
//		while( n > 1) {
//			System.out.println(--n);
//		}
		
		// 'A'~ 'Z' 사이를 계속 입력 받는 프로그램
		char input = 'A' - 1;
		Scanner sc = new Scanner(System.in);
		
		while('A' > input || input > 'Z') {
			System.out.print("대문자를 입력해주세요.");
			input = sc.next().charAt(0);				
		}
		
		// 입력받은 정수를 모두 더한다. 0 이상은 모두 더하고 음수가 입력될 시 그만 두고 합계를 출력.
		int sum = 0;
		int num = 0;

		while(num >= 0) {
			System.out.println("더할 양수값을 입력해주세요.(음수 입력시 프로그램 종료)");
			num = sc.nextInt();
			sum += num;
		}
		sum -= num;
		
		System.out.println("합계: " + sum);
		
		sc.close();
	}

}
