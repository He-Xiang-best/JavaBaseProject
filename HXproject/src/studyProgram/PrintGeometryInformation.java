package studyProgram;

import java.util.Scanner;
/**
 * 
 * @content:打印矩形和圆的相关信息
 * @author:04191315何翔
 * @time:2020年2月28日上午11:50:11
 */
public class PrintGeometryInformation {
	static Scanner input = new Scanner(System.in);
	final static double pi = 3.14;

	public static void main(String[] args) {
		double l = getRectangleLong();
		double w = getRectangleWide();
		double r = getterCircleRadius();
		double rect_S = getterRectangleArea_S(l, w);
		double rect_C = getterRectanglePerimeter(l, w);
		double circle_S = getterCircleArea_S(r);
		double circle_C = getterCirclelePerimeter(r);
		testShape(rect_S, rect_C, circle_C, circle_S);
	}

	private static void testShape(double rect_S, double rect_C, double circle_C, double circle_S) {
		System.out.println("\n根据以上信息可得：\n");
		System.out.println("矩形的周长为：" + rect_C + "\t" + "矩形的面积为：" + rect_S + "\n");
		System.out.print("圆的周长为：" + (float) circle_C + "\t" + "圆的面积为：" + (float) circle_S + "\n");
	}

	private static double getterCirclelePerimeter(double circleRadius) {
		double circle_C = 2 * pi * circleRadius;
		return circle_C;
	}

	private static double getterCircleArea_S(double circleRadius) {
		double circle_S = pi * circleRadius * circleRadius;
		return circle_S;
	}

	private static double getterRectanglePerimeter(double rectLong, double rectWide) {
		double rectanglePerimeter = 2 * (rectLong + rectWide);
		return rectanglePerimeter;
	}

	private static double getterRectangleArea_S(double rectLong, double rectWide) {
		double rect_S = rectLong * rectWide;
		return rect_S;
	}

	private static double getterCircleRadius() {
		System.out.println("\n请自定义圆的半径：");
		double circleRadius = input.nextDouble();
		while (circleRadius <= 0) {
			System.out.println("信息 输入错误！请重新输入！");
			circleRadius = input.nextDouble();
		}
		System.out.println("您定义的圆的半径为：" + circleRadius);
		return circleRadius;
	}

	private static double getRectangleWide() {
		System.out.println("请自定义矩形的宽：");
		double rectWide = input.nextDouble();
		while (rectWide <= 0) {
			System.out.println("信息 输入错误！请重新输入！");
			rectWide = input.nextDouble();
		}
		System.out.println("您定义的宽为：" + rectWide);
		return rectWide;
	}

	private static double getRectangleLong() {
		System.out.println("请自定义矩形的长：");
		double rectLong = input.nextDouble();
		while (rectLong <= 0) {
			System.out.println("信息 输入错误！请重新输入！");
			rectLong = input.nextDouble();
		}
		System.out.println("您定义的长为：" + rectLong);
		return rectLong;
	}
}
