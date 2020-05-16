package ch06;

public class _5TestThrowsException {

	public static double avg() throws NegativeArraySizeException {
		int s = 0;
		double avg=0;
		int x[] = new int[-5];
		for (int i = 0; i < 5; i++) {
			x[i] = i;
			s = s + x[i];
		}
		avg=s/5;
		return avg;
	}

	public static void main(String args[]) {
		try {
			System.out.println(avg());
		} catch (NegativeArraySizeException e) {
			System.out.println("Òì³£ÐÅÏ¢£º" + e.toString());
		}
	}
}