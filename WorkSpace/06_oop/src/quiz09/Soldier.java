package quiz09;

public class Soldier {
		private Gun[] guns;
		private int idx;
		private String name;


		
	public Soldier(String name, int cnt) {
			this.name = name;
			guns = new Gun[cnt];
		}

	public void addGun(Gun gun2) {
		guns[idx++] = gun2;
	}

	public void shoot() {
		for(int i = 0; i < idx; i++) {
			guns[i].shoot();
		}
	}
	
	public void shoot(int id) {
			guns[id-1].shoot();
	}
	
	public void shoot(String name) {
		for(int i = 0; i <idx; i++) {
			if(guns[i].getName().equalsIgnoreCase(name)) {
				guns[i].shoot();
				break;
			}
		}
	}
	
	public void reload(int n) {
		for(int i = 0; i < idx; i++) {

			guns[i].reload(n);
		}
		
	}
	public void reload(int id, int n) {
		guns[id-1].reload(n);
	}
	
	public void reload(String name, int n) {
		for(int i = 0; i <idx; i++) {
			if(guns[i].getName().equalsIgnoreCase(name)) {
				guns[i].reload(n);
				break;
			}
		}		
	}

	public void info() {
		System.out.println("이름: " + this.name);
		for(int i = 0; i < idx; i++) {
			guns[i].info();
		}
		
	}
	
}
