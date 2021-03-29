package ex02;

public class MainClass {

	public static void main(String[] args) {

		Player p1 = new Player("레이디버그");
		Thread player1 = new Thread(p1);
		
		Player p2 = new Player("블랙캣");
		Thread player2 = new Thread(p2);
		
		player1.start();
		player2.start();
	}

}
