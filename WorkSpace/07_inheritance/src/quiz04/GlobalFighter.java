package quiz04;

public class GlobalFighter extends Fighter {
	public GlobalFighter(String name, int energy, int power) {
		super(name, energy, power);
		// TODO Auto-generated constructor stub
	}

	public void attack(Fighter f) {
		// 20% 확률로 한 방에 ko시킬 수 있다.

		f.setEnergy(f.getEnergy() - this.getPower());
	}
}
