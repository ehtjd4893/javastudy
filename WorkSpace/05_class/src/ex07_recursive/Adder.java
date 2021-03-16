package ex07_recursive;

public class Adder {
	private int total;
	
	public void calculate(int n){
		if( n == 0 )
			return;		// 메소드를 끝내는 코드
		
		total += n;
		calculate(n-1);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	
}

