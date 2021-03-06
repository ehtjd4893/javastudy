package quiz06;

public class Customer {
	BreadAndChange bac;
	
	public Customer(int money) {
		bac = new BreadAndChange(money);
	}

	public void buy(Bakery bakery1, int pay) {
		int num_bread = pay / bakery1.getPrice_bread();
		boolean a = bac.getChange() >= num_bread * bakery1.getPrice_bread();
		boolean b = bakery1.getNum_bread() >= num_bread;
		if(a && b) {
			System.out.print(num_bread + "개 구입, ");
			bakery1.sell(num_bread);
			bac.buy(num_bread, bakery1.getPrice_bread());
			
		}
		else if(!a)
			System.out.println("잔액 부족으로 구매 불가");
		else if(!b)
			System.out.println("빵 재고 부족으로 구매 불가");
		
		bac.info();
	}

}
