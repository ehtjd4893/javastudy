package ex09_hash;

import java.util.HashSet;
import java.util.Set;

public class BoardMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b1 = new Board(1000,"공지","관리자");
		Board b2 = new Board(1000,"공지","관리자");
		Board b3 = new Board(1000,"공지","관리자");
		
		Set<Board> set = new HashSet<Board>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		System.out.println(set);
	}

}
