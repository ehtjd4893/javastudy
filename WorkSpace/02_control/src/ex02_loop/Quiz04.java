package ex02_loop;

// 2 x 1 = 2 3 x 1 = 3 ... 9 x 1 = 9
// 2 x 2 = 4 3 x 2 = 6 ... 9 x 2 = 18
// ...
// ...
// 2 x 9 = 18 .....						출력

public class Quiz04 {

	public static void main(String[] args) {
		 for(int o = 1; o < 10; o++) {
			 for(int i = 2; i < 10; i++) {
				System.out.print(i + " x " + o + " = " + (i * o) + "\t");
			}
			System.out.println();	// 줄바꿈
		}

	}

}
