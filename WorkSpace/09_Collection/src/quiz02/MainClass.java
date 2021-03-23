package quiz02;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		int length = list1.size();
		long start = System.nanoTime();
		
		for(int i =0;i<10001;i++) {
			list1.add(i);
			list2.add(i);
		}
		
		for(int i = 0;i < length;i++) {
			list1.remove(0);			
		}
		long end = System.nanoTime();
		System.out.println("Worst:\t" + (end-start));
		length = list2.size();
		
		long start2 = System.nanoTime();
		for(int i = length - 1;i > -1;i--) {
			list2.remove(i);			
		}
		long end2 = System.nanoTime();
		System.out.println("Best:\t" + (end2-start2));
	}

}
