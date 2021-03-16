package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		for(int out = 1; out <= 10; out++) {
			
			for(int in = 10; in <= 50; in += 10) {
				System.out.println(out + ", " + in);
			}
			
		}
		
		// 1주차 1일차 1교시입니다.
		// 1주차 1일차 2교시입니다.
		
		for(int week = 1; week < 4; week++) {
		
			for(int day = 1; day < 6; day++) {
			
				for(int lecture = 1; lecture < 9; lecture++) {
					System.out.println(week + "주차" + day + "일차" + lecture + "교시입니다.");
				}
			}
		}
	}

}
