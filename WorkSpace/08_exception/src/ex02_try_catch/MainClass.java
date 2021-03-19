package ex02_try_catch;

public class MainClass {

	public static void main(String[] args) {
		int x = 1;
		try {
			System.out.println(2/0); 	// ArithmeticException	- divide by zero
			x = 10;	// 실행 안 되는 부분.
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}
		System.out.println(x + ", x = 10 구문 실행 안 됨");
		
		
		try {
			Integer.parseInt("");	// NumberFormatException
		}catch(NumberFormatException e) {
			e.printStackTrace();	
		}
		
		try {
			String name = null; name.equals("james"); //NullPointerException
		}catch(Exception e) {
			e.printStackTrace();	// Exception은 모든 exception의 부모클래스
		}
		
		try {
			int[] a = new int[3]; a[30] = 10; //ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}

}
