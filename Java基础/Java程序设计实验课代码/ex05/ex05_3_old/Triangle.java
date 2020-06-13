package ex05_3_old;

public class Triangle implements Shape {

	private double a;
	private double b;
	private double c;

	public Triangle() {
		a = 3;
		b = 4;
		c = 5;
	}

	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public double calculateP() {
		return (getA() + getB() + getC());

	}

	@Override
	public double calculateA() {
		double p = (float) (getA() + getB() + getC()) / 2;
		return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));

	}

	@Override
	public void outPut(Shape shape) {
		System.out.println("该图形的周长为：" + (float) shape.calculateP() + "\t面积为：" + (float) shape.calculateA());
	}

}
