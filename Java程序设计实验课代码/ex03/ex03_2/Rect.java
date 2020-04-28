package ex03_2;

import java.util.Scanner;
/**
 * @content:
      编写一个矩形类（Rect)
 * @author:04191315何翔
 * @time:2020年4月28日下午11:51:40
 */
public class Rect {
	private Scanner input;
	//在矩形类中定义长、宽、周长和面积四个域变量
	private double rectLong;
	private double rectWize;
	private double rectPerimeter;
	private double rectArea_S;
  
	public void setRectPerimeter(double rectLong, double rectWize) {
		this.rectPerimeter = 2 * (rectLong + rectWize);
	}

	public void setRectArea_S(double rectLong, double rectWize) {
		this.rectArea_S = rectLong * rectWize;
	}
	//设计getter方法能求出矩形的面积（area_S）和周长(perimeter)
	public double getRectPerimeter() {
		return rectPerimeter;
	}

	public double getRectArea_S() {
		return rectArea_S;
	}
	
    //在构造方法里对其进行初始化；
	public Rect() {
		input = new Scanner(System.in);
		System.out.print("请分别输入矩形的长和宽：\t");
		this.rectLong = input.nextDouble();
		this.rectWize = input.nextDouble();
		while (rectWize <= 0 || rectLong <= 0) {
			System.out.println("输入错误！请重新输入长和宽：");
			this.rectLong = input.nextDouble();
			this.rectWize = input.nextDouble();
		}
		setRectArea_S(rectLong, rectWize);
		setRectPerimeter(rectLong, rectWize);
	}

}