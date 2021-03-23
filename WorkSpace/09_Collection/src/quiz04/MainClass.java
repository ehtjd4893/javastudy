package quiz04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("어린왕자","생텍쥐베리",1000);
		Book book2 = new Book("소나기","황순원",1001);
		Book book3 = new Book("홍길동전","김홍길",1002);
		Library l = new Library("신촌도서관");
		l.addBook(book1);
		l.addBook(book2);
		l.addBook(book3);
		l.booksInfo();
		l.removeBook(1002);
		l.booksInfo();
	}

}
