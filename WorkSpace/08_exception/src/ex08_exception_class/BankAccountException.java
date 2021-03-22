package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception{
	private int errorCode;
	
	public BankAccountException(String message) {
		super(message);
	}

	public BankAccountException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
}
