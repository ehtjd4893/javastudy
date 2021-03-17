package ex03_has_a;

public class Circle extends Coord{
	private double radius;
	public void setCircle(int x,int y, double radius) {
		set(x, y);	// Coord를 상속받았기 때문에 Coord의 set() 클래스 사용 가능.
		this.radius = radius;
	}
	
	public void cirCleInfo() {
		System.out.print("중심좌표: ");
		info();
		System.out.println("반지름: " + this.radius);
	}
}
