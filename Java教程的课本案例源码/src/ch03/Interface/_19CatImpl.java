package ch03.Interface;

public class _19CatImpl implements _19AnimalInterface{
	String catName;
	String catColor;
	public _19CatImpl(String catName, String catColor) {
		super();
		this.catName = catName;
		this.catColor = catColor;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatColor() {
		return catColor;
	}
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}
	public String  sound()
	{	return "ß÷ÎØ";		}
	public String eat()
	{	return "Óã";		}

}
