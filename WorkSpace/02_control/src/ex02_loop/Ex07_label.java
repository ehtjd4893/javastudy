package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법.
		// 2. 방법
		// -> label: 소스코드
		
		outer: for (int dan = 2; dan <= 9; dan++) {
			/*inner:*/ for(int n = 1; n <= 9; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				if(dan == 5 && n == 5)
					//break inner;
					break outer;
			}
		}

		
//		라벨이 없는경우 구구단 5x5까지만 출력하기..
		
//		for(int dan = 2; dan < 10; dan++) {
//			for(int n = 1; n < 10; n++){
//				if(dan < 6 && n < 6 )
//					System.out.println(dan + " x " + n + " = " + (dan * n));
//				else 
//					break;
//			}
//		}
		
	}

}
