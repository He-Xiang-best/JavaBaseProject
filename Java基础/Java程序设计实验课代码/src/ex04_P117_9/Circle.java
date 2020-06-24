package ex04_P117_9;

public class Circle extends Triangle {
	private final double pi = 3.14;

	public Circle() {
	}

	public Circle(double radius) {
		setA(radius);
	}

	public double perimeter() {
		return 2 * pi * getA();
	}

	public double area() {
		return pi * getA() * getA();
	}
}
