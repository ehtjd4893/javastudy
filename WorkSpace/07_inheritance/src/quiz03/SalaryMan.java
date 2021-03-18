package quiz03;

public class SalaryMan extends Staff {
	private int salary;
	
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		System.out.println(super.getName() + " 기본급: "+ salary + "원");
	}
}
