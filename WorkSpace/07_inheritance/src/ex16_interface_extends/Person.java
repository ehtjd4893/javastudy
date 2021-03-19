package ex16_interface_extends;

public class Person {
	
	public void feed(Pet p,String food) {
		p.feed(food);
	}
	
	public void walking(Walkable p) {
		System.out.println("Walking with" + ((Pet)p).getName());
	}
}
