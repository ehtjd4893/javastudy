package practice;

import java.util.Scanner;

public class Hanoi {
	
	 // hanoi의 원판을 몇 번 옮겼는지 반환하는 함수
	
	public static StringBuffer sb = new StringBuffer();
	
	public static void hanoi(int n, int x, int y , int z) {	
							// n은 원반수, x는 시작점, y는 중간점, z는 도착점
		if(n == 1) {
			sb.append(x + " " + z + "\n");
		} else {
			hanoi(n - 1, x, z, y);  
			sb.append(x + " " + z + "\n");
			hanoi(n-1, y,x,z);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		
		sb.append((int)((1<<n) - 1) + "\n");
		hanoi(n,1,2,3);
		System.out.println(sb);
		sc.close();
	}

}
