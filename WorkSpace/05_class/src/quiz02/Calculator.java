package quiz02;

public class Calculator {
	
	// method
	
	// 1. 결과타입: void
	// 2. 메소드명: addition
	// 3. 매개변수: int값 2개
	// 4. 역할: 전달된 인수의 합계결과를 보여준다.
	// 		1 + 2 = 3
	void addition(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	// 1. 결과타입: int
	// 2. 메소드명: subtraction
	// 3. 매개변수: int값 2개
	// 4. 역할: 큰 수에서 작은 수를 뺀 결과를 보여준다.
	// 		3 - 2 = 1
	int subtraction(int a, int b) {
		
		return Math.abs(a - b);
	}
	
}
