package ex05_exception_class;

// 예외클래스는 "직렬화"를 대비해서 
// serialversionID를 생성하라고 
// 항상 경고를 한다.
// 직렬화 처리할 필요가 없다면, 경고 메세지를 무시하라고
// @SuppressWarnings 이라고 붙여준다.

@SuppressWarnings("serial")
public class UpDownException extends Exception {

	public UpDownException() {
		super("1~100 사이의 숫자가 아니다.");
	}
}
