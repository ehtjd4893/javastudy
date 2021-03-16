package ex01_array;

import java.util.Iterator;

public class Ex02_advanced_for {

	public static void main(String[] args) {
		
		// advanced-for : 향상 for문
		// 배열의 순회를 index 없이 처리하는 for문.
		
		int[] arr = {10, 20, 30};
		
		for(int n : arr) {	// arr 배열의 모든 요소를 변수 n으로 하나씩 전달합니다.
			System.out.println(n);
		}

		// 모든 배열의 요소를 1 증가시키고 싶다.
		for(int n : arr) {
			n++;	// arr 배열의 값이 증가 된 것은 아니다.
		}
		
		// advanced-for문은 배열의 요소를 수정할 수는 없다.
		// 인덱스를 활용하는 일반 for문으로 배열의 요소를 수정할 수 있다.
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(++arr[i]);
	}

}
