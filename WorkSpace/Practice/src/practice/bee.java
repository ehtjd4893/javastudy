package practice;

import java.util.Scanner;

public class bee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//(( 숫자 - 1 ) / 6) + 1
			int cnt = 1;
			double sub = 1.0;
			double div = 6.0;
			while(true) {
				double result = ((n-sub)/div);
				if(result == 0.0) {
					//System.out.print(n + "일 때 여기 들렀어!    ");
					break;
				}
				if(result > 1.0) {
					cnt++;
					sub+= 6.0*(cnt-1);
					div+= 6.0;
				}
				else {	// 계산값이 1.0 이하이면
					cnt++;
					break;
				}
			}
			System.out.println((cnt));
		
		}

}
