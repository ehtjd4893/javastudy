package quiz04;

public abstract class Fighter {
	private String name;
	private boolean isAlive;	// 에너지 0이면 false;
	private int energy;
	private int power;
	
	public Fighter(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
		this.isAlive = true;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isAlive() {
		return isAlive;
	}



	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}



	public int getEnergy() {
		return energy;
	}



	public void setEnergy(int energy) {
		this.energy = energy;
	}



	public int getPower() {
		return power;
	}



	public void setPower(int power) {
		this.power = power;
	}



	abstract public void attack(Fighter f);
	
}
