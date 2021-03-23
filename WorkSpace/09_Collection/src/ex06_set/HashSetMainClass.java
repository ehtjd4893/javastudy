package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*
 * HashSet 클래스
 * 1. Set 인터페이스를 구현한 클래스
 * 2. 기본특징
 *   1)인덱스가 없습니다(순서가 없다)
 *   2)
 * */
public class HashSetMainClass {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("jsp");
		set.add("jsp");
		set.add("spring");
		set.add("spring");
		System.out.println("원소 개수: " + set.size());
		for(String s : set)
			System.out.println(s);

	}

}
