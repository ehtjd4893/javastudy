package ex04_generic_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3};
		Double[] b = {1.5, 2.5, 3.5};
		String[] s = {"hello","hi","haha"};
		
		Calculator c = new Calculator();
		System.out.println(c.getTotal1(a));
	 	System.out.println(c.getTotal2(b));
	 	System.out.println(c.getTotal2(s));
		
		//System.out.println(c.getTotal1(s));
		// 메소드 내부에서 s의 타입 String이 Number로 캐스팅되다가 예외 발생.
	}

}
