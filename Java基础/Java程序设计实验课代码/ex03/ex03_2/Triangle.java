package ex03_2;

import java.util.Scanner;

/**
 * @content:在程序中增加一个三角形类（triangle）定义三条边，求出三角形的面积与周长。
 * @author:04191315何翔
 * 第一次修改时间为：
 * @time:2020年5月6日上午10:36:22
 * 修改原因：课堂测验，修改内容：增加三角形类。
 * 第一次完成时间为:
 * @time:2020年5月6日上午11:08:22
 */
public class Triangle {
	//定义三角形的三条边长，及面积和属性：
     private double x , y ,z;
     private double trianglePerimeter;
 	 private double triangleArea_S;
	private Scanner input;
	
	public void setTrianglePerimeter(double x, double y,double z) {
		this.trianglePerimeter = (x+y+z);
	}

	public void setTriangleArea_S(double x, double y,double z) {
		final double p = (x+y+z)/2;
		this.triangleArea_S = Math.sqrt(p*(p-x)*(p-y)*(p-z));
	}
	//设计getter方法能求出三角形的面积（area_S）和周长(perimeter)
	public double getTrianglePerimeter() {
		return trianglePerimeter;
	}

	public double getTriangleArea_S() {
		return triangleArea_S;
	}
	
    //在构造方法里对其进行初始化；
	public Triangle() {
		input = new Scanner(System.in);
		System.out.print("\n请分别输入三角形的三条边长：\t");
		this.x = input.nextDouble();
		this.y = input.nextDouble();
		this.z = input.nextDouble();
		while (x+y <= z || x+z <= y ||z+y <= x ) {
			System.out.println("三角形的三条边长输入错误！不满足两边之和大于第三边！请重新输入三条边长：");
			this.x = input.nextDouble();
			this.y = input.nextDouble();
			this.z = input.nextDouble();
		}
		setTrianglePerimeter( x, y, z);
		setTriangleArea_S(x,  y, z);
	}
 	 

}
