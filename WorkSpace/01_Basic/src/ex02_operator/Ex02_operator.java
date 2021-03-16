package ex02_operator;

import java.util.Scanner;

public class Ex02_operator {

	public static void main(String[] args) {
		
		// 4. 관계 연산자: >, >=, <, <=, ==, !=
		// 결과값은 boolean 타입으로 반환
		
		int age = 20;
		boolean isAdult = age >= 20;
		
		System.out.println(isAdult);
		
//		Scanner sc =  new Scanner(System.in);
//		age = sc.nextInt();
//		isAdult = age >= 20;
//		System.out.println(isAdult);
		
		
		// 5. 논리연산자: &&, ||, !
		// 대부분 관계 연산자와 함께 사용됨.
		// 1) &&: 모든 관계 연산의 결과가 true이면 true값, 하나라도 false라면 false값 반환
		// 2) ||: 하나의 관계 연산 결과라도 true이면 true값, 모든 결과값이 false라면 false 반환
		// 3) !: 결과값의 반대를 반환
				int a = 10, b = 10;
		System.out.println(a == 10 && b == 10);	// a, b 모두 10 이므로 true
		System.out.println(a == 10 || b == 10);	// a, b 모두 10 이므로 true
		System.out.println(!(a == 10));	// false
	
		System.out.println(a == 0 && ++b > 0); // false 값 반환, a != 0 이므로 false값이 나오게 됨. 따라서 && 뒤의 관계 연산자에 접근 x.
		System.out.println(a);				// 10 반환
		System.out.println(b);				// 10 반환. 왜냐하면  33번 줄에서 a==0을 만족하지 않기 때문에 ++b > 0 에 접근하지 않았기 때문.
	
		System.out.println(a == 10 || ++b > 0);	// true값 반환, a = 10이므로 어차피 true이기 때문에 || 뒤의 연산 접근 x
		System.out.println(a);				// 10 반환
		System.out.println(b);				// 10 반환 왜냐하면  37번 줄에서 a==10을 만족하기 때문에 ++b > 0 에 접근하지 않았기 때문.
	
	}

}
