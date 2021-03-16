package ex04_this;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		System.out.println(myCar);
		myCar.set("Sonata", "Hyundai", 3500);
		myCar.info();
	}

}
