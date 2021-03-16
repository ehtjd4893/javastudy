package ex02_loop;

import java.util.Scanner;

// 5. 10000원 모두 사용하기
// 현재 10000원이 있습니다.
// 결제금액을 입력받아라. (5000 입력시)
// 현재 5000원이 있습니다.
// 결제금액 >> -500
// -500원은 결제할 수 없습니다.
// 현재 5000원이 있습니다.
// 결제금액 >>> 10000
// 5천원이 부족합니다.
// 현재 5천원이 있습니다.
// 결제금액 >>> 5000
// 현재 0원이 있습니다. 프로그램을 종료합니다.
public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int account = 10000;
		int pay;

		do {
			
			System.out.print("현재 " + account + "원이 있습니다. 결제금액을 입력해주세요.");
			pay = sc.nextInt();
			if(pay < 0) {
				System.out.println(pay + "원은 결제할 수 없는 금액입니다.");
			}else if(pay > account) {
				System.out.println(pay - account + "원이 부족하여 결제할 수 없습니다." );
				
			}else {
				System.out.println(pay + "원 결제 완료.");
				account -= pay;
			}
			
			if(account == 0) {
				System.out.println("잔액을 모두 소진하셨습니다. 프로그램을 종료합니다.");
				break;
			}
		} while(true);
		sc.close();
	}

}
