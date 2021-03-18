package quiz02;

public class Staff {
	private String name;

	public Staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
