package quiz02;

public class MainClass {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addition(3, 5);
		int a = 5;
		int b = 10;
		if(a > b)
			System.out.println(a + " - " + b + " = " + c.subtraction(a, b));
		else
			System.out.println(b + " - " + a + " = " + c.subtraction(a, b));
	}

}
