package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.set("어린왕자", "생택쥐베리", 10000);
		b1.info();
	
		Book b2 = new Book();
		b2.set("소나기","황순원");
		b2.info();
		
		Book b3 = new Book();
		b3.set("홍길동전",5000);
		b3.info();
	}

}
