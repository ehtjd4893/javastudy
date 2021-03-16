package ex01_random;

// 임시비밀번호 발급하기
// 영문대문자  + 아라비아숫자 6자리
// 약 5:5

public class Quiz01 {

	public static void main(String[] args) {
		// 아스키 코드 65 ~ 90('A' ~ 'Z')
		// 48~ 57('0' ~ '9')
		// 97 ~ 122('a' ~ 'z')

		String pwd1 = "";
		for(int i = 0; i < 6; i++) {
			if(Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0';
				pwd1 += (char)arabia;
			}
			else {
				int upper = (int)(Math.random() * 26) + 'A';
				pwd1 += (char)upper;
			}
		}
		System.out.println(pwd1);		
		
		// 문자 배열을 이욯나는 방법
		char[] charSet = {
				'0','1','2','3','4','5',
				'6','7','8','9','A','B',
				'C','D','E','F','G','H',
				'I','J','K','L','M','N',
				'O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'				
		};
		int index;
		String pwd2 = "";
		for(int i = 0; i < 6; i++) {
			index = (int)(Math.random() * charSet.length);
			pwd2 += charSet[index];
		}
		System.out.println(pwd2);
	}

}
