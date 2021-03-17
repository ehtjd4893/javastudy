package practice;

import java.util.Scanner;

public class math1 {

	public static void main(String[] args) {
		 long a, b, c;
		 Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 long cnt;
		if( b >= c){
			cnt = -1;
		}
		else {
			cnt = a / (c-b) + 1;
		}

				   
		    System.out.println(cnt + "");
		    sc.close();
	}

}
