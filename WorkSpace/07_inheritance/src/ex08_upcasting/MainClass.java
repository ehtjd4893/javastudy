package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		Tv t = new Tv(400, "LG-75");
		// Tv 타입의 객체를 Elec 타입으로 변경
		// 서브 -> 슈퍼 타입으로 변경하는 것.(UpCasting)
		
		Elec et = new Tv(400,"SAMSUNG-SM5");
		
		t.info();	// Tv의 info 호출
		et.info();	// Elec의 info 호출
		
		// 메소드의 호출
		// 1. 객체의 타입에 따라 결정됩니다.
		//    호출할 메소드를 결정하는 것을 "바인딩"이라고 표현합니다.
		// 2. 자바는 '동적바인딩'을 합니다.
		// 1) 메소드 호출 시점(실행 전)에는 객체의 타입을 봅니다.
		// 	Elec et = new Tv(~~); 이므로 et.info()는 Elec의 info()입니다.
		// 2) 실제 객체를 확인합니다.
		//   et 안에 저장된 객체가 Tv타입이라는 것을 확인
		// 3) 실제 객체의 타입으로 바꿔서 호출하고 실행합니다
		//   et.info()가 실행될 때는 Tv의 info()가 실행됩니다.
	}

}
