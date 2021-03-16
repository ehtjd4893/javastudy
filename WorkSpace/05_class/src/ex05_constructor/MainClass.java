package ex05_constructor;

public class MainClass {

	public static void main(String[] args) {
		String n = "null";
		int a = 18;
		char g = '남';
		
		Person p1 = new Person();
		Person p2 = new Person(n,a,g);
		Person p3 = new Person(n,a);
		Person p4 = new Person(n,g);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
