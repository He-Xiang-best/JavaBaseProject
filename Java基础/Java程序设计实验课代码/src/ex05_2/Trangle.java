package ex05_2;

import java.util.Scanner;
/**
 * 
 * @content:�����������࣬�������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��20������11:15:55
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��20������11:15:55
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Trangle extends Shape{
	public static Scanner input;
	//���������ε������߳����ݲ�ʹ��getter��setter����
	private double a;
	private double b;
	private double c;
/*
 * ͨ�����췽����ʼ����Ա����:
 */
	public Trangle() {
		input = new Scanner(System.in);
		System.out.println("��ֱ����������ε������߳���");
		this.a = input.nextDouble();
		this.b = input.nextDouble();
		this.c = input.nextDouble();
		//�ж�ע���ܷ���ͼ�Σ����������������һ�߾��޷�����
		while(a+b<=c||a+c<=b||b+c<=a||a<=0||b<=0||c<=0) {
			System.out.println("����ı߳��޷����������Σ����������������߳���");
			this.a = input.nextDouble();
			this.b = input.nextDouble();
			this.c = input.nextDouble();
		}
	}
	@Override
	public void draw() {
		double p = (float) (a + b + c) / 2;
		System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));

		
	}

}
