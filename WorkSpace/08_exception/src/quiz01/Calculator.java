package quiz01;

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
	
	public void div(int a) {
		result =  result / a;
		System.out.println("현재까지의 결과: "+ result);
	}
	
}
