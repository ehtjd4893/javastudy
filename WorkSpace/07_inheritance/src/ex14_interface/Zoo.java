package ex14_interface;

public class Zoo {
	private Animal[] animals;
	private int idx;
	
	
	public Zoo(int cnt) {
		super();
		this.animals = new Animal[cnt];
		this.idx = 0;
	}

	public void addAnimal(Animal animal) {
		if(idx < animals.length)
		{
			animals[idx++] = animal;
		}
	}
	
	public void info() {
		for(Animal animal : animals) {
			if(animal != null)
				animal.move();
		}
	}
}
