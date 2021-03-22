package ex17_Object.ex03;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		// lombok으로 추가한 setter
		d.setName("댕댕이");
		d.setAge(3);
		
		System.out.println(d.getAge());
		System.out.println(d.getName());
		
		System.out.println(d);

	}

}
