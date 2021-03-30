package ex05_synchronized;

public class Mama extends Thread {
	private Dyson dyson;

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			dyson.floorCleaning();
		}
	}

	public Dyson getDyson() {
		return dyson;
	}

	public void setDyson(Dyson dyson) {
		this.dyson = dyson;
	}

	
}
