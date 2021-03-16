package ex01_Variable;

public class Ex01_literal {

	public static void main(String[] args) {
		// 1) 정수 표현법: 그냥 입력한다.		
		System.out.println(Integer.MAX_VALUE); 	// 2^31 - 1
		System.out.println(Integer.MIN_VALUE);	// -(2^31) 
		System.out.println(Integer.SIZE);		// bit 단위 ( 4바이트 = 32비트 )
		System.out.println(2147483648L); 		// int 범위를 벗어나면 접미사 L을 붙여준다.
		
		
		// 2) 실수 표현법: 그냥 입력한다.
		System.out.println(Double.MAX_VALUE);
		// 1.7976931348623157E308 의 의미: 1.7976931348623157 x 10^308
		System.out.println(Double.MIN_VALUE);
		// 4.9E-324 의 의미: 4.9 x 10^(-324)
		
		
		// 3) 문자 표현법: ' ' 로 묶는다.
		System.out.println('A');
		System.out.println('한');
		
		// 4) 문자열 표현법: " " 로 묶는다.
		System.out.println("안녕하세요?");
		
		// 5) 논리 표현법: true or false
		System.out.println(true);
		System.out.println(false);



	}

}
