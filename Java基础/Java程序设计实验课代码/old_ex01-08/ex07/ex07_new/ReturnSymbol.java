package ex07_new;

import java.util.Scanner;

/**
 * 
 * @content:��дͨ�÷���countlets()��
 * �����Բ�����ʽ���ݵ��ַ����е���ĸ�������صļ�����Ӧ�ò��������֡��ո񡢱����źͻ��з��ȡ�
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������3:43:58
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������3:43:58
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class ReturnSymbol {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����ĸ�����ֵ��ַ�����ϵͳ����Ϊ��������ĸ��������ݽ��");
		String str = input.nextLine();
	System.out.println("������ĸ�Ľ��Ϊ��"+ countlets(str));
	input.close();
}
	public static String countlets(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLetter(charArray[i])) {
				str2.append(charArray[i]);
			}
		}
		return (str2.toString());
	}
}
