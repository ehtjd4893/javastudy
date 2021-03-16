package practice;

import java.util.Scanner;

public class star_box {

	public static void main(String[] args) {
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 입력: ");
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		for(int i = 0; i < floor; i++) {
			for(int j = 0; j < floor; j++)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();

	}

}
