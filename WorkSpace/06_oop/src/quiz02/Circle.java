package quiz02;

public class Circle {
	private double radius;
	private Coord mid_point;
	
	public Circle(Coord mid_point, double radius) {
		this.mid_point = mid_point;
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		this.mid_point = new Coord(x,y);
		this.radius = radius;
	}
	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Coord getMid_point() {
		return mid_point;
	}
	public void setMid_point(Coord mid_point) {
		this.mid_point = mid_point;
	}
	
	public double getArea() {
		return Math.pow(Math.PI,2) * this.radius;
	}
	
	public void info() {
		System.out.print("중심좌표 ");
		this.mid_point.info();
		System.out.println(", 반지름 " + this.radius + ", 넓이 " + String.format("%.2f",this.getArea()) );
	}
	
}
