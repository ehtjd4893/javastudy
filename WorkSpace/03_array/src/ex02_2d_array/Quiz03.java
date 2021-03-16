package ex02_2d_array;


// 369게임의 결과를 저장하고 출력하기
// 1 2 짝 4 5 짝 7 8 짝 10
// 11 12 짝 14 15 짝 17 18 짝 20
// 21 22 짝 24 25 짝 27 28 짝 짝
// 짝  짝   짝짝  짝 짝  짝짝 짝 짝 짝짝 40
public class Quiz03 {

	public static void main(String[] args) {
		String[][] arr = new String[10][10];
		
		int tmp = -1;
	
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tmp = (i * 10 + (j+1) );
				
				int units = tmp % 10;
				int tens = tmp / 10;
				
				boolean check1 = units == 3 || units == 6 || units == 9;
				boolean check2 = tens == 3 || tens == 6 || tens == 9;
				
				if(check1) {
					if(check2)
						arr[i][j] = "짝짝";
					else
						arr[i][j] = "짝";
				}else {
					if(check2)
						arr[i][j] = "짝";
					else
						arr[i][j] = ""+ tmp;
				}
				
//				if(tmp % 10 == 0)
//					if( tmp % 3 == 0)
//						arr[i][j] = "짝";
//					else
//						arr[i][j] = "" + tmp;
//				else if((tmp % 10) % 3 == 0){
//					if((tmp / 10) % 3 == 0)
//						arr[i][j] = "짝짝";
//					else
//						arr[i][j] = "짝";
//				}
//				else {
//					arr[i][j] = "" + tmp;
//				}
								
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
