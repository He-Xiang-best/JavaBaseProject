package ex05_3;

import java.util.Scanner;
/**
 * 
 * @content:����һ����������ʵ��Shape�ӿ�,��������ܳ�������ļ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������11:59:28
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������11:59:28
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Square implements Shape {
	public static Scanner input;
	//���������εı߳�
    private double x;
    /*
          * ͨ�����췽����ʼ����Ա����:
     */
    public Square() {
    	input = new Scanner(System.in);
    	System.out.println("�����������εı߳���");
		this.x = input.nextDouble();
		//�жϱ߳��ĺ�����
		while(this.x<0) {
			System.out.print("�߳�����������������룺");
			this.x = input.nextDouble();
		}
	}
	/*
	  *ʵ�ֽӿڵķ�����
	 */
	@Override
	public double calculateP() {
		return 4*x;
	}
	
	@Override
	public double calculateA() {
		return x*x;
	}
	@Override
	public void outPut() {
		System.out.println("�������ε��ܳ�Ϊ��" + (float)calculateP() + 
		           "\t���Ϊ��" + (float)calculateA());
	}



}
