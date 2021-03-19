package quiz05;

public class Bunker {
	private int idx;
	private Terran[] units;
	
	
	
	public Bunker() {
		super();
		this.idx = 0;
		this.units = new Terran[4];
	}



	public void add(BunkerAble b){
		units[idx++] = (Terran)b;
		System.out.println(((Terran)b).getName() + " 벙커 입장");
	}
}
