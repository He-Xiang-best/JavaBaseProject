package ex10;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 * 
 * @content:编写程序Equilateral_Triangle实现在控制台用“*”输出一个倒立的等边三角型，
                       并写到文件triangle.txt中
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午4:03:33
 * @第一次修改的时间：
 * @time:2020年6月4日下午4:03:33
 * @修改原因：课堂测验，修改内容：
 */
public class Equilateral_Triangle {
    static String file = "src/ex10/Triangle.txt";
	public static void main(String[] args) {
		try {
			PrintStream p = new PrintStream(file);
			printMethod1(p);
		} catch (FileNotFoundException e) {
			System.err.println("文件打印错误，打印失败！");
			e.printStackTrace();
		}

	}

	public static void  printMethod1(PrintStream out) {
		System.setOut(out);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}
