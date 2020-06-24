package ch03.Interface;

public class _16Cat extends _16Animal{
	private String catColor;
	public _16Cat(String animalName, String catColor) {
		super(animalName);
		this.catColor = catColor;
	}
	public String getCatColor() {
		return catColor;
	}
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}
	public String  sound()
	{		return "ß÷ÎØ";	
	}
	public String eat()
	{		return "Óã";
	}

}
