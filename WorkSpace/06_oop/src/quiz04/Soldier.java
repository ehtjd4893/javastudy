package quiz04;

public class Soldier {
	private String name;
	private Gun gun;
	
	
	public Soldier(String name, Gun gun) {
		super();
		this.name = name;
		this.gun = gun;
	}
	
	public Soldier(String name2, int i) {
		// TODO Auto-generated constructor stub
	}

	public void info() {
		System.out.print(this.name + ", ");
		gun.info();
	}
	
	public void reload(int i) {
		gun.reload(i);
	}
	
	public void shoot() {
		gun.shoot();
	}




}
