package ex02_loop;

import java.util.Scanner;

// 1. 퀴즈 맞히기.
// 맞힐 때까지 계속 물어보는 퀴즈입니다.
// 대한민국의 수도는? >> 서울 or seoul
// 정답입니다 or 오답입니다. -> 질문 반복.

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String s = null;
//		while(true) {
//			System.out.print("대한민국의 수도는?");
//			s = sc.next();
//			if(s.equalsIgnoreCase("seoul") || s.equals("서울")) {
//				System.out.println("정답입니다.");
//				break;
//			} else
//				System.out.print("오답입니다.");
//		}
		
		String city = null;
		do {
			if(city != null)
				System.out.println("오답입니다.");
			
			System.out.print("대한민국의 수도는? ");
			city = sc.next();
			
		}while(!city.equals("서울") && !city.equalsIgnoreCase("seoul"));
		
		System.out.println("정답입니다.");
		
		sc.close();
	}

}
