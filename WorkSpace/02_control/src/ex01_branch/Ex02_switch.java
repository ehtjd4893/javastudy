package ex01_branch;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();

		System.out.print("입력받은 값은 ");
		
		// choice의 자리에 들어갈 수 있는 자료형은 int, long, char. 
		// choice 자리에 (double, boolean) 불가능
		switch(choice) {
		case 1:
			System.out.println("1입니다.");
			break;	// 만약 break문이 없다면 case2의 break문을 만나기 전까지 switch문을 종료하지 않는다.
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("범위를 벗어난 입력입니다.");
			break; // 불필요한 부분, 없더라도 switch 문은 종료된다.
			
		}
		sc.close();
	}

}
