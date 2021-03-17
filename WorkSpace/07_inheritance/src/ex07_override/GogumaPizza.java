package ex07_override;

public class GogumaPizza extends Pizza {
	private String goguma;
	
	public GogumaPizza(String dough, int cheese, String goguma) {
		super(dough, cheese);
		this.goguma = goguma;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("원산지: " + this.goguma);
	}
	
	
}
