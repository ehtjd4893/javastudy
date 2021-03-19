package ex16_interface_extends;

public class MainClass {
	public static void main(String[] args) {
		
		Dog d = new Dog("댕댕이");
		Snake s = new Snake("뱜");
		Person p = new Person();
		
		p.feed(d, "개껌");
		p.walking(d);
		p.feed(s, "개구리");
		//p.walking(s);	// 불가능
	}
}
