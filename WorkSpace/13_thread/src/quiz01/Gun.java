package quiz01;

public class Gun extends Weapon implements Runnable{
	private String name;
	private int bullet;
	
	public Gun(String name, int bullet) {
		this.name = name;
		this.bullet = bullet;
	}
	public void shoot(int nth) {
		if(bullet == 0)
			System.out.println("헛빵");
		else
			System.out.println(name + ", "+ nth + "발 쐈다. ");
	}
	@Override
	public void run() {
		for(int i = 1; i<=bullet;i++) {
		shoot(i);	}
	}
	
	
}
