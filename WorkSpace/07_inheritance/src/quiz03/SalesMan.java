package quiz03;

public class SalesMan extends SalaryMan{
	private int salesAmount;
	private double incentive; // %
	
	public SalesMan(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(this.salesAmount >= 1000)
			setIncentive(0.07);
		else {
			setIncentive(0.05);
		}
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getSalesPay() {
		return (int)(getIncentive() * getSalesAmount());
	}

	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();
	}
	@Override
	public void info() {
		super.info();
		System.out.println("판매수당: "+ getSalesPay() + "원");
		System.out.println("수당 총액: " + getPay() + "원");
	}
	

}
