package practice;

import java.util.Scanner;

//성적 관리 프로그램
//각 점수는 입력 받아 학생별 총점과 과목별 총점 구해서 출력
//스폰지밥의 국어 점수 >>> 10
//스폰지밥의 영어 점수 >> 10
//스폰지밥의 수학 점수 >> 10 ...
//...
//			국어 	영어	수학	학생합계
//	스폰지밥	10	10	10	30
//	타요		10	10	10	30
//	브레드	10	10	10	30
//	과목합계	30	30	30	90

public class score_table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"스폰지밥", "타요", "브레드", "과목합계"};
		String[] subjects = {"국어", "영어", "수학", "학생합계"};
		
		int[][] table = new int[names.length][subjects.length];
		
		
		for(int i = 0; i < names.length - 1; i ++) {
			for(int j = 0; j < subjects.length - 1; j++) {
				System.out.print(names[i] + "의 " + subjects[j] + "점수 입력 >>>");
				table[i][j] = sc.nextInt();
				table[names.length - 1][subjects.length - 1] += table[i][j];
				table[names.length - 1][j] += table[i][j];
				table[i][subjects.length - 1] += table[i][j];
				
			} // for j
			
		} // for i 
		
		for(int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.println();
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0; j < subjects.length;j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
