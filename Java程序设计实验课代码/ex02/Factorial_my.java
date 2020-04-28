package ex02;

import java.util.Scanner;
/**
 * @content:计算n！(非递归方法)
 * @author:04191315何翔
 * @time:2020年4月21日下午3:32:58
 */
public class Factorial_my {


public static void main(String[] args) {
	System.out.println("请输入你想计算数字的阶乘");
	Scanner input = new Scanner(System.in);
	long n = input.nextLong();
	double sum = 1;//用long得到的结果也可能会溢出；
	for (int i = 1; i <= n; i++) {
		sum *= i; 
	}
	if(n <= 10)
	System.out.println(n + "!= " + (long)sum);//算小数字的阶乘时可用
	else
	System.out.println(n + "!= " + sum);     //算大数字的阶乘时可用
	input.close();
}
}
