package ex05_3_old;

public class Pentagon extends Triangle {
	public Pentagon() {
		super(1, 1, 1);
	}

	public Pentagon(double a) {
		setA(a);

	}

	@Override
	public double calculateP() {
		return 5 * getA();
	}

	@Override
	public double calculateA() {
		return (5 * getA() * getA() * Math.tan(Math.toRadians(54))) / 4;
	}
}
