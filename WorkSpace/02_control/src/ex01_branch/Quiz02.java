package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 나이를 입력 받아서(1~100살) 구분 출력
		// 7 이하 : 미취학아동, 13 이하: 초등학생, 
		// 16 이하: 중학생, 19 이하: 고등학생, 20 이상: 성인
		// 나이 범위 벗어나면 불가능한 나이 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요.(1~100)");
		int age = sc.nextInt();
		

		
		if(age > 100 || age < 1)
			System.out.println(age + "세는 불가능한 나이입니다.");
		else if(age >= 20)
			System.out.println(age + "세는 성인입니다.");
		else if(age >=17)
			System.out.println(age + "세는 고등학생입니다.");
		else if(age >= 14)
			System.out.println(age + "세는 중학생입니다.");
		else if(age >= 8)
			System.out.println(age + "세는 초등학생입니다.");
		else
			System.out.println(age + "세는 미취학 아동입니다.");

		
		sc.close();
	}
}
