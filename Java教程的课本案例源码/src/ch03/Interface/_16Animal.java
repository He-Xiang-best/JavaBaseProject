package ch03.Interface;

public abstract class _16Animal {
	private String animalName;
	public _16Animal(String animalName) {
		super();
		this.animalName = animalName;
	}
	public abstract String sound();
	public abstract String eat();
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	} 
	public void showAnimalName()
	{
		System.out.println("这个动物的名字是"+animalName);
	}

}
