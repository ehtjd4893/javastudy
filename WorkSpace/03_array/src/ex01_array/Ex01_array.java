package ex01_array;

/*
 * 배열 (array)
 * 1. 변수가 여러개 필요할 때 사용
 * 2. 같은 이름 + 식별번호(index)를 통해 표현
 * 3. 선언 
 * 	  1) int[] array = new int[3]; // int 타입 변수 3개를 사용하는 배열 array 생성
 *	  2) int[] a;
 *		 a = new int[3];
 *	  3) int a[] = new int[3]; // 추천 x
 * 4. 초기화
 *    1) int[] a = {10, 20, 30};
 *    2) 주의사항: 초기화는 반드시 선언할 때 같이 진행해야 함.
 *       int[] a;			
 *       a = {10, 20, 30}; 	// 불가능한 초기화의 경우
 * 5. 생성되는 변수
 *    int[] a = new int[3];
 *    a[0],a[1],a[2] : 0으로 초기화가 되어있는 상태.(자동)      
 * 6. 용어
 *    int[] a = new int[3];
 *    1) 배열이름: a
 *    2) 배열길이: 3,  a.length를 통해 확인.
 *    3) 인덱스: 0, 1, 2 (0부터 시작)
 *    	  사용이 불가능한 인덱스를 사용하면 
 *       ArrayIndexOutOfBounds Exception 발생
 *    
 * */
public class Ex01_array {

	public static void main(String[] args) {
		// 1. 배열의 선언 및 생성
		int[] a = new int[3];
		
		// 2. 확인
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// 3. 배열의 순회
		// 인덱스 기준, index는 0 ~ 길이 -1 까지 존재. 0 <= index < 길이
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		// 4. 가용 범위를 벗어난 index를 사용해보자.
		//System.out.println(a[3]);	 // ArrayIndexOutOfBounds Exception 발생
			

	}

}
