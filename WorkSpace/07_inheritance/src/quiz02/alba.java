package quiz02;

public class alba extends Staff {
	private int time;
	private int time_p_pay;
	
	
	
	public alba(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime_p_pay() {
		return time_p_pay;
	}
	public void setTime_p_pay(int time_p_pay) {
		this.time_p_pay = time_p_pay;
	}
	
	public int getPay() {
		return getTime() * getTime_p_pay();
	}
	@Override
	public void info() {
		System.out.println(super.getName() + ": 알바, " + getPay() + "원");
	}
	

}
