package quiz06;

public class BreadAndChange {
	private int bread;
	private int change;
	
	public BreadAndChange(int change) {
		this.bread = 0;
		this.change = change;
	}
	
	
	public int getBread() {
		return bread;
	}
	public void setBread(int bread) {
		this.bread = bread;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
	public void buy(int num_bread, int price) {
		this.bread += num_bread;
		this.change -= price * num_bread;
	}
	
	public void info() {
		System.out.println("가진 빵: " + bread + "개, 남은 돈: " + change + "원");
	}
	
}
