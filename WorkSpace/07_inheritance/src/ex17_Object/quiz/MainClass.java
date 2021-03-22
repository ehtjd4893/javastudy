package ex17_Object.quiz;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s1 = new Score();
		Score s2 = new Score(70,80,90);
		
		s1.setKor(70);
		s1.setEng(80);
		s1.setMat(90);
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			System.out.println("성적이 같다.");
		}else {
			System.out.println("성적이 다르다.");
		}
	}

}
