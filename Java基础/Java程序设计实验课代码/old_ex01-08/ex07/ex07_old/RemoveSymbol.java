package ex07_new;

import java.util.Scanner;

/**
 * 
 * @content:
 * һ���Իس��������ַ���������20���ַ�����
 * ���ַ����е����������ַ�����0��-��9����ת��Ϊ������ȥ�������ַ���
 * �����ַ�����3A56BC��ת��Ϊ�������ǡ�356��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������3:23:37
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������3:23:37
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class RemoveSymbol {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("������һ����ĸ�����ֵ��ַ�����ϵͳ��Ϊ��ɾ��������ĸ��������ݽ��");
	String str = input.next();
	System.out.println("ȥ����ĸ��Ľ��Ϊ��"+ move(str));
	input.close();
}
	public static int move(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i])) {
				str2.append(charArray[i]);
			}
		}
		return Integer.parseInt(str2.toString());
	}
	
}
