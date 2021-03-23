package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// iterator 인터페이스
public class IteratorMainClass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("movie");
		set.add("music");
		set.add("sport");

		Iterator<String> it = set.iterator();
		
		// hasNext() : 다음 요소가 있으면 true 반환
		// next() :다음 요소를 가져옴. 
		while(it.hasNext()) {	// 
			System.out.println(it.next());
		}
		
		List<String> list = new ArrayList<String>();
		list.add("빡대가리");
		list.add("니가 더 빡대가리");
		list.add("너도 빡대가리");
		Iterator<String> it1 = list.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		
		
	}

}
