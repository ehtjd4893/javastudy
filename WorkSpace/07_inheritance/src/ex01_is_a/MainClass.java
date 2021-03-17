package ex01_is_a;

// Student가 eat()을 사용하고자 한다.

/*
 * 상속
 * 1. 어떤 클래스가 다른 클래스의 기능을 확장하는 것을 의미
 * 2. 상속이 가능한 대표적인 클래스들의 관계는 is - a 관계
 * 3. IS - A 관계
 * 		Person is a Student. (x)
 * 		Student is a Person. (o) => IS - A 관계 성립
 * 4. Student는 Person의 기능(메소드)를 확장할 수 잇다.
 * */
/*
 * 슈퍼클래스와 서브클래스
 * 1. 슈퍼클래스: 부모 클래스, 메소드를 자식클래스에게 제공함
 * 2. 서브클래스: 자식 클래스, 부모 클래스로부터 메소드를 제공받음
 * 3. 형식
 * 		class 슈퍼클래스{}
 * 		class 서브클래스 extends 슈퍼클래스 {}
 * */

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		Student s = new Student();
		s.study();
		s.eat();

	}

}
