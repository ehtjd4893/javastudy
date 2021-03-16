package quiz04;

public class Book {
	// field
	String title, author = "미상";
	int price = 0;
	
	void set(String t, String a, int p) {
		title = t;
		author = a;
		price = p;
	}

	void set(String t, String a) {
		title = t;
		author = a;
	}
	
	void set(String t, int p) {
		title = t;
		price = p;
	}


	
	// method
	void info() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + price + "원");	
	}
	
	
}
