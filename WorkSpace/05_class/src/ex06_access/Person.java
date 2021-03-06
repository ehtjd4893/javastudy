package ex06_access;

// 접근제어자(access modified)
// 1. private: 클래스 내부에서만 볼 수 있다.
// 2. default: 같은 패키지 내에서만 볼 수 있다. access modifier를 지정하지 않으면, default입니다.
// 3. protected: 같은 패키지 또는 상속 관계에 있는 다른 패키지에서만 볼 수 있다. 
// 4. public: 어디서든 볼 수 있다.


// field는 private
// method는 public
public class Person {
	
	// field
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// method
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isKorean() {
		return isKorean;
	}

	public void setKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}

	public String getName() {
		return name;
	}
	
	
}
