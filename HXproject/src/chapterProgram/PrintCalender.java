package chapterProgram;
 
import java.util.Scanner;
 
public class PrintCalender {

    public static void main(String[] args) {
 
	int date = 0; // 存放输入的年月后计算得到的1号的星期
	int day_max = 0;// 存放输入的年月的月的天数
 
	int year = 0;// 用来保存输入的年份
	int month = 0;// 用来保存输入的月份
 
	Scanner in = new Scanner(System.in);
	System.out.print("请输入年份：");
	year = in.nextInt();
	System.out.print("请输入月份：");
	month = in.nextInt();
	System.out.println("输入的日期为：" + year + "-" + month);
	in.close();
 
	int day_sum = 0;
	// 对1900~year之间的年份进行累加天数
	for (int i = 1900; i < year; i++) {
	    // 判断是否是闰年
	    if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
		// 闰年366天
		day_sum += 366;
	    } else {
		// 平年365天
		day_sum += 365;
	    }
	} 
 
	// 对月份进行累加计算
	for (int i = 1; i < month; i++) {
	    switch (i) {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
		day_max = 31;
		day_sum += 31;
		break;
	    case 2:
		// 判断是否是闰年
		if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
		    // 闰年2月29
		    day_sum += 29;
		} else {
		    // 平年2月28
		    day_sum += 28;
		}
		break;
	    default:
		day_sum += 30;
		break;
	    }
	} // for
 
	date = 1 + day_sum % 7; // 存放输入的日期计算得到的星期,1900年1月1日星期一
	System.out.println("输入的日期为：" + year + "-" + month + ",这个月的1号是星期" + date);
	// 如果是星期日，开头则 不用空出来距离
	// 此处之后date变量表示这月1号前面制表符的个数
	if (date == 7) {
	    date = 0;
	}
	// 判断这个月份多少天
	switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    day_max = 31;
	    break;
	case 2:
	    // 判断是否是闰年
	    if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
		// 闰年2月29
		day_max = 29;
	    } else {
		// 平年2月28
		day_max = 28;
	    }
	    break;
	default:
	    day_max = 30;
	    break;
	}
	System.out.println("==================================================");
 
	// 输出表头
	System.out.print("日\t一\t二\t三\t四\t五\t六\n");
 
	int day = 1;// 打印的天数
 
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 7; j++) {
		// 打印第一行的时候，空出前date个空间
		if (i == 0 && j < date) {
		    System.out.print("\t");
		    // 跳出当前次循环
		    continue;
		}
 
		if (day > day_max) {
		    break;
		}
		System.out.print(day + "\t");
		day++;
	    }
	    // 打印完一行后换行
	    System.out.println();
	}
	System.out.println("==================================================");
    }
 
}