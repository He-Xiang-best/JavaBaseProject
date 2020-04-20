package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:打印日历，已知1900年一月一日为星期一(计算1900年后的年份日历）
 * @author:04191315何翔
 * @time:2020年2月27日下午12:36:25
 */
public class PrintCalenderDemo {
public static int year=-1,month=-1;
public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
private static Scanner input;
	public static void main(String[] args) {
		// 让用户输入年份和月份
		InputYearAndMonth();
		//打印日历
		PrintCalender();

	}

/**
 * 
 * @content：打印日历的核心方法
 * @2020年2月27日下午12:38:57
 * @return
 */
	public static void PrintCalender() {
		//计算1900年1-1到用户输入年月份的总天数
		/*
		 * 计算各年的总天数和
		 * 计算各月的天数之和
		 */
		int sum = getSumDayOfYear();
		sum += getSumDayOfMonth();
		//sum++;
		//System.out.println(sum);
		//打印年份和月份
		String[] monthNames = {"1月","2月","3月","4月","5月","6月",
				               "7月","8月","9月","10月","11月","12月"};
		System.out.println("\t\t"+year+"\t"+monthNames[month-1]);
		System.out.println("======================================================");
		//打印月份的标题（星期一到星期日）
		String[] weekDays = { "星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		for (int i = 0; i < weekDays.length; i++) {
			System.out.print(weekDays[i]+"\t");
		}
		System.out.println();
		//根据某月1日是星期几，打印月历的内容
		//dayOfWeek取值范围是0~6；
		int dayOfWeek = 1+sum % 7;// 存放输入的日期计算得到的星期,1900年1月1日星期一
		//System.out.println("输入的日期为：" + year + "-" + month + ",这个月的1号是星期" + dayOfWeek);
		// 如果是星期日，开头则 不用空出来距离
		// 此处之后dayOfWeek变量表示这月1号前面制表符的个数
			if(dayOfWeek==7)
			   dayOfWeek=0;
		for (int i = 0; i <dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month-1]; i++) {
			System.out.print(i+1);
			if((dayOfWeek+i) % 7 ==0)
				System.out.println();
			else
				System.out.print("\t");
		}
	}

	// 判断是否是闰年
	public static boolean isleapYear(int year) {	
	return year % 400 == 0||year % 4 == 0 && year % 100 != 0;
}
	
	// 对1900~year之间的年份进行累加天数
	public static int getSumDayOfYear() {
		if(year<=1900) {
			System.out.println("年份输入错误！请重新输入：");
			year = input.nextInt();
		}
		int sum = 0;
		for(int i = 1900;i<year;i++) {
			sum += 365;//每一年累加365天
			if(isleapYear(i)) {
				sum++;//闰年多+1天
			}
		}
		return sum;
	}
	
	// 对月份进行累加计算
	public static int getSumDayOfMonth() {
		int sum = 0;		
		for(int i = 0;i<=month;i++) {
			sum += dayOfMonth[i];
			if(isleapYear(year)&&month >=3) {
				sum++;
			}
		}
		return sum;
	}
	

	public static void InputYearAndMonth() {
	input = new Scanner(System.in);
	System.out.println("请输入年份：");
	year = input.nextInt();
	System.out.println("请输入月份");
	month = input.nextInt();
	//System.out.println("输入的日期为：" + year + "-" + month);
}





































































}
