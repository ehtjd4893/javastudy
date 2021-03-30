package ex03_join;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator(1,500);
		Calculator cal2 = new Calculator(501,1000);
		Thread c1 = new Thread(cal1);
		Thread c2 = new Thread(cal2);
		c1.start();
		c2.start();
		try {
			c1.join();
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(cal1.getResult()+cal2.getResult());
		
		
	}

}
