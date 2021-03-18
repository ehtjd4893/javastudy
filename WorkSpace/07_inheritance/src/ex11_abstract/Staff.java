package ex11_abstract;

/*1. 추상메소드
	1) 본문이 없는 메소드
	2) 메소드를 정의할 때 abstract 키워드를 앞에 추가
	3) 중괄호 {}를 빼고 세미콜론을 붙인다.
  2. 추상클래스
  	1) 추상메소드가 1개 이상 포함된 클래스
  	2) 클래스 정의 앞에 abstract 키워드 추가
*/

 public abstract class Staff {
	private String name;

	public Staff(String name) {
		super();
		this.name = name;
	}
	
	public void info() {
		System.out.println("직원명: "+ name);
	}
	
	/*
	 * public int getPay() {
	 * 		반환할 수 있는 값이 없다.
	 * 		해결책은 본문이 없는 메소드
	 * }
	 */
	public abstract int getPay();
}
