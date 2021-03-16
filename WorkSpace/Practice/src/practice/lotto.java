package practice;

import java.util.Arrays;
import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마? >>> ");
		int pay = sc.nextInt();
		int loop = pay / 1000;
		int[][] lotto = new int[loop][6];
		
		for(int i = 0; i < loop; i++) {
			int ballCnt = 45;
			int[] balls = new int[ballCnt];
			for(int j = 0; j < ballCnt; j++) {
				balls[j] = j + 1;
			}
			
			int lastIdx = 44;
			for(int j = 0; j < 6; j++) {
				int b_idx = (int)(Math.random() * ballCnt);
				lotto[i][j] = balls[b_idx];
				balls[b_idx] = balls[lastIdx--];
			}
			
			
		} // for i 
		
		for(int i = 0; i < loop; i++) {
			Arrays.sort(lotto[i]);
			for(int j = 0; j < 6; j++ ) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
