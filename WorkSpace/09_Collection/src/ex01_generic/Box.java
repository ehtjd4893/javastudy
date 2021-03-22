package ex01_generic;

// 제네릭(generic)
// 일반화된 타입을 이용해서 클래스 또는 메소드를 정의해두고,
// 객체 생성이나 메소드 호출할 때
// 구체적으로 타입을 지정하는 방법
public class Box<T> {
	// Box 생성시 Box<String>, Box<Integer> 와 같은 형식으로 사용
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
}
