package ex07_new;

import java.util.Scanner;

/**
 * ����򵥵����鷽��ʵ�֣�
 * @content:�û�ͨ������ָ��һ���ַ�����Ȼ���ɳ�����ͳ�Ʋ�����ڸ��ַ�����ÿ���ַ����ֵĴ���
 * @author:04191315_���� 
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������12:05:33 
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��29������2:20:08
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�������ǰ��©��
 */
public class String_Count {
	static int[] symbolNum;// ���ڸ����Ĵ洢��������ͳ�ƽ��

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������һ���ַ���");
		String s = input.nextLine();
		symbolNum = new int[s.length()];
		find2(s);// ��������Щ��ĸ���ֹ�
		print(s);// ��ӡ��Ϣ
		input.close();
	}

	public static void find2(String s) {
		for (int i = 0; i < s.length(); i++) {
			//��ȡ�������ַ�����һ�����Ƿ��ظ����֣����־ͼ�¼
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					symbolNum[i]++;
					//ע������Ļ�ѳ��ֹ����ַ������ظ�ͳ�ƣ�ֻҪ�������ʱ���޳�����
				}
			}
		}
	}

	public static void print(String s) {
		System.out.println("������ַ�������ĸͳ�Ƹ������£�");
		for (int i = 0; i < s.length(); i++) {
			if (symbolNum[i] > 0) {
				System.out.println("��" + s.charAt(i) + "��" + "�ĸ����ǣ�" + symbolNum[i]);
				//�������ӡ�����ַ�������޳������ظ���ӡ�ļ���
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						symbolNum[j] = 0;
					}
				}
			}
		}
	}
}
