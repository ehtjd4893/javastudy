package quiz03;

public class Company {
	private Staff[] staffList;
	private int idx;
	
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
		idx = 0;
	}
	
	public void hireStaff(Staff staff) {
		if(idx < staffList.length)
			staffList[idx++] = staff;
		else {
			System.out.println("이미 최대로 고용했습니다.");
		}
	}
	
	public void staffInfo() {
		for(Staff staff : staffList){
			if(staff != null)
				staff.info();
		}
		System.out.println("SalaryMan의 급여 총액: " + getSalaryManTotalPay());
	}
	//
	public int getSalaryManTotalPay() {
		int salaryManTotalPay = 0;
		for(Staff staff: staffList) {
			if(staff instanceof SalaryMan) {
				if(!(staff instanceof SalesMan))
					salaryManTotalPay += ((SalaryMan) staff).getPay();
			}
		}
		return salaryManTotalPay;
	}
}
