package ex02;

import java.util.Scanner;
/**
 * @content:
      定义一个学生的JAVA成绩为n（0到100的整数），
      编写一个程序输出这个学生成绩的等级，
      比如76为“中”。（优：>=90;良：>=80;中：>=70;及格：>=60;不及格：<60)
 * @author:04191315何翔
     本代码第一次完成时间为：
 * @time:2020年4月21日下午3:15:36
     本代码第一次修改时间为：
 * @time:2020年4月29日上午10:45:36 ; 
     修改原因：课堂测验，修改内容：加入输入有效性判断
 */

public class GradeIdentify {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个学生的Java成绩：");
		int n = input.nextInt();
		//加入输入有效性判断,并重新输入
		while (n < 0 || n > 100) {
			System.out.println("您输入的数字不在1-100之间，请重新输入成绩：");
			n = input.nextInt();
		}
		switch (n / 10) {
		case 9:
		case 10:
			System.out.println("成绩：" + n + "\t 等级：优 ");
			break;
		case 8:
			System.out.println("成绩：" + n + "\t 等级 ：良");
			break;
		case 7:
			System.out.println("成绩：" + n + "\t 等级：中 ");
			break;
		case 6:
			System.out.println("成绩：" + n + "\t 等级：及格 ");
			break;
		default:
			System.out.println("成绩：" + n + "\t 等级 ：不及格");
			break;
		}
		input.close();
	}
}
