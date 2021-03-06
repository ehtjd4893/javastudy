package quiz07;

import java.util.Scanner;

public class Game {
	private Player[] players;
	Scanner sc = new Scanner(System.in);
	public Game(int playerCnt) {
		players = new Player[playerCnt];
	}
	
	public void setPlayers() {
		String[] names = {"alice", "david","brown", "emily", "james"};
		for(int i = 0; i<players.length; i++) {
			players[i] = new Player(names[(int)(Math.random() * names.length)]);
		}
	}
	public void play() {
		int[] times = new int[players.length];
		int itr = 0;
		int min;
		for(int i = 0; i <players.length; i++) {
			times[i] = players[i].play();
		}
		
		for(int i = 1; i <players.length; i++) {
			
			System.out.println( Math.abs(times[itr] - 10) + ", " + (Math.abs(times[i]-10)) );
			if( Math.abs(times[itr] - 10) > Math.abs(times[i]-10))
					itr = i;
		}
		
		for(int i = 0;i<players.length;i++) {
			System.out.println(players[i].getName() + "'s result: " + times[i] + "seconds");
		}		
		System.out.println(players[itr].getName() + "'s Victory");
	}
}
