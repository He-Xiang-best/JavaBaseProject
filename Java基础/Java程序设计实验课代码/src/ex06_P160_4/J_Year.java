package ex06_P160_4;

public class J_Year {
	int year;
	int allday;
	int[] d = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public J_Year() {
	}

	public J_Year(int year) {
		this.year = year;
		if (Isleapyear()) {
			d[2] = 29;
			allday = 366;
		} else {
			d[2] = 28;
			allday = 365;
		}
	}

	public boolean Isleapyear() {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

	public int getday(int month, int day) {
		int y = year % 100;
		int D = day;
		for (int i = 1; i < month; i++)
			D += d[i];
		return ((y - 1) + ((y - 1) / 4) - ((y - 1) / 100) + ((y - 1) / 400) + D) % 7;// ¹«Ê½
	}
}
