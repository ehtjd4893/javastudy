package ex03_input;

import javax.swing.JOptionPane;

public class Quiz05 {

	public static void main(String[] args) {
		// 성별을 의미하는 숫자(1~4)를 입력 받아서 남녀 구분 출력하기
		int input = Integer.parseInt(JOptionPane.showInputDialog("1~4의 숫자를 입력해주세요.(1과3은 남자, 2와4는 여자)"));
		
		boolean isMan = input % 2 == 1 ? true : false;
		
		JOptionPane.showMessageDialog(null, isMan ? "남" : "여");

	}

}
