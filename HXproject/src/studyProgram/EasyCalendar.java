package studyProgram;
/**
 * 
 * @contend：用循环打印日历 
 * @author： 何翔 
 * @time： 2020年2月18日上午11:57:56
 */
public class EasyCalendar {
	/*
	 * 打印1997年7月份的日历 已知7月份的1号是星期二
	 */
	public static void main(String[] args) {
		// 测试此项目用时
		long startTime = System.currentTimeMillis();
		// 方法1：
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		System.out.print("\t");
		int dayOfMonth = 31;
		for (int i = 1; i <= dayOfMonth; i++) {
			if (i % 7 == 0)
				System.out.print("\n");
			System.out.print(i + "\t");
		}
		// 方法2：
		System.out.println("\n");
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");
		System.out.print("\t");
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i + "\t");
			if ((i + 1) % 7 == 0)
				System.out.print("\n");
		}
		// else System.out.println("\t");
		System.out.println("\n");
		long endTime = System.currentTimeMillis();//上面项目编译后电脑运行出来的最终时间
		System.out.println("该项目开始到结束共用时: " + (endTime - startTime) + " 毫秒！");
	}
}
