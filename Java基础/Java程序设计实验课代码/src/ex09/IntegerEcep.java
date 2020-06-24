package ex09;

import java.util.Scanner;
/**
 * @content:
 * 编写一个程序IntegerExcep.java。从命令行输入一个字符串，将该字符串转换为double型数据，
 * 当数据不在【0,100】之间时抛出一个异常，采用适当的机制来捕获并处理异常。
 * 可以用现成的异常也可以自定义异常。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日上午9:53:49
 * @第一次修改的时间：
 * @time:2020年6月4日上午9:53:49
 * @修改原因：课堂测验，修改内容：
 */
public class IntegerEcep {

	private static Scanner input;
	public static void main(String[] args) throws Exception {
		input = new Scanner(System.in);
		System.out.println("请输入一个字符串，并判断是否能转换成【0~100】之间的数据");
		String str = input.nextLine();
		judge(input(str));
	}

	public static double input(String str) {
		try {
		 double a = Double.parseDouble(str);
			return a;
		} catch (NumberFormatException e) {
			System.err.println("输入错误！有非double类型字符串！");
			e.printStackTrace();
		}
		return -1;		
	}
	
	public static void judge(double a) throws Exception {
		if(!(a>=0 && a<=100))
		{
    	throw new Exception("\n输入的字符串转换成的数据不再【0~100】之间");
		}
	else
		System.out.println("此字符串转换为double类型的数据为："+a);		
	}
}


