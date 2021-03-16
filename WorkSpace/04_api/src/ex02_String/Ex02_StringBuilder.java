package ex02_String;

public class Ex02_StringBuilder {

	public static void main(String[] args) {
		
		// java.lang.StringBuilder
		
		// 문자열 생성
		StringBuilder sb = new StringBuilder("hello"); 
		
		
		// 문자열 추가 (핵심 메소드)
		sb.append(" ").append("java");
		
		System.out.println(sb);

		// StringBuilder 을 쓰는 이유
		// String +연산자를 자주 사용하면 성능이 떨어진다.
		// for 또는 while문에 String + 연산자가 있다면,
		// StringBuilder를 사용하는 것이 좋다.

		StringBuilder sb1 = new StringBuilder("hello"); 
		StringBuilder sb2 = new StringBuilder("hello"); 
		// 문자열 비교
		System.out.println(sb1.equals(sb2));
		// StringBuilder 이기 때문에 비교 불가.(String이 아니기 때문에)
		
		// 문자열로 변환
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		
		System.out.println(str1.equals(str2));
	}

}
