package ex03_P118;

import java.util.Scanner;
/**
 * @content:给定一个整数，在控制台中分别输出这个整数的补码形式的二进制数，八进制数和十六进制数
 * @author:04191315何翔
 * @time:2020年4月29日上午12:28:38
 */

public class  P118_6{

	public static void main(String[] args) {
		System.out.println("请输入一个整数（十进制）");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//本处直接通过包装类Integer的方法实现，当然也可以在外面定义表示
		System.out.println(num + "的二进制数为： " + Integer.toBinaryString(num));
		System.out.println(num + "的二进制补码为：" + Integer.toBinaryString(~num));
		System.out.println(num + "的八进制数补码为： " + Integer.toOctalString(~num));
		System.out.println(num + "的十六进制数补码为：" + Integer.toHexString(~num));
	   	input.close();	 
	}

}
