package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {
		
		// java.util.Calendar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다.
		
		
		//현재 날짜와 시간 생성
		Calendar date = Calendar.getInstance();
		
		String[] day_names = {"", "일", "월", "화", "수", "목", "금", "토"};
		// 0번 인덱스는 안 쓸 것이다! weekNo를 더 쉽게 활용하기 위한 장치
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1;	// Calendar.MONTH: 0 ~ 11 값 반환
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekNo); 	// 요일 번호, (1:일요일 ~ 7:토요일)
		System.out.println(year + "-" + month + "-" + day + " " + day_names[weekNo] + "요일");
		
		int ampm = date.get(Calendar.AM_PM);	// 오전: 0, 오후: 1
		int hour = date.get(Calendar.HOUR);	// 0 ~ 11
		int hour2 = date.get(Calendar.HOUR_OF_DAY);	// 0 ~ 23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		System.out.println((ampm == 0 ? "오전" : "오후") + " "
							+ hour + ":" 
							+ (minute < 10 ? ("0" + minute) : minute) 
							+ ":" + (second < 10 ? ("0" + second) : second) + "." + millis);
		
		date.set(1990, 10, 10, 9, 30, 40);	// 날짜: 1990-11-10-9:30:40
											// month는 0 ~ 11 으로 표현하기 때문에 10은 11월을 뜻한다.
		
		// Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
		
		// Calendar -> Date 변환 ( timestamp를 이용 )
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		// java.sql.Date -> Calendar
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
	
	}

}
