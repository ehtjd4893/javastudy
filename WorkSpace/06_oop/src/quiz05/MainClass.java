package quiz05;

public class MainClass {
	public static void main(String[] args) {
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount u = new BankAccount("9999", 10000);
		
		// 이체
		me.transfer(u, 5000);
		me.transfer(u, -100);
		me.transfer(u, 7000);
		// 입금
//		me.deposit(10000);
//		me.deposit(-1000);
		
//		u.withdraw(5000);
//		u.withdraw(-100);
//		u.withdraw(6000);
		
		me.inquiry();
		u.inquiry();
	}
}
