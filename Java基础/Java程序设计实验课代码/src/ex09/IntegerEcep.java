package ex09;

import java.util.Scanner;
/**
 * @content:
 * ��дһ������IntegerExcep.java��������������һ���ַ����������ַ���ת��Ϊdouble�����ݣ�
 * �����ݲ��ڡ�0,100��֮��ʱ�׳�һ���쳣�������ʵ��Ļ��������񲢴����쳣��
 * �������ֳɵ��쳣Ҳ�����Զ����쳣��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������9:53:49
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������9:53:49
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class IntegerEcep {

	private static Scanner input;
	public static void main(String[] args) throws Exception {
		input = new Scanner(System.in);
		System.out.println("������һ���ַ��������ж��Ƿ���ת���ɡ�0~100��֮�������");
		String str = input.nextLine();
		judge(input(str));
	}

	public static double input(String str) {
		try {
		 double a = Double.parseDouble(str);
			return a;
		} catch (NumberFormatException e) {
			System.err.println("��������з�double�����ַ�����");
			e.printStackTrace();
		}
		return -1;		
	}
	
	public static void judge(double a) throws Exception {
		if(!(a>=0 && a<=100))
		{
    	throw new Exception("\n������ַ���ת���ɵ����ݲ��١�0~100��֮��");
		}
	else
		System.out.println("���ַ���ת��Ϊdouble���͵�����Ϊ��"+a);		
	}
}


