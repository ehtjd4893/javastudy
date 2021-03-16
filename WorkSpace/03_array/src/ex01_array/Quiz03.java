package ex01_array;

import java.util.Scanner;

// 3. 성적 관리 프로그램
// 학생들의 점수를 입력받아서 평균, 최대값, 최소값 출력

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥", "짱구", "구하리"};
		int[] scores = new int[students.length];
		for(int i = 0; i < scores.length; i++) {
			System.out.print(students[i] + "의 점수 입력: ");
			scores[i] = sc.nextInt();

		}
		
		int max = scores[0], min = scores[0], sum = scores[0];
		int index_min = 0, index_max = 0;
		for(int i = 1; i < scores.length; i++) {	
			sum += scores[i];
			
			if(max < scores[i]) {
				max = scores[i];
				index_max = i;
			}
			if(min > scores[i]) {
				min = scores[i];
				index_min = i;
			}
		}

		double avg = (double)sum / scores.length;

		System.out.println("평균 점수: " + avg + "점\t");
		System.out.println("최고 점수: " + max + "점(" + students[index_max] + ")");
		System.out.println("최저 점수: " + min + "점(" + students[index_min] + ")");
		sc.close();
	}

}
