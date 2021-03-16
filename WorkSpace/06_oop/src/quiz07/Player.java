package quiz07;

import java.sql.Date;
import java.util.Scanner;

public class Player {
	private String name;
	private Scanner sc = new Scanner(System.in);
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int play() {	// 몇 초 경과되었다.
		System.out.println(name + "'s Game start!");
		System.out.println("Press Enter");
		sc.nextLine();
		long start = System.currentTimeMillis();
		System.out.println("After 10seconds Press Enter");
		sc.nextLine();
		long end = System.currentTimeMillis();
		return (int)((end - start) / 1000);
	}
}
