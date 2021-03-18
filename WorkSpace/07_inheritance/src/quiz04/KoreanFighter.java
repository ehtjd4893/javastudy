package quiz04;

public class KoreanFighter extends Fighter {
	
	
	public KoreanFighter(String name, int energy, int power) {
		super(name, energy, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Fighter f) {
		// 20% 확률로 한 방에 ko시킬 수 있다.
		if(Math.random() < 0.2) {
			f.setAlive(false);
			System.out.println(this.getName() + "이(가) " + f.getName() + "을 KO시켰다.");	
		}
		else {
			f.setEnergy(this.getPower());
			System.out.println(this.getName() + "이(가) " + f.getName() + "에게 " + );	

		}
	}
}
