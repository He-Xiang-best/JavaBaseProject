package ex03_2;

import java.util.Scanner;
/**
 * @content:
      ��дһ�������ࣨRect)
 * @author:04191315����
 * @time:2020��4��28������11:51:40
 */
public class Rect {
	private Scanner input;
	//�ھ������ж��峤�����ܳ�������ĸ������
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
	//���getter������������ε������area_S�����ܳ�(perimeter)
	public double getRectPerimeter() {
		return rectPerimeter;
	}

	public double getRectArea_S() {
		return rectArea_S;
	}
	
    //�ڹ��췽���������г�ʼ����
	public Rect() {
		input = new Scanner(System.in);
		System.out.print("��ֱ�������εĳ��Ϳ�\t");
		this.rectLong = input.nextDouble();
		this.rectWize = input.nextDouble();
		while (rectWize <= 0 || rectLong <= 0) {
			System.out.println("����������������볤�Ϳ�");
			this.rectLong = input.nextDouble();
			this.rectWize = input.nextDouble();
		}
		setRectArea_S(rectLong, rectWize);
		setRectPerimeter(rectLong, rectWize);
	}

}