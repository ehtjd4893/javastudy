package ex03_input;

import javax.swing.JOptionPane;

public class Quiz04 {

	public static void main(String[] args) {
		// int 타입의 매출액 + 등급(vip, 일반) 입력 받아서 실매출액 출력 vip는 20% 할인, 일반은 5% 할인
		
		
		// naming convention ( 이름 짓는 관습 )
		// -snake case : _를 이용한 단어연결
		// -lower camel case : 첫번째 글자가 소문자이면서 중간에 대문자를 통해 단어의 연결을 표현해주는 경우
		// -upper camel case : Class의 이름을 짓는 경우
		
		int salseMoney = Integer.parseInt(JOptionPane.showInputDialog("정수 타입의 매출액을 입력하세요."));
		String rank = JOptionPane.showInputDialog("등급을 입력하세요.(\"VIP\" or \"일반\")");
		
		// 자바에서는 String 자료형은 == 로 비교할 수 없다!! (reference 자료형이기 때문)
		// double result = (rank.equals("VIP") || rank.equals("vip")) ? salseMoney * 0.8 : salseMoney * 0.95;
		double result = rank.equalsIgnoreCase("VIP") ? salseMoney * 0.8 : salseMoney * 0.95;	// promotion (자동 형변환) 발생.
		JOptionPane.showMessageDialog(null, "실매출액: " + result);
	}

}
