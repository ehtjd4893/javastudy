package ex09_upcasting;

public class Coffee {
	
	private String bean;

	public Coffee(String bean) {
		super();
		this.bean = bean;
	}
	
	public void info() {
		System.out.println("원두 원산지: " + bean);
	}
	
	public void taste() {
		System.out.println("원두 맛 없다.");
	}
}
