package ex06_access;

public class MainClass {

	public static void main(String[] args) {
		// 클래스에 생성자가 없는 경우에는 디폴트 생성자가 자동 사용됨.
		// public Person() {}

		Person p = new Person();
		p.setAge(18);
		p.setKorean(false);
		p.setName("Alice");
		
		System.out.println(p.getName() + "은(는) " + p.getAge() + "살의 " + (p.isKorean() ? "한국인입니다." : "외국인입니다."));
		
	}

}
