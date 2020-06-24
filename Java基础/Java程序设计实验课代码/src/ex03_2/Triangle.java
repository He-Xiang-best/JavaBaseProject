package ex03_2;

import java.util.Scanner;

/**
 * @content:�ڳ���������һ���������ࣨtriangle�����������ߣ���������ε�������ܳ���
 * @author:04191315����
 * ��һ���޸�ʱ��Ϊ��
 * @time:2020��5��6������10:36:22
 * �޸�ԭ�򣺿��ò��飬�޸����ݣ������������ࡣ
 * ��һ�����ʱ��Ϊ:
 * @time:2020��5��6������11:08:22
 */
public class Triangle {
	//���������ε������߳�������������ԣ�
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
	//���getter��������������ε������area_S�����ܳ�(perimeter)
	public double getTrianglePerimeter() {
		return trianglePerimeter;
	}

	public double getTriangleArea_S() {
		return triangleArea_S;
	}
	
    //�ڹ��췽���������г�ʼ����
	public Triangle() {
		input = new Scanner(System.in);
		System.out.print("\n��ֱ����������ε������߳���\t");
		this.x = input.nextDouble();
		this.y = input.nextDouble();
		this.z = input.nextDouble();
		while (x+y <= z || x+z <= y ||z+y <= x ) {
			System.out.println("�����ε������߳�������󣡲���������֮�ʹ��ڵ����ߣ����������������߳���");
			this.x = input.nextDouble();
			this.y = input.nextDouble();
			this.z = input.nextDouble();
		}
		setTrianglePerimeter( x, y, z);
		setTriangleArea_S(x,  y, z);
	}
 	 

}
