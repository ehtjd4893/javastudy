package ex02_2d_array;

// 구구단의 결과만 2차원 배열에 저장하고 출력하기
// 2 4 6 .. 18
// 3 6 9 .. 27
// ...
// 9 18 27 .. 81

public class Quiz02 {

	public static void main(String[] args) {
		
		int[][] arr = new int[8][];
		for(int i = 0; i < 8; i++) 
			arr[i] = new int[9];	
		
		for(int i = 2; i < 10; i++ ) {
			for(int j = 1; j < 10; j++) {
				arr[i-2][j-1] = i * j;
				System.out.print(arr[i-2][j-1] + "\t");
			}
			System.out.println();
		}
		
	}

}
