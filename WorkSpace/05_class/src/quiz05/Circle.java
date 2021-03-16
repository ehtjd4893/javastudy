package quiz05;

public class Circle {
	double radius;
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getCircum() {
		return this.radius * 2 * Math. PI;
	}
	double getArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}
	
}
