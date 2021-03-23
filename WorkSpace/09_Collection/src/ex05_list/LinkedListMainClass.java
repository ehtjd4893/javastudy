package ex05_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList 클래스
 * 1. List 인터페이스를 구현한 클래스입니다.
 * 2. 생성방법
 * 	1) LinkedList<E> list = new LinkedList<E>();
 *  2) List<E> list = new LinkedList<E>();
 * 3. 연결리스트를 구현한 클래스입니다. 자동으로 길이 조정
 * 4. 장점: 모든 위치에 추가/삭제가 빠르다
 * 5. 단점: 순차적인 접근이 느리다.
 * */
public class LinkedListMainClass {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		long start1 = System.nanoTime();
		for(int n = 1; n<10000;n++) {
			list1.add(0,n);
		}
		long end1 = System.nanoTime();
		System.out.println("ArrayList : " + (end1-start1) + "나노초");

		
		
		long start2 = System.nanoTime();
		for(int n = 1; n<10000;n++) {
			list2.add(0,n);
		}
		long end2 = System.nanoTime();
		
		System.out.println("LinkedList : " + (end2-start2) + "나노초");
		
		long start3 = System.nanoTime();
		for(int n = 0, length = list1.size(); n < length;n++) {
			list1.get(n);
		}
		long end3 = System.nanoTime();
		
		System.out.println("ArrayList : " + (end3-start3) + "나노초");
		
		long start4 = System.nanoTime();
		for(int n = 0, length = list2.size(); n < length;n++) {
			list2.get(n);
		}
		long end4 = System.nanoTime();
		
		System.out.println("LinkedList : " + (end4-start4) + "나노초");
	}

}
