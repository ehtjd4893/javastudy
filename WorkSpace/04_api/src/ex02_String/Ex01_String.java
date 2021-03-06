package ex02_String;

public class Ex01_String {

	public static void main(String[] args) {

		// 1. 동일한 문자열 리터럴은 자바에 의해서 최적화 되기 때문에
		// apple은 하나만 생성하고 그 주소값을 a와 b에 동일하게 넣어준다.
		String a = "apple";
		String b = "apple";
		if(a == b)
			System.out.println("a와 b는 같다");
		else
			System.out.println("a와 b는 같지 않다.");

		// 2. new는 무조건 새로 생성
		// banana 라는 string 2개 존재.
		String c = new String("banana");
		String d = new String("banana");
		
		if(c == d)
			System.out.println("c와 d는 같다");
		else
			System.out.println("c와 d는 같지 않다.");
		
		// 3. 문자열의 길이는 length() 메소드로 구한다.
		System.out.println(a.length());
		
		// 4. 문자열의 일부를 추출하는 경우, subString() 메소드를 사용
		// 사용법 1) subString(시작_index) : 시작index부터 끝까지 
		//		2) subString(시작_index, 종료_index) 
		//			: 시작index부터 종료index 이전까지 ( 시작 <= sub < 종료 )
		
		System.out.println(a.substring(0,3)); // 0번 index ~ 3글자 잘라내기.
		
		// 5. 문자열 양 옆의 공백문자(white space)를 제거하려면 trim() 메소드를 사용
		
		String name = "     alice     ";
		System.out.println(name.trim() + name.trim().length());
		
		// 6. 특정 문자를 찾는 경우 indexOf() 메소드 사용
		//    찾고자 하는 문자(문자열)의 index 반환.
		String str = "best of best of best";
		System.out.println("첫번째 \"best\"의 인덱스: " + str.indexOf("best"));
		System.out.println("두번째 \"best\"의 인덱스: " + str.indexOf("best", 4));		// index 4부터 검색
		System.out.println("두번째 \"best\"의 인덱스: " + str.indexOf("best", str.indexOf("best") + 1));		
		System.out.println("찾는 문자열이 없는 경우 " + str.indexOf("v") + "이 나타납니다.");
		
	
		// 7. 뒤에서부터 검색하는 lastIndexOf() 메소드
		System.out.println("마지막 \"best\"의 인덱스: " + str.lastIndexOf("best"));	// string 끝에서부터 검색
		
		// 8. 기존 문자를 새로운 문자로 변경하는 replace() 메소드
		
		System.out.println(str.replace('b', 'B'));
		System.out.println(str.replace('f', ' '));
	}
}
