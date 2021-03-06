package ex02_2d_array;

import java.util.Scanner;

// 영한사전
// 영어단어와 의미를 배열에 저장해두고
// 각 단어와 의미를 묻고 답하는 프로그램
// 봄을 영어로 하면? >> spring
// 정답
// 여름을 영어로 하면 >> summerasd 
// 오답
// 가을 >> fall
// 정답
// 겨울 >> winder
// 오답
// 2문제를 맞히고 2문제를 틀렸습니다.
public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] dict = {
				{"봄", "spring"},		// dict[0][0], dict[0][1]
				{"여름", "summer"},		// dict[1][0], dict[1][1]
				{"가을", "fall"},		// dict[2][0], dict[2][1]
				{"겨울", "winter"}		// dict[3][0], dict[3][1]
		};								// dict[i][0], dict[i][1]
		
		int cnt = 0;	// 틀린 문제 카운트
		String as;
		for(int i = 0; i < dict.length; i++) {
			System.out.print(dict[i][0] + "을 영어로 하면?");
			as = sc.next();
			if(!as.equalsIgnoreCase(dict[i][1])) {
				cnt++;
				System.out.println("오답");
			} else {
				System.out.println("정답");
			}
		}
		System.out.println((dict.length - cnt) + "개 맞히고, " + cnt + "개 틀렸습니다.");
		sc.close();
	}

}
