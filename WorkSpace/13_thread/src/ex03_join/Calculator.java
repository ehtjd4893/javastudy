package ex03_join;

public class Calculator implements Runnable {
	
	private int result;
	private int bot;
	private int top;
	public Calculator(int bot, int top) {
		if(bot > top) {
			int tmp = bot;
			bot = top;
			top = tmp;
		}		
		result = 0;
		this.bot = bot;
		this.top = top;
	}
	
	public void addition(int from,int to) {
		if(from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
		for(int i = from; i <=to;i++) {
			result+= i;
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public void run() {
		addition(bot,top);
	}
	
}
