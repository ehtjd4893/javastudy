package ex01_array;

import java.util.Scanner;

// 1. 길이가 3인 string 타입 배열 선언, 3개의 이름 입력 받아서 배열에 저장하고 확인.


public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			System.out.print((i+1) + "번째 이름을 입력하세요.");
			arr[i] = sc.next();
		}
		
		System.out.print("[");
		for(String s : arr)
			System.out.print(" \"" + s + "\" ");
		
		System.out.println("]\n");
		
		
		sc.close();
	}
	

}
