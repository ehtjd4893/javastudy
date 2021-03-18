package ex12_abstract;

public class Square extends Rectangle {

	public Square(int width) {
		super(width, width);
	}	
	@Override
	public void info() {
		System.out.println("정사각형: "+getArea());
	}

}
