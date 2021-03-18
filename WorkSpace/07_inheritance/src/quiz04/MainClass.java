package quiz04;

public class MainClass {

	public static void main(String[] args) {
		Fighter f1 = new KoreanFighter("정찬성", (int)(Math.random()*100), (int)(Math.random()*20));
		Fighter f2 = new KoreanFighter("에드가", (int)(Math.random()*100), (int)(Math.random()*20));
		
		boolean myTurn = (Math.random() < 0.5);
		System.out.println("정찬성(Hp: " +  f1.getEnergy()+") vs (에드가Hp: " + f2.getEnergy() + ")");
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
