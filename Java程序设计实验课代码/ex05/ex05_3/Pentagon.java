package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:����һ�����������ʵ��Shape�ӿ�,��������ܳ�������ļ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:01:56
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:01:56
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Pentagon implements Shape {
	public static Scanner input;
	//����������͵ı߳���
    private double a;
/*
 * ͨ�����췽����ʼ����Ա����:
*/    
	public Pentagon() {
		input = new Scanner(System.in);
		System.out.println("������������εı߳���");
		this.a = input.nextDouble();
		//�жϱ߳��ĺ�����
		while(this.a<0) {
			System.out.print("�߳�����������������룺");
			this.a = input.nextDouble();
		}
	}

	@Override
	public double calculateP() {
		return 5 * a;
	}

	@Override
	public double calculateA() {
		return (5 * a * a * Math.tan(Math.toRadians(54))) / 4;
	}

	@Override
	public void outPut() {
		System.out.println("��������ε��ܳ�Ϊ��" + (float)calculateP() + 
		           "\t���Ϊ��" + (float)calculateA());	
		
	}
}
