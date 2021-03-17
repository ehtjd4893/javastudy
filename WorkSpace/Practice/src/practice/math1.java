package practice;

import java.util.Scanner;

public class math1 {

	public static void main(String[] args) {
		 long a, b, c;
		 Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 long cnt = 1;
		 while(true){
			if( b >= c){
				 cnt = -1;
				 break;	
			}
			else if((a+b*cnt) < c * cnt)
				break;
			else{
				cnt++;
			}
				   
		    }
		    System.out.println(cnt + "");
		    sc.close();
	}

}
