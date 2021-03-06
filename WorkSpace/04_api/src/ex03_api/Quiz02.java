package ex03_api;

import java.sql.Date;
import java.util.Calendar;

// Calendar를 활용해서 기념일 계산하기.
// 2개의 날짜를 만들고, 그 중 하나는 기념일로 수정
// 날짜의 차이를 구하고, 일(day)수로 출력
public class Quiz02 {

	public static void main(String[] args) {
		Calendar anniversary = Calendar.getInstance();		// 21년 내 생일
		anniversary.set(2021, 2, 27);
		Calendar today = Calendar.getInstance();	// 오늘 날짜
		
		Date date_an = new Date(anniversary.getTimeInMillis());

		long diff = today.getTimeInMillis() - anniversary.getTimeInMillis();
		int diff_day = (int)(diff / (1000 * 60 * 60 * 24));
		System.out.println(date_an + "까지 D-day: " + diff_day);
		
		
	}

}
