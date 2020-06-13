package ex05_3_old;

public class Square extends Triangle {
	public Square() {
		super(1, 1, 1);
	}

	public Square(double a) {
		setA(a);
	}

	@Override
	public double calculateA() {
		return getA() * getA();
	}

	@Override
	public double calculateP() {
		return 4 * getA();
	}

}
