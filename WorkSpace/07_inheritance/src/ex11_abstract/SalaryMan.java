package ex11_abstract;

/*
 * 
 * 추상 클래스를 상속받는 sub클래스는
 * 반드시 모든 추상메소드를 오버라이드해야 함.
 * 
 * */


public class SalaryMan extends Staff{
	private int salary;
	public SalaryMan(String name,int salary) {
		super(name);
		this.salary = salary;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("기본급: " + salary);
	}
	
	
	// getPay 오버라이드는 필수다.
	@Override
	public int getPay() {
		return salary;
	}
	
}
