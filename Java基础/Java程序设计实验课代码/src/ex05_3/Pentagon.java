package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:设置一个正五边形类实现Shape接口,并完成其周长，面积的计算
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午12:01:56
 * @第一次修改的时间：
 * @time:2020年5月13日下午12:01:56
 * @修改原因：课堂测验，修改内容：
 */
public class Pentagon implements Shape {
	public static Scanner input;
	//定义正五边型的边长：
    private double a;
/*
 * 通过构造方法初始化成员变量:
*/    
	public Pentagon() {
		input = new Scanner(System.in);
		System.out.println("请输入正五边形的边长：");
		this.a = input.nextDouble();
		//判断边长的合理性
		while(this.a<0) {
			System.out.print("边长输入错误，请重新输入：");
			this.a = input.nextDouble();
		}
	}

	@Override
	public double calculateP() {
		return 5 * a;
	}

	@Override
	public double calculateA() {
		return (5 * a * a * Math.tan(Math.toRadians(54))) / 4;
	}

	@Override
	public void outPut() {
		System.out.println("此正五边形的周长为：" + (float)calculateP() + 
		           "\t面积为：" + (float)calculateA());	
		
	}
}
