package quiz12;

import java.util.Scanner;

public class SeatGroup {
	private char seatType; // S , R , A , B 중 1
	private int charge;	// 요금
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);
	
	public SeatGroup(char seatType, int seatCount, int charge) {
		this.seatType = seatType;
		this.seats = new Seat[seatCount];	// 배열 생성만 했음, 아직 실제 좌석은 생성 안 됐음
		this.charge = charge;
		for(int i =0; i < seatCount; i++)
			seats[i] = new Seat();		// 좌석 생성.
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
}
