package ex02_operator;

import java.util.Random;

public class Ex03_operator {

	public static void main(String[] args) {
		
		// 6) 조건 연산자 (삼항 연산자)
		// 조건식 ? true일 때 값 : false일 때 값
		
		int score = 50;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		
		
		
		// 문제1) 평균이 85점 이상이거나 , 국어와 영어 점수가 모두 80점 이상이면 합격 아니면 불합격
		int korean = 70;
		int english = 100;
//		boolean isPass = ((korean + english) / 2 >= 85 || (korean >= 80 && english >= 80));	// 20, 21번 줄은 모두 같은 값을 반환하지만 효율의 차이가 있다.
		boolean isPass = ((korean >= 80 && english >= 80) || (korean + english) / 2 >= 85);	// 연산의 효율이 더 좋다.( 앞의 것을 연산했을 때 true이면 평균값 계산 안 해도 됨.
		System.out.println(isPass ? "합격" : "불합격");
		
		
		
		
		
		// 문제2) 2자리(10~99) 정수 중에서 하나를 임의로 선언하고,
		// 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		// 45, 55, 99가 카프리카 수입니다.		
		// 45 * 45 = 2025 -> 20 and 25로 쪼갬. 20 + 25 = 45 (n 자신) 이면 카프리카 수
		int n = (int)(Math.random() * 100);	
		n = n < 10 ? n + 10 : n;
		System.out.println("n값: " + n);
		
		int sq = n * n; // Math.pow(n, 2);
		System.out.println("n^2 값: " + n*n);
		int front = sq / 100;
		int back = sq % 100;
		boolean isKaprekar = (front + back) == n;
		System.out.println(isKaprekar ? "맞다" : "아니다");
		
	
//		String full, front, back;
//		full = "" + sq;
//		front = full.substring(0,2);
//		back = full.substring(2);
//		
//		System.out.println(front);
//		System.out.println(back);
//		int tmp = Integer.parseInt(front) + Integer.parseInt(back);
//		System.out.println(tmp == n ? "맞다" : "아니다");
	}

}
