package chapterProgram;

import java.util.Scanner;

/**
 * 
 * @content:���ֽ��Ƶ����
 * @author:����
 * @time:2020��2��15������5:39:44
 */

public class  Chapter2_3{
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("������һ������ʮ���ƣ�");
		input = new Scanner(System.in);
		int num = 0;
		num = input.nextInt();
		System.out.println(num + "�Ķ�������Ϊ�� " + Integer.toBinaryString(num));
		System.out.println(num + "�Ķ����Ʋ���Ϊ��" + Integer.toBinaryString(~num));
		System.out.println("-" + num + "�Ķ�������Ϊ�� " + Integer.toBinaryString(-num));
		System.out.println(num + "�İ˽�����Ϊ�� " + Integer.toOctalString(num));
		System.out.println(num + "��ʮ��������Ϊ��" + Integer.toHexString(num));
	   		 
	}

}
