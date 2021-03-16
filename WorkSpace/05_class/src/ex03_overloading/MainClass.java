package ex03_overloading;


public class MainClass {

	public static void main(String[] args) {
		
		// 직사각형 만들어 보기
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3,4);	// 가로 3, 세로 4
		System.out.println("넓이: " + nemo1.getArea());	// 넓이
		
		// 정사각형
		Square nemo2 = new Square();
		nemo2.set(5);
		System.out.println("넓이: " + nemo2.getArea());
	}

}
