package ex07_recursive;

public class SayHello {

	public void say(int n) {
		if( n != 0) {
			for(int i = n; i > 0; i--)
				System.out.println("Hello" + i);
			
			say(n-1);
		}
	}
	
}
