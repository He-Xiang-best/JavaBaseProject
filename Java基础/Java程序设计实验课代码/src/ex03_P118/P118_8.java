package ex03_P118;

import java.util.Scanner;
/**
 * @content:教材P118页第8题
 * @author:04191315何翔
 * @time:2020年4月29日上午12:03:11
 */
public class P118_8 {
private Scanner input;	
//定义三个整数a，b，c变量作为方程的系数
private int a;
private int b;
private int c;

//通过构造方法对三个系数进行赋值
public P118_8() {
System.out.print("请输入三个数a,b,c,求方程ax^2+bx+c=0的根: \t");
input = new Scanner(System.in);
this.a = input.nextInt();
this.b= input.nextInt();
this.c= input.nextInt();
}
/**
 * 
 * @content：
     利用judge函数对方程解的情况进行判断
 * @return
 */
public void judge() {
	//若方程的根的判别式<0，由数学知识知道方程无解
	if (Math.pow(b, 2) - 4 * a * c < 0) {
		System.out.println("要求解的方程： " + a + "x^2" + "+" + b + "x" + "+" + c + "=0  无解！");
	} 
	//反之若根的判别式>=0,则方程有解，根据数学公式:
	//x=(-b +- Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a 即可求解
	else {
		double x1 = (double) (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		double x2 = (double) (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		System.out.println("方程： " + a + "x^2" + "+" + b + "x" + "+" + c + "=0的根为：");
		System.out.println("x1=" + (float) x1 + "\tx2=" + (float) x2);
	}
  }
}