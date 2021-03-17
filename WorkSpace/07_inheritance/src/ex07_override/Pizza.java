package ex07_override;

public class Pizza {
	private String dough;
	private int cheese;
	
	public Pizza(String dough, int cheese) {
		this.dough = dough;
		this.cheese = cheese;
	}

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}


	public void info() {
		System.out.println( "Pizza [dough=" + dough + ", cheese=" + cheese + "]");
	}
	
	
}
