package ex02_2d_array;

public class Ex03_advanced_for {

	public static void main(String[] args) {
		
		int[][] a_arr = {
				{1, 2},
				{3, 4, 5}
		};
		
		for(int[] arr: a_arr) {
			for(int a: arr)
				System.out.print(a + " ");
			System.out.println();
		}
		
	}

}
