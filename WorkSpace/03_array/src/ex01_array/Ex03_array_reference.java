package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		// 배열은 reference 타입이다.
		
		int[] arr = new int[3];
		
		System.out.println(arr);		// [I@15db9742 : 주소 15db9742 에 있는 값. 
										// 변수에는 arr 주소 I@15db9742 값만 저장하고, 
										// arr[n] 호출시 주소값에서부터 
										// n번째 자료를 찾아냄.
		
		// 배열의 길이를 조정하는 코드입니다.
		int[] a = {1, 2, 3};	// 배열 a의 길이느 3
		int[] b = new int[10];	// 배열 b의 길이는 10
		// b[0] = a[0]
		// b[1] = a[1]
		// b[2] = a[2]
		System.out.println(b);
		for(int i = 0; i <a.length; i++) {
			b[i] = a[i];				// a에는 {1, 2, 3}이 저장된 주소가 있다.
										// b = {1, 2, 3, 0,0 ,0 ,0 ,0 ,0 }
		}	
			 a = b; // --- b 배열의 주소를 a에 넘긴다.
			 		// 메모리 누수 (Garbage) 발생할 수 있으나 JVM(Garbage Collection)이 자동으로 제거해줌.
			 		// code: System.gc();	// 필수는 아니다.
			 for(int n : a)
				 System.out.print(n + " ");
			 // 배열의 길이가 3에서 10으로 증가하며 복사된다.
		}
	

}
