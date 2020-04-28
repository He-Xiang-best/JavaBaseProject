package ex03_P118;

import java.util.Scanner;
/**
 * @content:课本P118页第7题，给定一个正整数，判断其是否为素数，并输出判断结果
 * @author:04191315何翔
 * @time:2020年4月29日上午12:16:34
 */
public class P118_7 {
	private static Scanner input;

	public static void main(String[] args) {
		//创建对象，并通过对象调用方法实现功能
		P118_7 p = new P118_7();
		//调用inputnum函数实现数字的录入
		int getnum = p.inputnum();
		//将录入的数字传到judge方法里面，判断是否为素数，并输出结果
		if (p.judge(getnum))
			System.out.println(getnum + " 是素数");
		else
			System.out.println(getnum + " 不是素数");
	}

	//判断传入的正整数是否为素数
	public  boolean judge(int num) {
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		if (num == i)
			return true;
		return false;
	}
   
	//从控制台上获取一个正整数
	public  int inputnum() {
		System.out.println("请给定一个正整数，判断其是否为素数：");
		input = new Scanner(System.in);
		int num = input.nextInt();
		while (num <= 0) {
			System.out.println("输入错误！请重新输入一个正整数：");
			num = input.nextInt();
		}
		return num;
	}

}
