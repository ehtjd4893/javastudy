package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
		
		// 클래스 Person을 타입으로 하는 '객체' 생성
		Person p1 = new Person();
		
		// 클래스에 포함된 멤버(필드, 메소드)는 마침표(.)로 호출한다.
		System.out.println("나이: " + p1.age);
		System.out.println("키: " + p1.height);
		System.out.println("성별: " + p1.gender);
		System.out.println("이름:" + p1.name);
		System.out.println(p1.isKorean ? "한국인" : "외국인");
		
		System.out.println(p1);		// new Person()으로 생성된 객체의 주소(참조)가 저장되어 있다.
		Person p2 = p1;				// p1의 주소값을 p2에 복사.
		System.out.println(p2);		// p1과 p2는 동일한 값을 갖기 때문에 p2를 수정하면 p1도 함께 수정됨.
		p2.name = "도성";
		System.out.println("변경한 p1 이름: " + p1.name);
		System.out.println("변경한 p2 이름: " + p2.name);
	}

}
