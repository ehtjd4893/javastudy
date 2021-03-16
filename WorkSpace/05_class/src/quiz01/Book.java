package quiz01;

import java.sql.Date;

public class Book {

	String title;
	String author;
	int price;
	int stock;
	Date p_date;
	boolean isBest;
	
	public void show() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("price: " + price);
		System.out.println("Stock: " + stock);
		System.out.println("Publish Date: " + p_date);
		System.out.println(isBest ? "BestSeller" : "SteadySeller");
	}

	
}
