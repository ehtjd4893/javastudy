package quiz08;

public class Singer {
	private Song[] songs;
	private String name;
	private int idx;
	public Singer(String name, int songCnt) {
		this.name = name;
		this.songs = new Song[songCnt];
		this.idx = 0;
	}
	
	public void addSong(Song song) {
		if(idx < songs.length)
			this.songs[this.idx++] = song;
		else
			System.out.println("곡 추가 실패");
	}
	
	public void info() {
		System.out.println("이름: " + name);
		System.out.println("============노래 목록============");
		for(int i = 0 ; i < idx; i++) {
			songs[i].info();
		}
	}
}
