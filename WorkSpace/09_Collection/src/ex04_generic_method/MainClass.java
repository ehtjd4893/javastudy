package ex04_generic_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3};
		Double[] b = {1.5, 2.5, 3.5};
		String[] s = {"hello","hi","haha"};
		
		// getTotal 1
		Calculator c = new Calculator();
		System.out.println(c.getTotal1(a));
		//System.out.println(c.getTotal1(s));
		// 메소드 내부에서 s의 타입 String이 Number로 캐스팅되다가 예외 발생.

		// getTotal 2
		System.out.println(c.getTotal2(b));
	 	System.out.println(c.getTotal2(s));
	 	// 여기서는 T extends Number를 통해 명시해놓았기 때문에 String타입 s는
	 	// compile time에 오류가 뜬다.
		
	}

}
