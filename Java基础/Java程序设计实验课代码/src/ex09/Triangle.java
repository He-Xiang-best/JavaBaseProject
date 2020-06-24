package ex09;

import java.util.Scanner;
/**
 * @content:
�Զ���һ����������Triangle.java�����У�
1����Աx,y,z��Ϊ�����ε����߳���
2�����췽��ͨ�������ֱ��x,y,z��ֵ��
3����������getArea���������ʾ��������ϢshowInfo��
      �����������е������߲��ܹ���������Ҫ�׳��Զ����쳣NotTriangleException��������ʾ��ȷ��Ϣ��

 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������2:03:21
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������2:03:21
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Triangle{
private double x,y,z;
   /*
    * ���췽��ʵ�ֳ�ʼ��
    */
   public Triangle() throws NotTriangleException{
	   Scanner input = new Scanner(System.in);
	   System.out.println("��ֱ����������ε������߳���");
	   try {
		   //������Ȼϵͳ�����쳣�����Լ�Ҳ��ӡһ��
		   this.x = input.nextDouble();
		   this.y = input.nextDouble();
		   this.z = input.nextDouble();
	} catch (Exception e) {
		System.err.println("���������������");
		e.printStackTrace();
	}
       showInfo();
       input.close();
   }
   
   public double getArea() {
	   double p =(float) (x+y+z)/2;
		return Math.sqrt(x*(p-x)*(p-y)*(p-z));   
   }
   
   public void showInfo() throws NotTriangleException {
	   if(x<=0||y<=0||z<=0||x+y<=z||x+z<=y||y+z<=x)
		   //������׳��쳣
	       throw new NotTriangleException();
	   else
		   //��ʾ��������Ϣ
		   System.out.println("����������߳�����Ϊ�� "+x+"   ,   "+y+"   ,   "+z);
   }
}
/*
 * �������߲��ܹ���������Ҫ�׳��Զ����쳣NotTriangleException
 */
   class NotTriangleException extends Exception{
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	public NotTriangleException() {
		super("\n����������߲��߱����������ε�������");
	}
}
   


