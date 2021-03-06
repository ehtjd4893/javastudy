package quiz01;

public class Watch {
	private int hour, minute, second;
	
	public Watch(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void addHour(int h) {
		this.hour += h;
		this.hour %= 24;
	}
	
	public void addMinute(int m) {
		this.minute += m;
		int share = this.minute / 60;
		this.minute %= 60;
		this.addHour(share);	
	}
	
	public void addSecond(int s) {
		this.second += s;
		int share = this.second / 60;
		this.second %= 60;
		this.addMinute(share);
	}
	
	public void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
}
