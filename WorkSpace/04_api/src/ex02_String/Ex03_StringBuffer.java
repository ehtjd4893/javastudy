package ex02_String;

public class Ex03_StringBuffer {

	public static void main(String[] args) {

		// java.lang.StringBuffer

		// 1. StringBuilder 와 StringBuffer는 같은 일을 함.
		// 2. StringBuilder는 single thread 환경에서 사용하고
		//    StringBuffer는 multiple thread 환경에서 사용합니다.
		//    (StringBuffer는 thread safe한 클래스입니다.)
		
		
		StringBuffer sb = new StringBuffer("hello"); 
		
		
		// 문자열 추가 (핵심 메소드)
		sb.append(" ").append("java");
		
		System.out.println(sb);

		// StringBuffer 을 쓰는 이유
		// String +연산자를 자주 사용하면 성능이 떨어진다.
		// for 또는 while문에 String + 연산자가 있다면,
		// StringBuffer를 사용하는 것이 좋다.

		StringBuffer sb1 = new StringBuffer("hello"); 
		StringBuffer sb2 = new StringBuffer("hello"); 
		// 문자열 비교
		System.out.println(sb1.equals(sb2));
		// StringBuffer 이기 때문에 비교 불가.(String이 아니기 때문에)
		
		// 문자열로 변환
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		
		System.out.println(str1.equals(str2));
	}

}
