package quiz04;

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
	public void setName(String name) {
		this.name = name;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	public int getFULL_BULLET() {
		return FULL_BULLET;
	}
	
	public void info() {
			System.out.println(this.name + "에 " + this.bullet + "발 남았다.");
	}
		
	
	public void reload(int i) {
		if(FULL_BULLET == this.bullet)
			System.out.println("0발 장전, 현재 " + FULL_BULLET + "발 남음");
		else {
			int c = i + this.bullet;
			if( c <= FULL_BULLET) {
				this.bullet = c;
				System.out.println(i + "발 장전, 현재 " + this.bullet + "발 남음");
			}
			else {
				this.bullet = FULL_BULLET;
				 System.out.println(i - (c - FULL_BULLET) + "발 장전, 현재 " + FULL_BULLET + "발 남음");
			}
		}
	}

	
	public void shoot() {
		int tmp = this.bullet;
		if(tmp != 0) {
			this.bullet--;
			System.out.println("빵야, 현재 " + this.bullet + "발 남음");
		}
		else
			System.out.println("헛빵");
	}

	
	
}
