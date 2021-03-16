package ex03_overloading;
/*
 * 오버로딩
 * 1. 이름이 같고 매개변수가 다른 메소드가 있음
 * 2. 결과타입은 오버로딩과 상관 없음.
 * */
public class Rectangle {
	int width, height;
	
	void set(int w, int h) {
		if(w > 0)
			width = w;
		
		if(h > 0)
			height = h;
	}
	void set(int w) {
		this.set(w,w);
	}
	int getArea() {
		return width * height;
	}


}
