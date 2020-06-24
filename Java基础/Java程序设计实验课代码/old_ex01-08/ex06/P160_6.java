package ex06;

import java.util.Arrays;
/**
 * 
 * @content:�������10����ͬ��26��Ӣ����ĸ������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��21������5:18:45
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��21������5:18:45
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P160_6 {
	static int num;

	public static void main(String[] args) {
		generate();
	}

	public static void sortAndPut(char[] symbol) {
		// ��������ɵ�10���ַ���С��������
		Arrays.sort(symbol);
		// ��ӡ���������������ɵ��ַ�
		for (int i = 0; i < symbol.length; i++) {
			System.out.print(symbol[i] + "  ");
		}
	}

	public static void generate() {
		// ����һ�������������������ɵ��ַ�
		char[] symbol = new char[10];
		// �������10��a~z���ַ�
		for (int i = 0; i < symbol.length; i++) {
			num = i;
			// д��1��symbol[i]=(char)(int)(Math.random()*26+97);
			symbol[i] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
			// ʹ�÷����ж��Ƿ����ɵ��ַ��Ǹ�����ͬ��
			boolean p = true;
			while (p) {
				p = judge(symbol);
			}
		}sortAndPut(symbol);
	}

	public static boolean judge(char[] symbol) {
		for (int j = 0; j < num; j++) {
			// �ж������ɵ��ַ��Ƿ���֮ǰ���ɵ��ַ����ظ�������У�����������
			if (symbol[num] == symbol[j]) {
				symbol[num] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
				return true;
			}
		}
		return false;

	}
}
