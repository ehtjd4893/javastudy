package ex01_random;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"가위", "바위", "보"};
		int win = 0;
		int draw = 0;
		int p_idx = 0;
		int c_idx = 0;
		loop : while(true) {
			System.out.print("가위바위보 >>> ");
			switch(sc.next()) {
			case "바위":
				p_idx = 1;
				break;
			case "보":
				p_idx = 2;
			}
			// diff = player - computer
			// 이긴 경우: -2, 1
			// 비긴 경우: 0
			c_idx = (int)(Math.random() * 3);
			
			System.out.print("Player는 " + arr[p_idx] + ", Computer는 " + arr[c_idx] + ", ");		
			
			switch(p_idx - c_idx) {
			case -2: case 1:
				win++;
				System.out.println("이겼습니다.");
				break;
			case 0:
				draw++;
				System.out.println("비겼습니다.");
				break;
			default:
				System.out.println("졌습니다.");
				break loop;
			}
			
		}
		System.out.println(win + "승" + draw + " 무입니다.");
		sc.close();
	}

}
