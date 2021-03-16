package practice;

public class plust_table {

	public static void main(String[] args) {
		System.out.println("-----덧셈표-----");
		
		
		
		for(int i = 0; i < 10; i++) {
			if(i != 0)
				System.out.print(i + " |");
			for(int j = 1; j < 10; j++) {
				if(i == 0) {
					if( j == 1)
						System.out.print("  |" + j );
					else
					System.out.print("\t" + j );
				
				}else
					System.out.print((i + j) + "\t");
			}
			System.out.println();
			if(i == 0)
				System.out.println("-------------------------------------------------------------------");
		}
	}

}
