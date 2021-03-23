package ex08_map;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap 클래스
 * 1. Map 인터페이스를 구현한 클래스입니다.
 * 2. 데이터를 쌍(pair)로 저장하는 클래스
 * 3. key-value의 쌍으로 저장
 * 	1) 키(key) : 중복이 불가능
 *  2) 값(value) : 중복이 가능
 * */
public class MapMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> sungjuk = new HashMap<String, Integer>(); 
		
		// 추가: put(key,value)
		sungjuk.put("지구력", 80);
		sungjuk.put("근력",70);
		sungjuk.put("인내력",90);
		
		// 기존의 지구력을 덮어쓴다.
		sungjuk.put("지구력",100);
		
		// 삭제: remove(key)
		sungjuk.remove("근력");
		
		// 원소 가져오기 : get(key)
		System.out.println("지구력: " + sungjuk.get("지구력"));
		System.out.println("인내력: " + sungjuk.get("인내력"));
		
		// 크기: size()
		System.out.println("저장된 데이터 개수: " + sungjuk.size());
		System.out.println(sungjuk);
	}
	

}
