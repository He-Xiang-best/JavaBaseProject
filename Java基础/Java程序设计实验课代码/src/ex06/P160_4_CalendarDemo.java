package ex06;

import java.util.Calendar;
/**
 * 制作一个万年历
 * @content:使用Calendar类输出2008年的日历，并统计日期的个位数与相应的星期恰好相同的总天数
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月21日下午5:23:28
 * @第一次修改的时间：
 * @time:2020年5月21日下午5:23:28
 * @修改原因：课堂测验，修改内容：
 */
public class P160_4_CalendarDemo {
	//找到与相应的星期恰好相同的目标
	static String[] weekday = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
	//设置相应的月份天数
	static int[] Monthday = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	//设置打印的年份（也可以在主函数中使用Scanner录入,但就不能用final定义）
	static final int year = 2008;

	public static void main(String[] args) {
		System.out.println("使用Calendar类打印2008年的日历如下:");
		//判断是否为闰年，决定2月份的天数
		if (Isleapyear())
			Monthday[2] = 29;
		else
			Monthday[2] = 28;		
		int date = 0,count = 0,days = 0,weekdate;
		//循环打印月份信息
		for (int month = 1; month <= 12; month++) {
			printCalender(month);
			System.out.println();
			//固定的公式求日期对应的星期是星期几
			for (int day = 1; day <= Monthday[month]; day++) {
				days++;
				weekdate = ((year - 1) + (int) (year - 1) / 4 - (int) (year - 1) / 100 + (int) (year - 1) / 400 + days) % 7;
				date = day % 10;
				if (date == weekdate) {
					System.out.println(year + "年" + month + "月" + day + "日恰好是" + weekday[weekdate]);
					count++;
				}
			}
			System.out.println("=====================================================");
			
		}
		System.out.println(year + "年日期的个位数与相应的星期恰好相同的总天数为：" + count);
	}

	public static void printCalender(int month) {
		System.out.println("\t\t\t" + month + "月\n");
		//Calendar是抽象类，通过方法getInstance()获取功能
		Calendar calendar = Calendar.getInstance();
		//设置日历的信息，但注意月份是从0开始的（西方文化）
		calendar.set(year, month - 1, 1);
		// 求本周开始的第一天是星期几
		int startDay = calendar.get(Calendar.DAY_OF_WEEK); 
		int count = startDay - 1;
		int maxDay = Monthday[month];
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		//填补每个月开头前的空缺
		fillSpace(startDay);
		//打印日历信息
		for (int day = 1; day <= maxDay; day++) {
			System.out.print(day + "\t");
			count++;
			// 每输出7天换一次行
			if (count >= 7) { 
				count = 0;
				System.out.println();
			}
		}
	}

	public static void fillSpace(int startDay) {
		for (int i = 1; i < startDay; i++) {
			System.out.print("\t");
		}
	}

	public static boolean Isleapyear() {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}
