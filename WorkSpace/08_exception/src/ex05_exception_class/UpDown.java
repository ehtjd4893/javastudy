package ex05_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpDown {
	private int answer;
	private int cnt;
	private Scanner sc = new Scanner(System.in);
	
	public UpDown() {
		answer = (int)(Math.random() * 100) + 1;
	}
	
	public int challenge() throws UpDownException, InputMismatchException{
		cnt++;
		System.out.print("1~100 사이의 정수 입력 >>");
		int n = sc.nextInt();
		if(n <1 || n > 100) {
			throw new UpDownException();
			
		}
		return n;
	}
	
	public void play()  {
		while(true) {
			try {
				int n = challenge();
				if(n < answer) {
					System.out.println("Up");
				}else if(n > answer) {
					System.out.println("Down");
				}else {
					System.out.println("정답!");
					return;
				}
			} catch(UpDownException e) {
				System.out.println(e.getMessage());
			} catch(InputMismatchException e) {
				// 정수가 아닌 값이 입력되는 경우
				// 그 값은 어디에도 저장되지 못하고
				// 입력에 남아있기 때문에 제거가 필요합니다.
				sc.next();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
