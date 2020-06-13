package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:�û�ͨ������ָ��һ���ַ�����Ȼ���ɳ�����ͳ�Ʋ�����ڸ��ַ�����ÿ���ַ����ֵĴ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������12:05:33
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������12:05:33
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class String_Count {
	static int[] symbolNum = new int[26];//���ڸ����Ĵ洢��������ͳ�ƽ��
	static char[] symbol = new char[26];//�洢��ĸ�������ƥ���Ӧ
/*
 * ��Ȼ����ķ�������򵥵ģ�����˼·:
 * (1)ֱ����һ������symbolNum����ҪѰ�ҵ�ƥ����ĸ����ͨ��ǿ��ת��ʵ��(�Թ������)
 * (2)����ʹ��map�ȼ��Ϸ�����ͨ����-ֵƥ��ķ�ʽƥ����ĸ�������
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������һ���ַ���");
		String s = input.next();
		// ��������ַ���ת��Ϊ�ַ����飬�������ͳ��ʱʹ�ã��򵥷�����
		char[] charArray = s.toCharArray();
		��Ӧ��ĸ����();
		find(charArray);//��������Щ��ĸ���ֹ�
		print();//��ӡ��Ϣ
       input.close();
	}

	public static void ��Ӧ��ĸ����() {
		int i = 0;
		for (char ch = 'a'; ch <= 'z' && ch >= 'a' && i < symbol.length; ch++, i++) {
			symbol[i] = ch;
		}
	}

	public static void find(char[] array) {
		for (int i = 0; i < array.length; i++) {
			//����������ַ����У�ÿ���ַ�����Ѱ���Ƿ���֣������֣���ͳ��������
			for (char ch = 'a'; ch <= 'z' && ch >= 'a'; ch++) {
				if (array[i] == ch) {
					//����ĸת��Ϊ���ݴ洢
					symbolNum[(int) ch - 97]++;
				}
			}
		}
	}

	public static void print() {
		System.out.println("������ַ�������ĸͳ�Ƹ������£�");
		for (int i = 0; i < symbolNum.length; i++) {
			if (symbolNum[i] > 0) {
				System.out.println("��ĸ" + symbol[i] + "�ĸ����ǣ�" + symbolNum[i]);
			}
		}

	}

}
