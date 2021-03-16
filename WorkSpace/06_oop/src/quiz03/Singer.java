package quiz03;

public class Singer {
	private String name;
	private Song song;
	
	public Singer(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
	public void info() {
		System.out.print(this.name);
		(this.song).info();
	}
}
