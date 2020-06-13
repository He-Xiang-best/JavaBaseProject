package ch03.Interface;

public class _16Dog extends _16Animal{
	private String dogColor;
	public _16Dog(String animalName, String dogColor) {
		super(animalName);
		this.dogColor = dogColor;
	}
	public String getDogColor() {
		return dogColor;
	}
	public void setDogColor(String dogColor) {
		this.dogColor = dogColor;
	}
	public String sound()
	{		return "ÕÙÕÙ";
	}
	public String eat()
	{		return "»‚π«Õ∑";
	}

}
