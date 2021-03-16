package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		Bakery bakery1 = new Bakery(100, 1000, 10000); 	// 빵 100개, 가격 1000원, 자본금 10000원
		Bakery bakery2 = new Bakery(50, 500, 10000); 	// 빵 50개, 가격 500원, 자본금 10000원
		
		Customer customer = new Customer(20000);	// 자본금 20000원
		
		customer.buy(bakery1, 10000); 	// bakery1에서 10개 구입, 빵 10개, 남은돈 10000원
		customer.buy(bakery2, 10000);	// bakery2에서 20개 구입, 빵 30개, 남은돈 0원
		
		bakery1.info();		// 빵 90, 자본금 20000
		bakery2.info();		// 빵 30, 자본금 20000
	}

}
