package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();

			p1.setModel("CA-001");
			p1.setManufacturer("bio");
			p1.setDate("2021-03-05");

			p2.setModel("CA-001");
			p2.setManufacturer("bio");
			p2.setDate("2021-03-05");
			
			if(p1.equals(p2)) {
				System.out.println("같은 종류 제품");
			} else {
				System.out.println("다른 종류 제품");	
			}
	}

}
