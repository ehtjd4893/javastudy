package ex01_branch;

public class Ex01_if {

	public static void main(String[] args) {
//		if(true)
//			System.out.println("만족합니다.");
//		if(false)
//			System.out.println("불만족합니다.");

		int score = 60;
		boolean isPass = score >= 60;

		if(isPass)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		if(score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		
		score = 50;
		// 80 이상: 상, 60~79: 중, 59 이하: 하
		if(score >= 80)
			System.out.println("상");
		else if(score >= 60)
			System.out.println("중");
		else
			System.out.println("하");

		
		if(score >= 80)
			System.out.println("상");
		else {
			if(score >= 60)
				System.out.println("중");
			else
				System.out.println("하");
		}
	}

}
