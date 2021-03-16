package ex07_recursive;

public class Calculator {
	
	// 역할: n! 값 
	
	public int getFactorial(int n ) {
		if(n < 2)
			return 1;
		int result = n * getFactorial(n-1);
		return result;
	}
}
