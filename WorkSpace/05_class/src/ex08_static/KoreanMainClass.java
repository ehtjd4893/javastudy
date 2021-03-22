package ex08_static;

public class KoreanMainClass {

	public static void main(String[] args) {
		
		Korean k1 = new Korean();
		k1.name = "홍길동";
		System.out.println(k1.name);
		System.out.println(k1.country);
		System.out.println(Korean.country);
		
	}

}
