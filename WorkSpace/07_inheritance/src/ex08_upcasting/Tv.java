package ex08_upcasting;

public class Tv extends Elec {
	private String model;

	public Tv(int watt, String model) {
		super(watt);
		this.model = model;
	}
	@Override
	public void info() {
		System.out.println("TV 모델: " + this.model);
		super.info();
	}
	public void ss() {
		System.out.println("볼 수 있나?");
	}
	
}
