package ex01;

public class Person extends Thread {
	private String name;
	
	@Override
	public void run() {	// 스레드가 동작시키는 메소드
		for(int i = 0; i < 3; i++)
			eat();
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public void eat() {
		System.out.println(name + "가 먹는 중...");
	}
}
