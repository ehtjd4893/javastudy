package practice;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int positive = -1;;
		do {
			System.out.print("양의 정수 입력: ");
			positive = sc.nextInt();
		} while(positive <= 0);
		int n = positive, cnt = 0;
		
		do {
			n /= 10;
			cnt ++;				
		} while(n != 0);
		
		System.out.println("입력한 수 " + positive + " 는  " + cnt + "자리수입니다." );
		sc.close();
	}

}
