package ex06_P160_4;

public class J_Calendar {
	public static void main(String args[]) {
		J_Year a = new J_Year(2008);
		int w;
		int count = 0;
		for (int month = 1; month <= 12; month++) {
			w = a.getday(month, 1);
			System.out.print("\n\n                    第" + month + "月\n\n");
			System.out.println("  日  一  二  三  四  五  六");
			for (int j = 0; j < w; j++)
				System.out.print("    ");
			for (int day = 1; day <= a.d[month]; day++) {
				System.out.printf("%4d", day);
				w++;
				if (w % 7 == 0)
					System.out.println();
				if ((day % 10) == a.getday(month, day) || (day % 10) == 7 && a.getday(month, day) == 0)
					count++;

			}

		}
		System.out.println("\n\n日期个位数和星期数相同的天数有" + count + "天");

	}
}
