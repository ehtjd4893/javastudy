package ex06_override;

public class Espresso extends Coffee {
	private int water;
	public Espresso(String bean,int water) {
		super(bean);
		this.water = water;
	}
	// 오버라이드: class 상속 관계간의  메소드 다시 만들기
	// 오버로딩: 상속 외의 함수간의 메소드 다시 만들기.

	@Override
	public void taste() {
		System.out.println(super.getBean() + " 에스프레소는 향이 좋지만 맛은 약간 씁니다.");
	}
	// 1. 똑같은 형태로 만듭니다. 똑같지 않으면 오버라이드가 아니다.
	// @override 애너테이션(annotation)을 작성해줍니다.
	//   1)개발자가 자바에게 이 메소드는 오버라이드하는 것이라고 알린다.
	//   2)그러면 자바는 오버라이드 규칙을 어겼을 경우 오류를 발생시켜 알려준다.
}
