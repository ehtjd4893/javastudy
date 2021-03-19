package ex15_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new SmartPhone();
		p1.sendCall();
		((Computable)p1).playApp();
		
		Computable p2 = new SmartPhone();
		p2.playApp();
		((Phone)p2).sendCall();
		
		SmartPhone p3 = new SmartPhone();
		p3.playApp();
		p3.sendCall();
	}

}
