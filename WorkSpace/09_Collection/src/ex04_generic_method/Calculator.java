package ex04_generic_method;

public class Calculator {
	
	
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public <T> double getTotal1(T[] a){
		double total = 0.0;
		for(int i = 0; i < a.length;i++) {
			total += ((Number)a[i]).doubleValue();
		}
		return total;
	}
	
	public <T extends Number> double getTotal2(T[] a) {
		double total = 0.0;
		for(int i = 0; i< a.length; i++) {
			total += a[i].doubleValue();
		}
		return total;
	}
	
}
