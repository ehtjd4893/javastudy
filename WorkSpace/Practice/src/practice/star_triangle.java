package practice;

import java.util.Scanner;



public class star_triangle {
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		int cnt = 0;
		for(int i = n; i > 0; i--) {
			
			for(int k = 0; k < cnt; k++)
				System.out.print(" ");
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		int cnt = n-1;
		for(int i = 0; i < n; i++) {
			
			for(int k = 0; k < cnt; k++)
				System.out.print(" ");
			for(int j = 0; j < i+1; j++) {
				
				System.out.print("*");
			}
			cnt--;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.print("단 수 입력: ");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		//triangleLB(floor);
		//triangleLU(floor);
		//triangleRU(floor);
		triangleRB(floor);
		sc.close();
	}

}
