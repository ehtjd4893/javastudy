package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {
		// => up캐스팅이 없는경우, 
		//타입이 다르므로 커피마다 커피를 담는 컵이 다르다.
		Espresso espresso = new Espresso("콜롬비아", 30);
		Latte latte = new Latte("인도네시아", 30, 150);
		
		// upcasting 사용한 경우
		// => 타입이 같다.: 모든 커피를 같은 컵에 담는다.
		Coffee c1 = new Espresso("브라질", 35);
		Coffee c2 = new Latte("멕시코", 10, 150);
		
		
		
		espresso.taste();
		latte.taste();
		c1.taste();
		c2.taste();

		espresso.info();
		latte.info();
		c1.info();
		c2.info();
		
	}

}
