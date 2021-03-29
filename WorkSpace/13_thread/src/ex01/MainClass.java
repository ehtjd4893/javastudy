package ex01;

/*
 * 스레드 (thread)
 * 1. 자바의 세부 작업 단위
 * 2. 생성 방법
 *  1) Thread클래스를 상속 받습니다. (extends Thread)
 *  2) Runnable 인터페이스를 구현합니다. (implements Runnable)
 * 3. 기본 규칙
 *  1) run() 메소드 : 스레드의 작업을 작성하는 메소드. 오버라이드해서 사용
 *  2) start() 메소드 : 스레드를 실행하는 메소드. run()메소드를 직접 호출하지는 않는다.
 * */
public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("자두");
		Person p2 = new Person("스폰지밥");
		Person p3 = new Person("브레드");

		// 스레드는 JVM에 의해 스케쥴링 되기 때문에
		// 코드 작성 순서대로 동작하지 않을 수 있다.
		p1.start();
		p2.start();
		p3.start();
		System.out.println("모두 식사가 끝났다."); // 가장 먼저 출력될 가능성이 높음
	}

}
