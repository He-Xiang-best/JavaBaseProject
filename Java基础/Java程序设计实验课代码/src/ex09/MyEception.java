package ex09;

import java.util.Scanner;
/**
 * @content:��д����MyExcep.java�����Զ����쳣����������ֵΪ13��4ʱ�׳����쳣
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������3:04:53
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������3:04:53
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class MyEception {

	private static Scanner input;

	public static void main(String[] args) throws Num {
		input = new Scanner(System.in);
        System.out.println("������һ�����֣������13��4�����׳��쳣��");
        double num = input.nextDouble();
        if(num==13||num==4) {
       	   throw new Num(num);
        }
        else
        	System.out.println("���������Ϊ: "+num+" != 13 or 4  ,  ���쳣�׳���");
	}

}

//�Զ����쳣�׳���
    class Num extends Exception{
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	      public Num(double num) {
	    	  super("\n��ǰ����ֵΪ"+(int)num+" , �Ѱ�Ҫ���׳��쳣��");
	      }
}