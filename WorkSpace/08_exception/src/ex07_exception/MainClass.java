package ex07_exception;

public class MainClass {

	public static void main(String[] args) {
		BankAccount me = new BankAccount("1111",10000);
		BankAccount u = new BankAccount("9999",10000);
		
		me.transfer(u, -5000);
		me.inquiry();
		me.deposit(10000);
		u.deposit(-1000);
		me.withdraw(20500);
		

	}

}
