package ex01_Variable;


public class Ex03_primitive_type {

	public static void main(String[] args) {
		// 정수 타입
		
		// 1) byte
		// 크기 1바이트, 단독 사용은 아니고 배열로 사용.
		System.out.println(Byte.MAX_VALUE);	// 127
		System.out.println(Byte.MIN_VALUE);	// -128
		System.out.println(Byte.SIZE); 		// 1 byte = 8 bit
	
		// 비트에 의한 값의 범위
		// 8비트 값의 범위: -2^7 ~ 2^7 -1 ...
		// n비트 값의 범위 : -2^(n-1) ~ 2^(n-1) -1
		
		
		// 2) short, 학습 필요 x
		
		
		// 3) int
		// 4바이트, 일반적인 정수 자료형
		System.out.println(Integer.MAX_VALUE);	// 2^31 - 1
		System.out.println(Integer.MIN_VALUE);	// -2^31
		System.out.println(Integer.SIZE);		// 4바이트 = 32비트
		
		
		// 4) long
		// 8바이트, int보다 큰 정수 자료형.
		System.out.println(Long.MAX_VALUE);	// 2^63 - 1
		System.out.println(Long.MIN_VALUE);	// -2^63
		System.out.println(Long.SIZE);		// 8바이트 = 64비트
		
		
		// 실수 타입
		// 1) float
		// 4바이트, 과거 프로그램 호환용.
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.SIZE);			// 4바이트 = 32비트
		
		
		// 2) double
		// 8바이트, 일반적인 실수 자료형
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);	
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_EXPONENT);
		System.out.println(Double.SIZE);		// 8바이트 = 64비트
		
		
		// 실수의 자료형은 부호, 소수부, 지수부를 구분지어 저장하기 때문에
		// 정수의 자료형과 구조적으로 다르다.
		// 소수 자리수는 부정확할 수 있다.(BigDecimal 클래스를 이용해서 정확히 표현 가능하다.)
		
		
		// 문자 타입
		// 1) char
		// 크기 2바이트, 유니코드(국제 표즌 코드)기반
		// 2^16 = 65,536 개의 문자를 표현 가능.
		System.out.println(Character.SIZE);		// 2바이트 = 16비트
		
		
		// 논리 타입
		// 1) boolean
		// 크기: 이론상 1비트, but 컴퓨터 메모리구조상 1바이트를 사용.
		
		
		

		// 변수 선언
		int a = 10;
		long b = 12345678900L;
		char c = 'a';
		double d = 1.5;
		float e = 1.5F;
		boolean f = true;
		
		// primitive type은 변수에 데이터가 그대로 저장된다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		
	}

}
