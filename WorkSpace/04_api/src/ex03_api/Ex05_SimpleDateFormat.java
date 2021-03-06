package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * 날짜 / 시간 패턴
 * 1. 년: yy, yyyy
 * 2. 월: M, MM
 * 3. 일: d, dd
 * 4. 요일: E(일~토)
 * 5. 오전 / 오후: a(오전/오후)
 * 6. 시
 * 	  1) h, hh: 12시간 표기법
 * 	  2) H, HH: 24시간 표기법
 * 7. 분: m, mm
 * 8. 초: s, ss
 * */
public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(System.currentTimeMillis());
		String pattern = "yy-MM-dd a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("non - pattern: " + date);
		System.out.println("pattern: " + sdf.format(date));
	}

}
