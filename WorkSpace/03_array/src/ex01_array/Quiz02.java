package ex01_array;

import java.util.Scanner;

// 2. String[] friendList = {"타요", "짱구", "스폰지밥"};
// 새로 사귄 친구의 수를 입력받아서 friendList 배열에 길이를 늘이기

public class Quiz02 {

	public static void main(String[] args) {
		
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 사귄 친구의 수를 입력해주세요.");
		int n = sc.nextInt();		
		String[] f_arr = new String[n + friendList.length];
		
		
		
		for(int i = 0; i < friendList.length; i++) {
			f_arr[i] = friendList[i];
		}
		
		for(int i = friendList.length; i < f_arr.length ; i++) {
			System.out.print("새로 사귄 친구의 이름을 입력하세요.(" + n + "명 중 " 
									+ (i - friendList.length + 1 ) + "번째)");
			
			f_arr[i] = sc.next();
		}
		
		friendList = f_arr;
		
		for(String s : friendList)
			System.out.print(s + " ");
		
		sc.close();
	}

}
