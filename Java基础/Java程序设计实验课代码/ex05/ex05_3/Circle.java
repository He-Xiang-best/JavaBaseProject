package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:设置一个圆形类实现Shape接口,并完成其周长，面积的计算
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:19:23
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:19:23
 * @修改原因：课堂测验，修改内容：
 */
public class Circle implements Shape {
	public static Scanner input;
	//定义常量π以及半径
	private final double pi = 3.14;
	private double radius;
	/*
          * 通过构造方法初始化成员变量:
     */    
	public Circle() {
		input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		this.radius = input.nextDouble();
		//判断边长的合理性
				while(this.radius<0) {
					System.out.print("边长输入错误，请重新输入：");
					this.radius = input.nextDouble();
	}
}
	/*
	  *实现接口的方法：
	 */
	@Override
	public double calculateA() {
		return pi * radius * radius;
	}

	@Override
	public double calculateP() {
		return 2 * pi * radius;
	}

	@Override
	public void outPut() {
		System.out.println("此圆形的周长为：" + (float)calculateP() + 
		           "\t面积为：" + (float)calculateA());
	}


}
