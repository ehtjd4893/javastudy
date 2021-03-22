package ex03_generic;

import java.util.Arrays;

public class Box<T> {
	
	private T[] items;
	//private T[] items = new T[10];
	// 필드를 결정하는 것은 compile time, T를 결정하는 것은 run time
	// 때문에 T가 아직 결정되지 않은 시점에 10개만큼 할당하는 것은 불가능
	private int idx;
	
	public Box(int itemCount) {
		// 코드 작성 시점에는 T의 구체적인 종류를 알 수 없다.
		// 따라서 메모리 할당이 불가능하다.
		// items = new T[itemCount] 불가능
		items = (T[]) new Object[itemCount]; // Object 배열 생성 뒤에는 캐스팅을 해줘야 함
		this.idx = 0;
	}
	
	public T[] getItems() {
		return items;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}

	public void addItem(T item) {
		if(idx == items.length) {
			System.out.println("full");
		return;	
		}
		items[idx++] = item;
	}

	@Override
	public String toString() {
		String result = "";
		for( T item : items) {
			if(item != null) {
				result += (item).toString() + "\n";
			}
		}
		return result;
	}
	
	
}
