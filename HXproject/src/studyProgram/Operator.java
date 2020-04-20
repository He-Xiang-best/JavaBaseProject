package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:多种进制的输出
 * @author:何翔
 * @time:2020年2月20日下午5:39:44
 */
public class Operator {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("请输入一个数（十进制）");
		input = new Scanner(System.in);
		int num = 0;
		num = input.nextInt();
		System.out.println(num + "的二进制数为： " + Integer.toBinaryString(num));
		System.out.println(num + "的二进制补码为：" + Integer.toBinaryString(~num));
		System.out.println("-" + num + "的二进制数为： " + Integer.toBinaryString(-num));
		System.out.println(num + "的八进制数为： " + Integer.toOctalString(num));
		System.out.println(num + "的十六进制数为：" + Integer.toHexString(num));
	   		 
	}

}
