package ex01_random;

import java.util.Scanner;

//1 ~ 10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞추는 게임
// 입력 >> 5000
// up ( 5000보다 큰 숫자 중에 있다 )
// 입력 >> 7500
// down ( 7500보다 작은 숫자 중에 있다 )
// ....
// 정답, 총 n번만에 정답. 

public class Quiz02 {

	public static void main(String[] args) {
		int top = 10000;
		int bottom = 1;
		
		int rand = (int)(Math.random() * top) + bottom;
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int as = -1;
		do {
			cnt++;
			System.out.print("입력 >>> ");
			as = sc.nextInt();
			if(as > top || as < bottom) {
				System.out.println(bottom + " ~ " + top + " 범위를 입력하세요.");
				continue;
			}
			
			if(rand == as) {
				System.out.println("정답! (" + cnt + "번 시도)");
				break;
			}
			else if(rand < as) {
				System.out.println("Down");
				top = as - 1;
			}else {
				System.out.println("Up");
				bottom = as + 1;
			}
		} while(true);
		sc.close();
	}

}
