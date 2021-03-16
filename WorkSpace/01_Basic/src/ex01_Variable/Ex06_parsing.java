package ex01_Variable;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Ex06_parsing {

	public static void main(String[] args) {
		
		// String 타입 변환은 parsing입니다.
		
		
		// int를 String으로 변환하기.(int 뿐만 아니라 어떤 자료형이라도 같은 방법으로 문자열변환 가능.)
		int a = 10;
		// System.out.println((String)a); // 오류 발생.
		String a1 = String.valueOf(a);		// 오류 없이 int -> String 형변환 ok
		String a2 = "" + a;			// 문자열의 + 연산은 앞뒤를 연결해주는 것. 결과값도 문자열. 더 일반적인 방법.
		System.out.println(a1);
		System.out.println(a2);
		
		
		// String을 int로 변환하기
		String b = "123";
		int b1 = Integer.parseInt(b);
		// System.out.println((int)b); 	// 오류 발생
		System.out.println(b1);	// 오류 없이 String -> int 형변환 ok
		
		String c = "1.5";
		double cc = Double.parseDouble(c);
		System.out.println(cc);
		
		
		
	}

}
