package quiz05;

public class BankAccount {
	private String accNo;
	private long balance;
	
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void deposit(long i) {
		if( i  > 0) {
			this.balance += i;
			System.out.println(i + "원 입금");
		} else
			System.out.println(i + "원 입금 불가");
		
	}

	public long withdraw(long i) {
		if( i > this.balance)
			System.out.println("잔고 부족으로 출금 불가");
		else if( i > 0) {
			this.balance -= i;
			System.out.println(i + "원 출금");
			return i;
		} else 
			System.out.println(i + "원 출금 불가");
		return 0;
	}

	public void inquiry() {
		System.out.println("계좌번호: " + this.accNo + ", 잔액: " + this.balance + "원");
	}

	public void transfer(BankAccount u, long i) {
		
		u.deposit(this.withdraw(i));
		
	}
	
	
}
