package ex07_recursive;

public class MainClass {

	public static void main(String[] args) {

		SayHello sh = new SayHello();
		sh.say(5);
		Adder adder = new Adder();
		adder.calculate(10);
		System.out.println("total: " + adder.getTotal());
		
		Calculator c = new Calculator();
		int n = 10;
		System.out.println(n + "! = " + c.getFactorial(10));
	}

}
