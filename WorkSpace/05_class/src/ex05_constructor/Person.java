package ex05_constructor;

/*
 * 생성자 (constructor)
 * 1. 객체를 생성하는 메소드
 * 2. 특징
 * 		1) 결과타입 없음
 * 		2) 클래스 이름과 같은 이름
 * 		3) 매개변수: 일반 메소드처럼
 * 		4) this() : 다른 생성자를 호출하는 것을 의미
 * */
public class Person {
	String name;
	int age;
	char gender;
	
	Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	Person(String name, char gender) {
		this(name,0,gender);
	}
	
	Person(String name, int age){
		this(name,age,'\0');
	}
	
	Person(String name){
		this(name,0,'\0');
	}
	
	Person(){
		this("",0,'\0');
	}

	@Override
	public String toString() {
		String s = "이름: " + this.name + ", 나이: " + this.age + ", 성별: " + this.gender;	
		return s;
	}
	
	
}
