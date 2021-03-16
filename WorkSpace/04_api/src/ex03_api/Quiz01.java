package ex03_api;

// 1. String과 StringBuilder의 성능 비교
// 1) 1~ 10000을 모두 연결합니다.
// 2) 각 클래스별로 연결에 소요된 시간을 ns 단위로 출력합니다.
public class Quiz01 {

	public static void main(String[] args) {
		
		String str = "";
		long start1 = System.nanoTime();
		for(int i = 1; i < 100000; i++) {
			str += i;
		}
		long end1 = System.nanoTime();
		
		StringBuilder sb = new StringBuilder("");
		long start2 = System.nanoTime();
		for(int i = 1; i < 100000; i++) {
			sb.append(i);
		}
		long end2 = System.nanoTime();
		
		System.out.println("String 경과시간: " + (end1 - start1) + "ns");
		System.out.println("String 경과시간: " + ((end1 - start1) / 1000000000.0) + "초");
		System.out.println("String 경과시간: " + (end2 - start2) + "ns");
		System.out.println("String 경과시간: " + ((end2 - start2) / 1000000000.0) + "초");
	

	
	}

}
