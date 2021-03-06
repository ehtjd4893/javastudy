package quiz09;

public class Gun {
	private String name;
	private int bullet;
	private final int FULL_BULLET = 6;
	
	public Gun(String name, int bullet) {
		this.name = name;
		this.bullet = bullet;
	}
	
	
	public String getName() {
		return name;
	}


	public void shoot() {
		if(this.bullet > 0) {
			this.bullet--;
			System.out.println(this.name + " 빵야(현재 " + this.bullet + "발 남음)");
		}
		else
			System.out.println(this.name + " 헛빵");
	}
	
	public void reload(int i) {
		if(FULL_BULLET == this.bullet)
			System.out.println(name + "(0발 장전, 현재 " + FULL_BULLET + "발 남음)");
		else {
			int c = i + this.bullet;
			if( c <= FULL_BULLET) {
				this.bullet = c;
				System.out.println(name + "(" + i + "발 장전, 현재 " + this.bullet + "발 남음)");
			}
			else {
				 System.out.println(name + "(" + (FULL_BULLET-this.bullet) + "발 장전, 현재 " + FULL_BULLET + "발 남음)");
				 this.bullet = FULL_BULLET;
			}
		}
	}
	
	public void info() {
		System.out.println(this.name + "(" + this.bullet + "발)");
	}
}
