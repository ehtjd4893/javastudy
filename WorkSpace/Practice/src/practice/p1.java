package practice;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("a 값: ");
		a = sc.nextInt();
		do {
			System.out.print("b 값: ");
			b = sc.nextInt();
			if(b <= a)
				System.out.println("a보다 큰 값을 입력하세요.");
			else
				break;
		}while(true);
		System.out.println("b - a = " + (b - a));
		sc.close();
	}

}
