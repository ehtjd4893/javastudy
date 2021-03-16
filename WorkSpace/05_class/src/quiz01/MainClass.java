package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {

		Book b1 = new Book();
		
		b1.author = "J.K.Rolling";
		b1.title = "해리포터와 마법사의 돌";
		b1.price = 15000;
		b1.stock = 100;
		Calendar date = Calendar.getInstance();
		date.set(2020, 0, 10);
		
		b1.p_date  = new Date(date.getTimeInMillis());
		//b1.isBest;
		b1.show();
		
	}

}
