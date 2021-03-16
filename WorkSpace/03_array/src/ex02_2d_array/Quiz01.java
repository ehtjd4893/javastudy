package ex02_2d_array;
// 1. 인구 조사
// apt에 사는 사람 수를 초기화해놓고
// 전체 사람의 수를 출력하기
// 1층에 3명
// 2층에 7명
// 3층에 6명
// 4층에 5명
// 5층에 7명

public class Quiz01 {

	public static void main(String[] args) {
		
		int[][] apt = {
			{1, 2},
			{5, 2},
			{3, 3},
			{1, 4},
			{5, 2}
		};
		
		int sum = 0;
		int sum_f;
		int cnt = 1;
		for(int[] floor: apt) {
			sum_f = 0;
			for(int room: floor) {
				sum_f += room;
			}
			System.out.println(cnt + "층에는 " + sum_f + "명이 살고 있습니다.");
			sum += sum_f;
			cnt++;
		}
		System.out.println("이 아파트에는 총 " + sum + "명이 살고 있습니다.");
		
	}

}
