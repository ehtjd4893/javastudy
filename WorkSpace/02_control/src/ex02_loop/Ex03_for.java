package ex02_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		// for문
		// 1. 반복의 횟수나 범위가 명확할 때 사용합니다.
		// 2. 배열이나 리스트와 같은 반복 가능 객체 (iterable)에서 사용합니다.
		// 3. 동작 순서
		// for( ①; ②; ④){③본문}		- 숫자는 동작순서.
		// ①은 최초1 회만 동작
		// ② ③ ④ 는 반복합니다.
		
		
		// 1 ~ 10 출력
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 3번 "Hello Java"를 출력하는 포문
		for(int i = 0; i <= 2; i++) {
			// 사용되는 i : 0, 1, 2
			System.out.println("Hello Java");
		}
		
		
	}

}
