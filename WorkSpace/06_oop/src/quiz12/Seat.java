package quiz12;

public class Seat {
	private String name;
	
	// no constructor;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void cancel() {
		this.name = null;
	}
	public boolean check() {	// true이면 예매가능.
		return this.name == null;
	}
	public void info() {
		if(name == null)
			System.out.print("가능");
		else
			System.out.print(name.length() > 2 ? (name.charAt(0) + "*" + name.charAt(name.length()-1)) : "");
	}
	
	// 
}
