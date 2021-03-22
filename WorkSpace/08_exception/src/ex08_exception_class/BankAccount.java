package ex08_exception_class;

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

	public void deposit(long i) throws BankAccountException{
			if( i  <= 0)
				throw new BankAccountException(i + "원 입금불가");
			
			this.balance += i;
			System.out.println(i + "원 입금");
		

		
	}

	public long withdraw(long i) throws BankAccountException{
			if( i > this.balance)
				throw new BankAccountException("잔고 부족", 2000);
			else if( i > 0) {
				this.balance -= i;
				return i;
			}
			else {
				throw new BankAccountException("입력 불량", 2001);				
			}

	}

	public void inquiry() {
		System.out.println("계좌번호: " + this.accNo + ", 잔액: " + this.balance + "원");
	}

	public void transfer(BankAccount u, long i) throws BankAccountException {
			u.deposit(this.withdraw(i));
	}
	
	
}
