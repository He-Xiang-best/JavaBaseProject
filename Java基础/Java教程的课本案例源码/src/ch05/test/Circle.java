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
		System.out.print("面积"+area);
		return area;
	}
	public void computerArea() {
		// 计算面积
		area=Math.PI*this.radius*this.radius;
		
	}

}
