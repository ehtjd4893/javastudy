package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

// 로또 구매하기
// 1000원에 번호 6개 1세트
// 얼마? >>> 5000
// 1세트(1줄)에는 같은 번호 없어야함

public class Quiz06 {

	public static void main(String[] args) {
		final int PER = 1000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마? >>> ");
		int pay = sc.nextInt();
		int loop = pay / PER;
		
		int[][] lotto = new int[loop][6];
		
		for(int i = 0; i < loop; i++) {
			int ballCount = 45;
			int[] balls = new int[ballCount];
			for(int j = 0; j < ballCount; j++) {
				balls[j] = j + 1;
				
				// balls 배열 -> lotto 배열
				// 1. balls 배열의 인덱스를 랜덤 생성
				// 2. 해당 인덱스의 값을 lotto 배열로 보냅니다
				// 3. balls 배열의 마지막 요소를 랜덤 생성한 인덱스로 보냄.
			}
			
			for(int j =0; j < lotto[i].length; j++) {
				int idx = (int)(Math.random() * ballCount);
				lotto[i][j] = balls[idx];
				int lastIdx = ballCount - 1;
				if(idx != lastIdx)
					balls[idx] = balls[lastIdx];
				ballCount--;
			}
			
			
			}	// for i
		for(int[] line : lotto) {
			Arrays.sort(line);
			for(int l : line) {
				System.out.print(l + "\t");
			}
			System.out.println();
		}
				
		
		sc.close();
			
			
		
	}

}
