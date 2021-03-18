package ex11_abstract;

public class MainClass {

	public static void main(String[] args) {
		Staff staff = new SalaryMan("alice",300);
		staff.info();
		// staff의 getPay() 호출하는 방법
		// 1. Staff클래스에 getPay()를 추가
		// -> 모든 Staff는 getPay()를 가지므로 이 방법이 좋다.
		// 2. 다운캐스팅
		// ((SalaryMan)staff).getPay();
		
		System.out.println(staff.getPay());
	}

}
