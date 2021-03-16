package quiz11;

public class Day {
	private String schedule;

	// no constructor
	
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void info() {
		if(this.schedule == null || schedule.isEmpty()) // isEmpty()는 string == ""일 때 true 반환
			System.out.println("No schedule");
		else
			System.out.println(this.schedule);
	}
}
