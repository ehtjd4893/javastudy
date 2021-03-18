package ex12_abstract;

public class Circle extends Shape {
	private double radius;
	private int x,y;
	
	public Circle(double radius, int x, int y) {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getArea() {		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void info() {
		System.out.println("원: "+getArea());
	}
}
