package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:设置一个正方形类实现Shape接口,并完成其周长，面积的计算
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日上午11:59:28
 * @第一次修改的时间：
 * @time:2020年5月13日上午11:59:28
 * @修改原因：课堂测验，修改内容：
 */
public class Square implements Shape {
	public static Scanner input;
	//定义正方形的边长
    private double x;
    /*
          * 通过构造方法初始化成员变量:
     */
    public Square() {
    	input = new Scanner(System.in);
    	System.out.println("请输入正方形的边长：");
		this.x = input.nextDouble();
		//判断边长的合理性
		while(this.x<0) {
			System.out.print("边长输入错误，请重新输入：");
			this.x = input.nextDouble();
		}
	}
	/*
	  *实现接口的方法：
	 */
	@Override
	public double calculateP() {
		return 4*x;
	}
	
	@Override
	public double calculateA() {
		return x*x;
	}
	@Override
	public void outPut() {
		System.out.println("此正方形的周长为：" + (float)calculateP() + 
		           "\t面积为：" + (float)calculateA());
	}



}
