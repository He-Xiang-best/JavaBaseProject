package studyProgram;

import java.util.Scanner;
/**
 * 
 * @content:��ӡ���κ�Բ�������Ϣ
 * @author:04191315����
 * @time:2020��2��28������11:50:11
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
		System.out.println("\n����������Ϣ�ɵã�\n");
		System.out.println("���ε��ܳ�Ϊ��" + rect_C + "\t" + "���ε����Ϊ��" + rect_S + "\n");
		System.out.print("Բ���ܳ�Ϊ��" + (float) circle_C + "\t" + "Բ�����Ϊ��" + (float) circle_S + "\n");
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
		System.out.println("\n���Զ���Բ�İ뾶��");
		double circleRadius = input.nextDouble();
		while (circleRadius <= 0) {
			System.out.println("��Ϣ ����������������룡");
			circleRadius = input.nextDouble();
		}
		System.out.println("�������Բ�İ뾶Ϊ��" + circleRadius);
		return circleRadius;
	}

	private static double getRectangleWide() {
		System.out.println("���Զ�����εĿ�");
		double rectWide = input.nextDouble();
		while (rectWide <= 0) {
			System.out.println("��Ϣ ����������������룡");
			rectWide = input.nextDouble();
		}
		System.out.println("������Ŀ�Ϊ��" + rectWide);
		return rectWide;
	}

	private static double getRectangleLong() {
		System.out.println("���Զ�����εĳ���");
		double rectLong = input.nextDouble();
		while (rectLong <= 0) {
			System.out.println("��Ϣ ����������������룡");
			rectLong = input.nextDouble();
		}
		System.out.println("������ĳ�Ϊ��" + rectLong);
		return rectLong;
	}
}
