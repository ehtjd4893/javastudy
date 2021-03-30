package ex05_synchronized;

/*
 * Critical section
 * 1. 임계 영역
 * 2. 공유 자원을 관리하기 위해서 한 번에 한 스레드의 접근만 허용
 * */
public class Dyson {
	
	//synchronized
	// 한 스레드만 floorCleaning()나 homeCleaning()에 접근할 수 있습니다.
	// 동시 접근 불가
	
	// method
	public synchronized void floorCleaning() {
		try {
			System.out.println("바닥 청소 ing...");
			Thread.sleep(10);	// 1000밀리초(1초) 일시중지
			notify();	// 다른 스레드에게 florrCleaning() 메소드가 끝났음을 알린다.
			wait();	// 다른 쓰레드가 끝났다고 알려줄 때까지 기다립니다.
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void homeCleaning() {
		try {
			System.out.println("집안 청소 ing...");
			Thread.sleep(10);
			notify();
			wait();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
