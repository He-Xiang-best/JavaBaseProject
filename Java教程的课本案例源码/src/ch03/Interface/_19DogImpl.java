package ch03.Interface;

public class _19DogImpl implements _19AnimalInterface{
	String dogName;
	String dogColor;
	public _19DogImpl(String dogName, String dogColor) {
		super();
		this.dogName = dogName;
		this.dogColor = dogColor;
	}
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogColor() {
		return dogColor;
	}
	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}
	public String sound()
	{ return "ÕÙÕÙ";     }
	public String eat()
	{	return "»‚π«Õ∑";	}

}
