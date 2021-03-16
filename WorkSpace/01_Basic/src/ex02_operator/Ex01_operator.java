package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		// 1. 산술연산자: +, -, *, /, %
		System.out.println(7 + 2);	// 9
		System.out.println(7 - 2);	// 5
		System.out.println(7 * 2);	// 14
		System.out.println(7 / 2);	// 3 (몫)
		System.out.println(7 % 2);	// 1 (나머지)
		
		System.out.println(7.0 / 2.0);	// 3.5
		// System.out.println(7.0 / 2);	// 3.5
		// System.out.println(7 / 2.0);	// 3.5
	
		
		// 2. 증감연산자: ++, --
		int a = 10;
		System.out.println(a++); // 10 출력 후 10 + 1 저장
		System.out.println(++a); // 11 + 1 하고 출력
		
		int b = 10;
		System.out.println(b--); // 10 출력 후 10 - 1 저장
		System.out.println(--b); // 9 - 1 저장 후 출력
		
		System.out.println(a+b); // 20 출력
		
		// 3. 대입연산자: =, +=, -=, *=, /=, %=
		// 문제) x와 y를 교환해 봅니다.
		int x = 1, y = 2;
		int tmp = x; // x값 임시변수 tmp에 백업
		x = y;		// x에 y값 대입,
		y = tmp;	// y에 tmp에 백업해둔 값 대입.
		System.out.println(x + ", " + y);
		
		// a += 1 : a = a + 1
		// a -= 1 : a = a - 1
		// a *= 2 : a = a * 2
		// a /= 2 : a = a / 2
		// a %= 2 : a = a % 2
		
		// 문제) money를 5% 증가시켜봐라.
		int money = 100;
		// money = money + (int)(money * 0.05);
		// money += (int)(money * 0.05);
		money *= 1.05;
		
		System.out.println(money);
	}

}
