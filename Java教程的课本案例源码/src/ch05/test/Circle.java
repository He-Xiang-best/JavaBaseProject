package ch05.test;

public class Circle implements Shape {

	private double radius,area;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		System.out.print("���"+area);
		return area;
	}
	public void computerArea() {
		// �������
		area=Math.PI*this.radius*this.radius;
		
	}

}
