package ex03_generic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> box = new Box<>(10);
		box.addItem(new Fruit("사과",1000));
		box.addItem(new Fruit("딸기",1000));
		System.out.println(box);
	}

}
