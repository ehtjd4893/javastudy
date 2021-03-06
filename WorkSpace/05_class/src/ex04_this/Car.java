package ex04_this;

/* 
 * this는 객체 자신을 의미함.
 * 어떤 클래스 내부에서만 사용
 * 활용
 * 		1) this.필드 (가장 주된 활용)
 * 		2) this() : 생성자 호출
 * */
public class Car {
	String model;
	String manufacturer;
	int price;
	
	void set(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;				
	}
	
	void info() {
		System.out.println("모델명: " + this.model);
		System.out.println("제조사: " + this.manufacturer);
		System.out.println("가격: " + this.price + "만원");
	}
	
}
