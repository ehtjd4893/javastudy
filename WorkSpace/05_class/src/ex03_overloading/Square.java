package ex03_overloading;

public class Square extends Rectangle {
	@Override
	void set(int w) {
		super.set(w);
	}

	@Override
	int getArea() {
		return super.getArea();
	}
	
}
