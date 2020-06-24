package ex04_P117_9;

public class Square extends Triangle {
	public Square() {
		super(1, 1, 1);
	}

	public Square(double a) {
		setA(a);

	}

	public double perimeter() {
		return 4 * getA();
	}

	public double area() {
		return getA() * getA();
	}
}
