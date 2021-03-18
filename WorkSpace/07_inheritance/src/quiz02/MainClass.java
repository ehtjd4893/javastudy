package quiz02;

public class MainClass {

	public static void main(String[] args) {
		SalaryMan s1 = new SalaryMan("james", 300);
		System.out.println(s1.getName());
		System.out.println(s1.getPay());
		
		SalesMan s2 = new SalesMan("alice",100);
		s2.setSalesAmount(2000);
		System.out.println(s2.getName());
		System.out.println(s2.getPay());
		
		alba s3 = new alba("jhon");
		s3.setTime(30);
		s3.setTime_p_pay(5);
		System.out.println(s3.getName());
		System.out.println(s3.getPay());
		
		Company company = new Company(10);
		company.hireStaff(s1);
		company.hireStaff(s2);
		company.hireStaff(s3);
		company.staffInfo();
		
	}

}
