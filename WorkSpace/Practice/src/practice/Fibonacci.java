package practice;

import java.util.Scanner;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n < 2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("피보나치함수에 입력할 수 >> ");
		int x = sc.nextInt();
		System.out.println(x + "의 피보나치값: " + fibonacci(x));
		
		sc.close();
	}

}
