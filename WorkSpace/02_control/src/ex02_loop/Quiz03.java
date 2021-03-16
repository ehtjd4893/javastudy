package ex02_loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

// 3. 비밀번호를 "asdf"로 가정합니다.
// 비밀번호를 입력받아서 일치하면 "로그인되었습니다.",
// 일치하지 않으면 "비밀번호를 확인하세요." 출력
// 최대 5번 입력 받을 수 있음.

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String pw = null;
//		for(int i = 0; i < 5; i++) {
//			
//			pw = JOptionPane.showInputDialog("비밀번호를 입력하세요.\n(최대 5번,현재 " + (i+1) + "번째 시도중..)");
//			if(pw.equals("asdf")) {
//				JOptionPane.showMessageDialog(null, "로그인되었습니다.");
//				break;
//			} else if(i == 4){
//				JOptionPane.showMessageDialog(null, "비밀번호 입력 횟수를 초과했습니다.프로그램을 종료합니다.");
//			} else {
//				JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다. ");
//			}
//		}
		
		int cnt = 0;
		while(true) {
			System.out.print("비밀번호를 입력하세요.");
			String pwd = sc.next();
			cnt++;
			if(pwd.equals("asdf")) {
				System.out.println("로그인되었습니다.");
				break;
			}else
				System.out.println("비밀번호를 확인하세요.");
			if(cnt == 5) {
				System.out.println("비밀번호 입력 횟수 초과. 프로그램 종료");
				break;
			}
		}
		sc.close();
	}

}
