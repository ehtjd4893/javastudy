package quiz04;

public class KoreanFighter extends Fighter {
	
	
	public KoreanFighter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Fighter f) {
		// 20% 확률로 한 방에 ko시킬 수 있다.
		if(Math.random() < 0.2) {
			f.setAlive(false);
			f.setEnergy(0);
			System.out.println(this.getName() + "attacks " + f.getName() + ", KO");	
			return;
		}
		else {
			f.setEnergy(f.getEnergy() - this.getPower());
			if(f.getEnergy() <= 0) {
				f.setAlive(false);;
				System.out.println(this.getName() + " attacks " + f.getName() + ", " + "KO");
				return;
			}
			System.out.println(this.getName() + " attacks " + f.getName() + ", Hp-" + getPower());	
		}
		System.out.println(f.getName() + " 남은 Hp: " + f.getEnergy());
	}
}
