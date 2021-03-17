package quiz12;

import java.util.Scanner;

public class ConcertHall {
	private String hallName;
	private char[] seatTypes = {'S','R','A','B'};
	private int[] seatCounts = {10,10,10,10};
	private int[] charges = {200000, 150000, 100000, 50000}; 
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);
	
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[seatTypes.length];
		for(int i = 0; i < seatGroups.length;i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}

	public void run() {
		while(true) {
			this.menu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1: reservation(); break;
			case 2: cancel(); break;
			case 3: inquiry(); break;
			case 4: info(); break;
			case 0: exit(); return;
			default:System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
		}
	}
	
	
	private void exit() {
		System.out.println(hallName + " 예매프로그램 종료");
		sc.close();
		
	}

	private void info() {
		System.out.println("홀" + hallName);
		System.out.println("예매 총액: "+ getTotalCharge());
		for(SeatGroup seatGroup : seatGroups)
			seatGroup.info();
		
	}

	private void inquiry() {
		System.out.print("조회할 사용자 이름 입력 >>>");
		String name = sc.next();
		for(int i = 0; i < seatGroups.length;i++) {
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
			for(int j = 0; j < seats.length;j++) {
				if(name.equals(seats[j].getName())) {
					System.out.println(seatTypes[i] + "타입: " + (j+1) + "번 좌석이 " + name + "님 이름으로 예약되어 있습니다.");
					return;
				}
			}
		}
		System.out.println(name + "님의 예매내역이 없습니다.");
	}

	public int getTotalCharge() {
		int total = 0;
		for(SeatGroup seatGroup:seatGroups) {
			total +=seatGroup.getTotalCharge();
		}
		return total;
	}
	
	private void cancel() {
		System.out.print("예매 취소할 좌석 타입  (S, R, A, B) 입력 >>>");
		char seatType = sc.next().charAt(0);
		for(int i = 0; i < seatGroups.length;i++) {
				if(seatType == seatTypes[i]) {
					seatGroups[i].cancel();
					return;
				}
		}		
	}

	private void reservation() {
		System.out.print("예매할 좌석 타입(S, R, A, B) 입력 >>> ");
		char seatType = sc.next().charAt(0);
		for(int i = 0; i < seatTypes.length; i++) {
			if(seatType == seatTypes[i] || seatType == seatTypes[i]+32)
				seatGroups[i].reservation();
		}
	}

	public void menu() {
		System.out.println("=====예매프로그램=====");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황 ");
		System.out.println("0. 프로그램 종료");
		System.out.println("==================");
	}
}
