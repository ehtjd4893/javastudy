package ex12_abstract;

public class Triangle extends Shape {
	
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (width*height)/2;
	}
	@Override
	public void info() {
		System.out.println("삼각형: "+getArea());
	}


}
