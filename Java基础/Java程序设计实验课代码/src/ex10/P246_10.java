package ex10;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * @content:请输入一个整数n并随机生成n个0~100之间的双精度浮点数打印在data4.txt中，且开头标明data4.txt的字节数
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午11:03:58
 * @第一次修改的时间：
 * @time:2020年6月4日下午11:03:58
 * @修改原因：课堂测验，修改内容：
 */
public class P246_10 {
	public static final String fileName = "src/ex10/data4.txt";
	public static void main(String[] args) throws IOException {
		output();
	}
 /*
  * 统计并打印文件的字节数及信息：
  */
	public static void output() throws IOException {
		System.out.println("请输入一个整数n，并随机生成n个0~100之间的双精度浮点数");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Double[] num = null;
        num = new Double[n];
        byte sum = 0;
        for (int i = 0; i < n; i++) {
			num[i] = (Math.random()*1000)%101;
			sum += Double.toString(num[i]).getBytes().length;
		}
        PrintStream p =new PrintStream(fileName);
        p.println("data4.txt的字节数为："+sum);
        for (int i = 0; i < num.length; i++) {
        	  p.print(num[i]);
		}
        System.out.println("已打印在data4.txt，请查看！");
        input.close();
        p.close();
	}
}
