package ex13_interface;

public class Square extends Rectangle {

	public Square(int width) {
		super(width, width);
	}	
	@Override
	public void info() {
		System.out.println("정사각형: "+getArea());
	}

}
