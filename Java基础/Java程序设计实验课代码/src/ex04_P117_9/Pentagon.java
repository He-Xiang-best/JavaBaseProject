package ex04_P117_9;

public class Pentagon extends Triangle {
	public Pentagon() {
	}

	public Pentagon(double a) {
		setA(a);
	}

	public double perimeter() {
		return 5 * getA();
	}

	public double area() {
		return (5 * getA() * getA() * Math.tan(Math.toRadians(54))) / 4;
	}
}
