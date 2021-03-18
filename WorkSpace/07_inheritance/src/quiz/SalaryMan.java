package quiz;

public class SalaryMan extends Staff {
	private int salary;
	
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	public int getPay() {
		return salary;
	}
}
