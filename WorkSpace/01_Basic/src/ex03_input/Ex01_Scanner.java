package ex03_input;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		
		// Scanner 클래스
		// 1. 패키지: java.util
		// 2. import 필요
		//    -> import가 필요 없는 패키지: java.lang (자바랭) - import 없이도 사용 가능한 기본 패키지
		// 3. 메소드
		//   1) nextInt() : int 입력
		//   2) nextLong() : long 입력
		//   3) nextDouble(): double 입력
		//   4) next() : 공백 없는 String 입력
		//   5) nextLine() : String 입력( 공백 포함 가능 )
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용함.
		// 표준 입력 스트림: System.in
		
		Scanner sc = new Scanner(System.in);	// 자동완성을 이용하면 import까지 같이 해줌.
		
		// 1. 이름 입력하기
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();	// 이름에 공백이 들어가도 괜찮다.
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요.(cm단위)");
		double height = sc.nextDouble();
		System.out.println("성별을 입력하세요.(남 or 여)");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름: " + name + "\n나이: " + age + "\n키: " + height + "cm\n성별: " + gender);
	
		// 6. 스트림 닫기.
		sc.close(); // 생략 가능, 만약에 이 코드가 없다면 JVM에서 자동으로 처리.
	}

}
