package ex17_Object.ex02;

public class Dog {
	
	private String name;

	public Dog(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[name: " + name + "]";
	}

	
}
