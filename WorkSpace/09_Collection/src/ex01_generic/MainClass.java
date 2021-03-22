package ex01_generic;

public class MainClass {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();	// 구체화가 진행됨(Box의 모든 T가 String으로 변환됨)
		//Box<String> box1 = new Box<>(); 도 가능.
		box1.setItem("ㅎㅇ");
		System.out.println(box1.getItem());
		
		// 제네릭 타입에서 기본자료형이 필요할 경우
		// Integer, Double과 같은 wrapper class타입을 이용.
		Box<Integer> box2 = new Box<>();
		box2.setItem(101);
		System.out.println(box2.getItem());
		
		Box<Fruit> box3 = new Box<Fruit>();
		box3.setItem(new Fruit("Banana",1500));
		System.out.println(box3.getItem());
	}

}
