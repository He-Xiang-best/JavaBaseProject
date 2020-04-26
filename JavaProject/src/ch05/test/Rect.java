package ch05.test;

public class Rect implements Shape{
	private double width,length,area;
	public Rect(double width,double length){
		this.width=width;
		this.length=length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		System.out.print("Ãæ»ý"+area);
		return area;
	}

	public void computerArea(){
		this.area=width*length;

	}

}
