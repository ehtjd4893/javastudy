package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의 배수" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해주세요.");
		int num = 0;
		
		do {
			num = sc.nextInt();
			if(num > 0)
				break;
			else
				System.out.println("잘못된 입력입니다. 양수를 입력해주세요.");
		}while(true);

		// 각 자릿수의 합을 통해 3의 배수인지 판별하는 것...비효율...		
//		int sum = 0;	
//		for(int tmp = num; tmp % 10 > 0; tmp /= 10) {
//			sum += tmp % 10;
//		}
		if(num % 3 == 0)
			System.out.println("3의 배수입니다.");
		else if(num % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		sc.close();
	}

}
