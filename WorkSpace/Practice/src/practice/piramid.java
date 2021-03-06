package practice;

import java.util.Scanner;

public class piramid {
	static void spira(int n) {
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = cnt; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < i + cnt * 2 - 1; j++) {
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
	}
	
	static void npira(int n) {
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			for(int j = cnt; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < i + cnt * 2 - 1; j++) {
				System.out.print("" + (i+1));
			}
			cnt++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		
		spira(floor);
		npira(floor);
		sc.close();
	}

}
