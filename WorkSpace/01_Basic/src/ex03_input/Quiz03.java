package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz03 {

	public static void main(String[] args) {		
		// 나이를 입력받아서 성인 미성년자 구분하기
		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요.")); 
		boolean isAdult = age > 19 ? true : false;
		
		System.out.println(isAdult ? "성인" : "미성년자");
	}

}
