package quiz05;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terran[] terrans = new Terran[10];
		terrans[0] = new Marine();
		terrans[1] = new FireBat();
		terrans[2] = new Tank();
		
		Bunker bunker = new Bunker();
		bunker.add((BunkerAble) terrans[0]);
		bunker.add((BunkerAble) terrans[1]);
		//bunker.add((BunkerAble) terrans[2]); // 불가
	}

}
