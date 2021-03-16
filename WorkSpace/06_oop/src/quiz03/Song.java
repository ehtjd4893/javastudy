package quiz03;

public class Song {
	
	private String title;
	private double playTime;
	
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}
	
	public void info() {
		System.out.println("(" + this.title + ", " + this.playTime + ")");
	}
	
}
