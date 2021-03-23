package ex06_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMainClass {

	public static void main(String[] args) {
		
		
		// 일반 Set와 달리 입력된 순서대로 저장
		Set<String> set = new LinkedHashSet<>();
		set.add("javascript");
		set.add("css");
		set.add("html");
		set.add("html");
		set.add("css");
		set.add("javascript");
		
		for(String s : set)
			System.out.println(s);
	}

}
