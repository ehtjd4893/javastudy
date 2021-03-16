package ex01_random;

// 윷놀이
// 도, 1칸 이동
// 개, 2칸 이동
// 걸, 3칸 이동
// 윷, 개, 6칸 이동
// 모, 모, 도, 11칸 이동

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] yut = {"도", "개", "걸", "윷", "모"};
		int move = 0;
		
		int index;
		do {
			index = (int)(Math.random() * yut.length);
			System.out.print("\"" + yut[index] + "\"");
			move += index + 1;
			if(index < 3) {
				System.out.println(", " +move + "칸 이동");
				break;
			} else 
				System.out.print(", ");
		} while (true);	}

}
