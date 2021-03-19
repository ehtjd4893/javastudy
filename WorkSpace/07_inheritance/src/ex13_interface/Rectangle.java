package ex13_interface;

// 인터페이스는 본문이 없는 추상메소드를 가지고 있으므로
// 해당 추상메소드를 반드시 오버라이드해줘야함.

public class Rectangle implements Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void info() {
		System.out.println("직사각형: "+getArea());
	}
	
	@Override
	public double getArea() {
		return width*height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
