package ex06_exception_class;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		try {
			c.div(0);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
