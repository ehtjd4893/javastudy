package practice;

import java.util.Scanner;

public class p1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int a = 0; a < t; a++) {
			StringBuffer sb = new StringBuffer("");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int abs_dist = y - x;
			int moved = 0;
			int size_of_same = 2;
			int cnt = 2;
			boolean up_q = false;
			//System.out.println("목표까지 이동거리: " + abs_dist);
			if( ++moved == abs_dist) {
				sb.append(1+"");
				continue;
			}
			else if( ++moved == abs_dist) {
				sb.append(2+"");
				continue;
			}
//			System.out.println("현재까지 이동회수: " + cnt);
			while(true) {
				cnt++;
				if(abs_dist <= size_of_same + moved) {
					sb.append(cnt+"");
					break;
				}
				moved += size_of_same;
//				System.out.println("현재까지 이동거리: " + moved);
//				System.out.println("현재까지 이동횟수: " + cnt);
				if(up_q) {
					size_of_same++;
				}
				up_q = !up_q;
			}
			
			System.out.println(sb);
		}
//		sc.close();
	}

}
