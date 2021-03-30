package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Gun gun1 = new Gun("베레타", 10);
		Gun gun2 = new Gun("콜트",10);
		Thread g1 = new Thread(gun1);
		Thread g2 = new Thread(gun2);
		
		g1.start();
		g2.start();

	}

}
