package ex03_2;

import java.util.Scanner;
/**
 * @content:
      编写一个圆类(Circle) 
 * @author:04191315何翔
 * @time:2020年4月28日下午11:53:57
 */
public class Circle {
	final double pi = 3.14;
	private Scanner input;
	//在圆类中定义半径、周长和面积三个域变量；
	private double raduis;
	private double circlePerimeter;
	private double circleArea_S;

	public void setCirclePerimeter(double raduis) {
		this.circlePerimeter = 2 * pi * raduis;
	}

	public void setCircleArea_S(double raduis) {
		this.circleArea_S = pi * raduis * raduis;
	}

	//设计getter方法能求出圆的面积（area_S）和周长(perimeter)。
	public double getCirclePerimeter() {
		return circlePerimeter;
		
	}

	public double getCircleArea_S() {
		return circleArea_S;
	}

	//在构造方法里对其进行初始化；
	public Circle() {
		input = new Scanner(System.in);
		System.out.print("\n请输入圆的半径：\t");
		this.raduis = input.nextDouble();
		while (raduis <= 0) {
			System.out.println("输入错误！请重新输入半径：");
			this.raduis = input.nextDouble();
		}
		setCircleArea_S(raduis);
		setCirclePerimeter(raduis);
	}

}
