package ex05_3_old;

public class Circle implements Shape {
	private final double pi = 3.14;
	private double radius;

	public Circle() {
		setRadius(1);
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	@Override
	public double calculateA() {
		return pi * getRadius() * getRadius();
	}

	@Override
	public double calculateP() {
		return 2 * pi * getRadius();
	}

	@Override
	public void outPut(Shape shape) {
		System.out.println("��ͼ�ε��ܳ�Ϊ��" + (float) shape.calculateP() + "\t���Ϊ��" + (float) shape.calculateP());

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
