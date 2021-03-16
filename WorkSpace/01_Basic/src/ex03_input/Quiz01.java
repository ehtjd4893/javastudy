package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz01 {

	public static void main(String[] args) {
		//int type 점수 3개 입력 받아서 평균 구하기
		
		
//		Scanner sc = new Scanner(System.in);

//		int sco1 = sc.nextInt();
//		int sco2 = sc.nextInt();
//		int sco3 = sc.nextInt();
// 		sc.close();		
		int sco1 = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 점수를 입력하세요.(0~100)"));
		int sco2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 점수를 입력하세요.(0~100)"));
		int sco3 = Integer.parseInt(JOptionPane.showInputDialog("세 번째 점수를 입력하세요.(0~100)"));
		
		double avg = (sco1 + sco2 + sco3) / 3.0;
		System.out.println("평균값: " + avg);
		
		
	}

}
