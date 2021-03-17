package ex06_override;

public class MainClass {

	public static void main(String[] args) {

		Coffee c = new Coffee("콜롬비아");
		c.taste();
		
		Espresso e = new Espresso("에티오피아", 3);
		e.taste();

	}

}
