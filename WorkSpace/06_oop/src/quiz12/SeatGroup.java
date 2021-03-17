package quiz12;

import java.util.Scanner;

public class SeatGroup {
	private char seatType; // S , R , A , B 중 1
	private int charge;	// 요금
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.seats = new Seat[seatCount];	// 배열 생성만 했음, 아직 실제 좌석은 생성 안 됐음
		this.charge = charge;
		for(int i =0; i < seatCount; i++)
			seats[i] = new Seat();		// 좌석 생성.
	}

	// 예약, boolean(성공시 true),
	public boolean reservation() {
		// 좌석번호 1 ~ 10
		System.out.print("예매할 좌석 번호  >>> ");
		int seatNo = sc.nextInt();
		// 사용자가 예매하려는 시트는 seats[seatNo - 1]입니다.
		// 1. 예매번호 확인
		if(seatNo < 1  || seatNo > 10) {
			System.out.println(seatNo + "번은 없는 좌석입니다. 예약을 다시 시도하세요.");
			return false;
		}
		// 2. 이미 예매된 곳인지 확인
		if(seats[seatNo - 1].check()) {
			System.out.print("예매자의 성함을 입력하세요 >>>");
			seats[seatNo - 1 ].setName(sc.next());
			return true;
		} else {
			System.out.println("이미 예약된 좌석입니다. 예약을 다시 시도하세요.");
			return false;
		}

	}
	
	public boolean cancel() {
		System.out.print("예매 취소자의 이름을 입력하세요 >>>");
		String name = sc.next();
		for(int i = 0; i < seats.length;i++) {
			if(seats[i].getName() != null && seats[i].getName().equals(name)) {
				System.out.println("예매를 취소하겠습니까?[Y/N]");
				String yesNo = sc.next();
				yesNo = yesNo.charAt(0) + "";
				if(yesNo.equalsIgnoreCase("Y")) {
					seats[i].cancel();
					System.out.println("예매가 취소되었습니다.");
					return true;
				}
				else {
					System.out.println("예매를 취소하지 않았습니다.");
					return false;
				}
			}
		}
		System.out.println(name + "님의 예매 내역이 없습니다.");
		return false;
	}
	
	public void info() {
		System.out.print(seatType + " : ");
		for(int i = 0; i < seats.length;i++) {
			seats[i].info();
			System.out.print(" ");
		}
		System.out.println();
	}
	public int getTotalCharge() {
		int total = 0;
		for(Seat seat: seats) {
			if(!seat.check()) {
				total += charge;
			}
		}
		return total;
	}
}
