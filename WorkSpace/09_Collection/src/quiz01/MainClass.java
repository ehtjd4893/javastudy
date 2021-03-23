package quiz01;
// 임의의 Member를 3명 만들어 저장하고,
// 사용자로부터 회원번호를 입력ㅂ다아서 해당회원의 삭제를 진행

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member(5,"12345",new Date(System.currentTimeMillis())));
		list.add(new Member(7,"54321",new Date(System.currentTimeMillis())));
		list.add(new Member(9,"13579",new Date(System.currentTimeMillis())));
		System.out.println(list);
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원번호 입력 >> ");
		int x = sc.nextInt();
		
		int length = list.size();
		for(int i =0; i<length;i++) {
			if( list.get(i).getMNo() == x) {
				list.remove(i);
				break;
			}
		}
		System.out.println(list);
		
		sc.close();
	}

}
