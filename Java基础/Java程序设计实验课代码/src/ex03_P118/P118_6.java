package ex03_P118;

import java.util.Scanner;
/**
 * @content:����һ���������ڿ���̨�зֱ������������Ĳ�����ʽ�Ķ����������˽�������ʮ��������
 * @author:04191315����
 * @time:2020��4��29������12:28:38
 */

public class  P118_6{

	public static void main(String[] args) {
		System.out.println("������һ��������ʮ���ƣ�");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//����ֱ��ͨ����װ��Integer�ķ���ʵ�֣���ȻҲ���������涨���ʾ
		System.out.println(num + "�Ķ�������Ϊ�� " + Integer.toBinaryString(num));
		System.out.println(num + "�Ķ����Ʋ���Ϊ��" + Integer.toBinaryString(~num));
		System.out.println(num + "�İ˽���������Ϊ�� " + Integer.toOctalString(~num));
		System.out.println(num + "��ʮ������������Ϊ��" + Integer.toHexString(~num));
	   	input.close();	 
	}

}
