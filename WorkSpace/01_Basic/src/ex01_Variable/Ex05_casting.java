package ex01_Variable;

public class Ex05_casting {

	public static void main(String[] args) {
		
		// casting: 다른 타입(자료형)으로 변환하는 것.(강제로)
		
		// 자동 형변환(promotion)
		System.out.println(1 + 1.5);		// 1 + 1.5 -> promotion으로 1.0 + 1.5로 변환하여 계산, 출력.
		
		
		// 강제 형변환(casting): 데이터의 훼손이 발생할 수밖에 없음.
		System.out.println(1 + (int)1.5);	// 1+ 1.5 -> double형태의 1.5를 int로 형변환하여 1 + 1로 변환하여 계산, 출력.
		int a = 1;
		double b = 1.5;
		System.out.println(a+(int)b);		
	}

}
