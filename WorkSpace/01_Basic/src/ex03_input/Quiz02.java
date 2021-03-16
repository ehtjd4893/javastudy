package ex03_input;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz02 {

	public static void main(String[] args) {
		// double 타입의 실수 2개 입력 받아서 값 교환
		
//		Scanner sc = new Scanner(System.in);		
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		sc.close();
		double x = Double.parseDouble(JOptionPane.showInputDialog("첫 번째 double값을 입력하세요."));
		double y = Double.parseDouble(JOptionPane.showInputDialog("두 번째 double값을 입력하세요."));
		
		System.out.println("스왑 전 (x,y): (" + x + ", "+ y + ")");
		
		double tmp = x;
		x = y;
		y = tmp;
		System.out.println("스왑 후 (x,y): (" + x + ", "+ y + ")");

		
	}

}
