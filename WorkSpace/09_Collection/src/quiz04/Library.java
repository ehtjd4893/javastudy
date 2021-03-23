package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private List<Book> books = new ArrayList<Book>();

	public Library(String name) {
		this.name =name;
	}
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(int bNo) {
		int removeIdx = -1;
		for(int i = 0, length = books.size(); i<length;i++) {
			if(books.get(i).getBNo() == bNo) {
				removeIdx = i;
				break;
			}	
		}
		if(removeIdx != -1) {
			books.remove(removeIdx);
			System.out.println(bNo+"번이 삭제되었습니다.");	
		}
		else {
			System.out.println(bNo+"번 책은 존재하지 않습니다.");	
		}
		
	}
	public void booksInfo() {
		for(Book b : books) {
			System.out.println(b.toString());
		}
		
	}
}
