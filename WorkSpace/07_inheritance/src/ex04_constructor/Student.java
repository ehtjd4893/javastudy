package ex04_constructor;

public class Student extends Person{
	private String school;
	
	public Student(String name, String school) {
		super(name);	// student 클래스는 서브클래스이기 때문에
						// 무조건 슈퍼클래스의 생성자를 호출하고 난 후에 작업을 진행해야 한다.
						// 만약 슈퍼클래스가 디폴트생성자를 갖고 있다면 생략 가능하다.
		this.school = school;
	}
	
	public void info() {
		//super.info();
		System.out.println("이름: " + super.getName());
		System.out.println("학교: " + this.school);
		
	}
	
}
