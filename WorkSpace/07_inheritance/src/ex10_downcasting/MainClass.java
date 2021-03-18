package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {

		Person p1;
		p1 = new Student();
		p1.eat();
		p1.sleep();
		//p1.study(); 불가
		// Person타입의 p1을 (Student)타입으로 변경하면 해결됨
		// 1. (Student)p1 : p1을 (Student)로 캐스팅합니다.(downcasting)
		// 2. (Student)p1.study(): 정상작동 불가.
		// 호출의 최우선 순위: 마침표(.)
		// 3. ((Student)p1).study(): 캐스팅을 먼저하면 study() 호출 가능.
		((Student)p1).study();
		
		
		Person p2 = new Worker();
		p2.eat();
		p2.sleep();
		//p2.work(); 불가
		((Worker)p2).work();
		
		
		// p.study() 불가
		// p.work() 불가

		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
		//**((Worker)p3).work(); // ClassCastException 발생
		
		//타입을 확인한 뒤 캐스팅을 해야 한다.
		// p3가 Student이면 Student로 캐스팅,
		// p3가 Worker이면 Worker로 캐스팅.
		if(p3 instanceof Student) {
			((Student)p3).study();
		} else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
	}

}
