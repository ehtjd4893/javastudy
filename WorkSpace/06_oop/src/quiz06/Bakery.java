package quiz06;

public class Bakery {
	private int num_bread;
	private int price_bread;
	private int money;
	public Bakery(int num_bread, int price_bread, int money) {
		this.num_bread = num_bread;
		this.price_bread = price_bread;
		this.money = money;
	}
	
	public int getNum_bread() {
		return num_bread;
	}

	public void setNum_bread(int num_bread) {
		this.num_bread = num_bread;
	}

	public int getPrice_bread() {
		return price_bread;
	}

	public void setPrice_bread(int price_bread) {
		this.price_bread = price_bread;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean sell(int num) {
		if(this.num_bread > num) {
			num_bread -= num;
			this.money += num * price_bread;
			return true;
		}
		else{
			System.out.println(num - num_bread + "개의 빵이 부족합니다.");
			return false;
		}
	}
	
	public void info() {
		System.out.println("남은 빵: " + this.num_bread + ", 빵 가격: " + this.price_bread + ", 자본: " + this.money);
	}

}
