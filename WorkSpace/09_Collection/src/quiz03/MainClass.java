package quiz03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		while(set.size() != 6) {
				int tmp = (int)(Math.random()*45)+1;
				set.add(tmp);
		}
		
		System.out.println(set);

	}

}
