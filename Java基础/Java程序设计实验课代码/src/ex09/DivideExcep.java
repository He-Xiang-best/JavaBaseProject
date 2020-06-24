package ex09;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @content:	
 * 编写程序DivideExcep.java。计算两数相除并输出结果。
 * 使用两个catch子句，分别捕捉除数为0的异常和参数输入有误异常。
 * 编译并运行，当输入除数为0时，将有异常出现，
 * 当输入的不是整数时，如将30输成了3o，出现的是另一种异常。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日上午8:54:44
 * @第一次修改的时间：
 * @time:2020年6月4日上午8:54:44
 * @修改原因：课堂测验，修改内容：
 */
public class DivideExcep {

	public static void main(String[] args) {
		try {
			System.out.println("计算结果： x / y = " + input());
		} catch (ArithmeticException e1) {
			System.err.println("数据输入错误，分母不能为‘0’！");
			e1.printStackTrace();
		} catch (InputMismatchException e2) {
			System.err.println("数据输入错误！输入的数据非整型！");		
			e2.printStackTrace();
		}

	}

	public static int input() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个整数x,y，即可计算x/y相除的结果：");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		return x / y;

	}
}
