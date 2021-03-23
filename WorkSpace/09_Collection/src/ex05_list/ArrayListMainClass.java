package ex05_list;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList 클래스
 * 1. List 인터페이스를 구현한 클래스입니다.
 * 2. Generic 기반입니다.
 * 3. 생성방법
 * 	1) ArrayList<E> list = new ArrayList<E>();
 * 	2) List<E> list = new ArrayList<E>();
 *  3) 배열을 구현한 클래스입니다. 자동으로 사이즈를 조정한다.
 *  4) 장점: 순간적인 접근이 빠르다
 *  5) 단점: delete 작업시 불필요한 작업으로 인해 오버헤드 발생
 * 4. java.util.List (인터페이스)
 * */
public final class ArrayListMainClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		
		list.remove(0);
		list.remove("짱구");
		
		System.out.println("list 길이 =" + list.size());
		System.out.println(list);
		
		if(list.contains("둘리"))
			System.out.println("둘리 있다");
		else
			System.out.println("둘리 없다");
		
		System.out.println("첫 번째 요소: " + list.get(0));
		System.out.println("마지막 요소: " + list.get(list.size()-1));
		int length = list.size();
		for(int i = 0; i < length;i++) {
			System.out.println((i+1) +"번째 요소: " + list.get(i));			
		}
		
		for(String element:list) {
			System.out.println(element);
		}
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
