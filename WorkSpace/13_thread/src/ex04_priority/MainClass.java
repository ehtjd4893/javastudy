package ex04_priority;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("가장 낮은 순위: " + Thread.MIN_PRIORITY);
		System.out.println("중간 순위: " + Thread.NORM_PRIORITY);
		System.out.println("가장 높은 순위: " + Thread.MAX_PRIORITY);
		
		Thread hw = new Thread(new Homework());
		Thread wt = new Thread(new WatchTV());
		
		// hw의 우선순위를 높이고, wt의 우선순위를 낮추자
		hw.setPriority(Thread.MAX_PRIORITY);
		wt.setPriority(Thread.MIN_PRIORITY);
		hw.start();
		wt.start();
	}

}
