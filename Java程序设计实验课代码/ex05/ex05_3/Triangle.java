package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:����һ����������ʵ��Shape�ӿ�,��������ܳ�������ļ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������11:38:20
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������11:38:20
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Triangle implements Shape {
	public static Scanner input;
	//���������ε������߳����ݲ�ʹ��getter��setter����
	private double a;
	private double b;
	private double c;
/*
 * ͨ�����췽����ʼ����Ա����:
 */
	public Triangle() {
		input = new Scanner(System.in);
		System.out.println("��ֱ����������ε������߳���");
		this.a = input.nextDouble();
		this.b = input.nextDouble();
		this.c = input.nextDouble();
		//�ж�ע���ܷ���ͼ�Σ����������������һ�߾��޷�����
		while(a+b<=c||a+c<=b||b+c<=a) {
			System.out.println("����ı߳��޷����������Σ����������������߳���");
			this.a = input.nextDouble();
			this.b = input.nextDouble();
			this.c = input.nextDouble();
		}
	}
	/*
	  *ʵ�ֽӿڵķ�����
	 */
	@Override
	public double calculateA() {
		double p = (float) (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));

	}
	
	@Override
	public double calculateP() {
		return (a + b + c);

	}

	@Override
	public void outPut() {
		System.out.println("�������ε��ܳ�Ϊ��" + (float)calculateP() + 
				           "\t���Ϊ��" + (float)calculateA());
	}
}
