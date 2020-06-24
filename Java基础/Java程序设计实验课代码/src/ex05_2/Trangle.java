package ex05_2;

import java.util.Scanner;
/**
 * 
 * @content:增加三角形类，计算面积
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月20日上午11:15:55
 * @第一次修改的时间：
 * @time:2020年5月20日上午11:15:55
 * @修改原因：课堂测验，修改内容：
 */
public class Trangle extends Shape{
	public static Scanner input;
	//定义三角形的三条边长，暂不使用getter和setter方法
	private double a;
	private double b;
	private double c;
/*
 * 通过构造方法初始化成员变量:
 */
	public Trangle() {
		input = new Scanner(System.in);
		System.out.println("请分别输入三角形的三条边长：");
		this.a = input.nextDouble();
		this.b = input.nextDouble();
		this.c = input.nextDouble();
		//判断注意能否构造图形，比如三角形三点成一线就无法创建
		while(a+b<=c||a+c<=b||b+c<=a||a<=0||b<=0||c<=0) {
			System.out.println("输入的边长无法构成三角形！请重新输入三条边长：");
			this.a = input.nextDouble();
			this.b = input.nextDouble();
			this.c = input.nextDouble();
		}
	}
	@Override
	public void draw() {
		double p = (float) (a + b + c) / 2;
		System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));

		
	}

}
