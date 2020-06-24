package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:设置一个三角形类实现Shape接口,并完成其周长，面积的计算
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日上午11:38:20
 * @第一次修改的时间：
 * @time:2020年5月13日上午11:38:20
 * @修改原因：课堂测验，修改内容：
 */
public class Triangle implements Shape {
	public static Scanner input;
	//定义三角形的三条边长，暂不使用getter和setter方法
	private double a;
	private double b;
	private double c;
/*
 * 通过构造方法初始化成员变量:
 */
	public Triangle() {
		input = new Scanner(System.in);
		System.out.println("请分别输入三角形的三条边长：");
		this.a = input.nextDouble();
		this.b = input.nextDouble();
		this.c = input.nextDouble();
		//判断注意能否构造图形，比如三角形三点成一线就无法创建
		while(a+b<=c||a+c<=b||b+c<=a) {
			System.out.println("输入的边长无法构成三角形！请重新输入三条边长：");
			this.a = input.nextDouble();
			this.b = input.nextDouble();
			this.c = input.nextDouble();
		}
	}
	/*
	  *实现接口的方法：
	 */
	@Override
	public double calculateA() {
		double p = (float) (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
	
	@Override
	public double calculateP() {
		return (a + b + c);

	}

	@Override
	public void outPut() {
		System.out.println("此三角形的周长为：" + (float)calculateP() + 
				           "\t面积为：" + (float)calculateA());
	}
}
