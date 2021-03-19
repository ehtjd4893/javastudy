package quiz01;

public class MainClass {
	
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			c.add(4);
			c.sub(2);
			c.mul(2);
			throw new Exception("그냥");
			//c.div(0);
			//System.out.println("엥");
		}catch(Exception e) {
			System.out.println("예외메세지: " + e.getMessage());

			e.printStackTrace();	// 개발자가 넣어두는 코드	
		}

	}

}
