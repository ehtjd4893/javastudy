package ex05_synchronized;

public class MainClass {

	public static void main(String[] args) {
		Dyson ds = new Dyson();
		
		Mama m = new Mama();
		Papa p = new Papa();
		
		m.setDyson(ds);
		m.start();
		
		p.setDyson(ds);
		p.start();
	}

}
