package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:����һ��Բ����ʵ��Shape�ӿ�,��������ܳ�������ļ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:19:23
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:19:23
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Circle implements Shape {
	public static Scanner input;
	//���峣�����Լ��뾶
	private final double pi = 3.14;
	private double radius;
	/*
          * ͨ�����췽����ʼ����Ա����:
     */    
	public Circle() {
		input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		this.radius = input.nextDouble();
		//�жϱ߳��ĺ�����
				while(this.radius<0) {
					System.out.print("�߳�����������������룺");
					this.radius = input.nextDouble();
	}
}
	/*
	  *ʵ�ֽӿڵķ�����
	 */
	@Override
	public double calculateA() {
		return pi * radius * radius;
	}

	@Override
	public double calculateP() {
		return 2 * pi * radius;
	}

	@Override
	public void outPut() {
		System.out.println("��Բ�ε��ܳ�Ϊ��" + (float)calculateP() + 
		           "\t���Ϊ��" + (float)calculateA());
	}


}
