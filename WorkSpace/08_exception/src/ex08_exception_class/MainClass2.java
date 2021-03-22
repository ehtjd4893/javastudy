package ex08_exception_class;

public class MainClass2 {

	public static void main(String[] args) throws BankAccountException{
		// 메인 메소드가 던진 예외는 JVM이 처리한다.
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount u = new BankAccount("9999", 10000);
		
		
		
		me.deposit(10000);
		me.withdraw(10000);
		me.transfer(u, 5000);
		me.inquiry();
	}

}
