package ex6.selected;
/**
 * 
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalender {
	int weekday;//当前日期对应的星期数
	int count;//统计日期个位数与星期数相同的数目
	/**
	 * 输出指定年份中小于等于月份的日历
	 * @param year 年份
	 * @param month 输出的所有小于等于month的月份
	 */
	PrintCalender(int year, int month) {

		for (int j = 1; j < month + 1; j++) {
			System.out.println(year+"年" + j + "月");
			System.out.println("日\t一\t二\t三\t四\t五\t六");

			GregorianCalendar d = new GregorianCalendar(year, j - 1, 1);
			d.set(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK); //得到本月第1天从星期几开始 ,包括星期日 
			//将之前的打印空
			for (int i = Calendar.SUNDAY; i < weekday; i++) {
				System.out.print("\t");
			}

			do {
				//打印当前日期
				System.out.print(d.get(Calendar.DAY_OF_MONTH) +"\t");
				//打印到星期六就准备换行
				if (weekday == Calendar.SATURDAY)
					System.out.println();
				//日期加1，对应的星期几相应进行设置
				d.add(Calendar.DAY_OF_MONTH, 1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
				//统计日期个位数与对应星期相同的天数
				if(d.get(Calendar.DAY_OF_MONTH)==(d.get(Calendar.DAY_OF_WEEK)-1))
					count++;
			} while ((d.get(Calendar.MONTH) + 1) == j);
			System.out.println();
			System.out.println("|--------------------------------------------------|");
		}
		System.out.println("统计完的结果为"+count);
	}

}