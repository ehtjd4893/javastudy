package ex08_exception_class;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount u = new BankAccount("9999", 10000);
		
		try {
			//me.deposit(-10000);
			//me.withdraw(-5000);
			me.transfer(u, 100000);
		} catch (BankAccountException e) {
			System.out.println("Error Code[" + e.getErrorCode() + "]");
			System.out.println(e.getMessage());
		} finally{
			me.inquiry();
		}
	}

}
