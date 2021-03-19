package ex06_exception_class;

public class Calculator {
	private int result = 0;
	
	public void add(int a) {
		result += a;
		System.out.println("현재까지의 결과: "+result);
	}
	
	public void sub(int a) {
		result -= a;
		System.out.println("현재까지의 결과: "+result);
	}
	
	public void mul(int a) {
		result *= a;
		System.out.println("현재까지의 결과: "+result);
	}
	
	public void div(int a) throws ArithmeticException{	// div 메소드가 어떤 예외를 던지는지
		if(a == 0) {			// 명시해준다/
			throw new ArithmeticException();
		}
		result =  result / a;
		System.out.println("현재까지의 결과: "+ result);
	}
	
}
