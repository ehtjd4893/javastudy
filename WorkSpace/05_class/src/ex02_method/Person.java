package ex02_method;
/*
 * 메소드( method )
 * 1. 구성
 * 		1) 결과타입
 * 		2) 메소드명
 * 		3) 매개변수
 * */
public class Person {

	// field
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height;
	double weight;
	
	// method
	// 1. 결과타입
	// 2. 메소드명
	// 3. 매개변수
	void set(String n, int a, char g, boolean isK, double h, double w) {
		name = n;
		age = a;
		gender = g;
		isKorean = isK;
		weight = w;
		height = h;
	}
	
	void info() {
		System.out.println("나이: " + age + "살");
		System.out.println("성별: " + gender);
		System.out.println("이름: " + name);
		System.out.println("몸무게: " + weight);
		System.out.println("키: " + height);
		System.out.println(isKorean ? "한국인" : "외국인");
	}
	
	double getBMI() {
		
		double bmi = weight / Math.pow(height / 100, 2);
		
		return bmi;
	}

}
