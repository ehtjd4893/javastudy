package quiz02;

public class MainClass {

	public static void main(String[] args) {
		Coord center = new Coord(0,0);
		Circle won = new Circle(center, 1.5);
		
		center.info();
		System.out.println();
		won.info();
		Circle won2 = new Circle(1, 1,1.5);
	}
	

}
