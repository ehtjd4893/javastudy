package quiz10;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"브레드", "짱구", "타요", "띠띠뽀", "자두"};
		Lecture lecture = new Lecture("스프링 프레임워크", names);
		
		lecture.exam(3);	// 시험봄 setScores() 호출
		lecture.info();	// 학생 정보 출력 + 강좌 전체 평균
	}

}
