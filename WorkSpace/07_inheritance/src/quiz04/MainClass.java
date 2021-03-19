package quiz04;

public class MainClass {

	public static void main(String[] args) {
		Fighter f1 = new KoreanFighter("정찬성");
		Fighter f2 = new KoreanFighter("에드가");
		
		boolean myTurn = (Math.random() < 0.5);
		System.out.println(f1.getName()+"(Hp: " +  f1.getEnergy()+", 공격력: " + f1.getPower() +") vs " + f2.getName() + "(Hp: " + f2.getEnergy() + ", 공격력:" + f2.getPower() + ")");
		do {
			if(myTurn){
				f1.attack(f2);
			}else {
				f2.attack(f1);
			}
			myTurn = !myTurn;
		}while(f1.isAlive() && f2.isAlive());
	}

}
