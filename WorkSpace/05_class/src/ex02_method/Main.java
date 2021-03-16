package ex02_method;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.set("Elice", 18, '여', false, 170.5, 70.5);
		p.info();
		
		System.out.println("BMI: " + p.getBMI());
	}

}
