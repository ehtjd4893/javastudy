package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		
		// do - while문
		// 1. while문입니다.
		// 2. 반드시 한 번은 실행하는 while문입니다.
		
		Scanner sc = new Scanner(System.in);
		int num;		// num 의 초기값은 이 프로그램에서 의미가 없다.
		int sum = 0;	// 왜냐하면 do - while문이기 때문에 
		do {
			System.out.print("양수를 입력해주세요.(음수 입력시 프로그램 종료)");
			num = sc.nextInt();
			sum += num;
		} while(num >= 0);
		sum -= num;
		System.out.println("Sum = "  + sum);
		
		sc.close();
	}

}
