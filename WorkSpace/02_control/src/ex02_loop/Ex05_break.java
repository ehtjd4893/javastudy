package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {

		// break문
		// 1. switch문을 종료합니다.
		// 2. loop문을 종료합니다.
		
		// 주요 사용
		// 무한루프 + break문
		
		// 무한루프
		// 1. while(true) { } -- 추천
		// 2. for( ; ; ) { }

		Scanner sc = new Scanner(System.in);
		
		String city = null;
		while(true) {
			System.out.print("대한민국의 수도는?");
			city = sc.next();
			
			if(city.equalsIgnoreCase("seoul") || city.equals("서울")) {
				System.out.println("정답입니다.");
				break;
			} else
				System.out.print("오답입니다.");
		}
		
		
		// 1부터 시작하는 모든 정수를 더한다. 합계가 3000을 넘을 때까지
		// 실행 예시 1부터 77까지 더하면 3003입니다.
		
		int sum = 0;
		int n = 1;
		while(true) {
			sum += n++;
			if(sum > 5000) {
				n--; break;
			}
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum);
		
		
		sc.close();
	}

}
