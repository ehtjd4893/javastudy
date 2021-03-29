package ex02;

public  class Player implements Runnable {

	private String name;

	public Player(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++)
			System.out.println(name + " is playing...");
	}
	
}
