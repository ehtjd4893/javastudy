package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
//		체질량지수 구해서 건강상태 출력
//		double 타입의 몸무게,키 입력하고
//		체질량지수 = 몸무게 / 키(단위 m)의 제곱
//		건강상태 = 25 이상이면 과체중, 20~24이상이면 정상, 19이하는 저체중
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력해주세요.(cm단위)");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력해주세요.(kg단위)");
		double weight = sc.nextDouble();
		double bmi = weight / Math.pow((height/100), 2);
		System.out.println("체질량 지수: " + bmi);
		
		System.out.println(bmi >= 25 ? "과체중" : (bmi >= 20 ? "정상" : "저체중"));
		sc.close();
	}

}
