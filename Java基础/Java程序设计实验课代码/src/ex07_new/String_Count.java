package ex07_new;

import java.util.Scanner;

/**
 * ����򵥵����鷽��ʵ�֣�
 * @content:�û�ͨ������ָ��һ���ַ�����Ȼ���ɳ�����ͳ�Ʋ�����ڸ��ַ�����ÿ���ַ����ֵĴ���
 * @author:04191315_���� 
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������12:05:33 
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��3������13:42:08
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�����BUG
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
   /*
      s--------- | N | N | n | _ _ _ | n | h | o |
  symbolNum[i] =   0   0   0   0 0 0   0   0   0
                    4   -1  -1  3 -1 -1 -1  1   1
    */
	public static void find2(String s) {
		for (int i = 0; i < s.length(); i++) {
//�����Ѿ�������ַ��ѱ���¼����-1��¼������ѭ������¼���ַ�ʱ��ֱ�����������Ӹ�Ч
			if(symbolNum[i]<0) continue; 

			//��ȡ�������ַ�����һ�����Ƿ��ظ����֣����־ͼ�¼
			for (int j = 0; j < s.length(); j++) {
				if(i==j) symbolNum[i]++; //���ڳ�ʼ��Ĭ��Ϊ0������ʱҪ+1
if (String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))&& i != j) {
					symbolNum[i]++;
//��¼�Ѿ�������ַ��� 
					symbolNum[j] = -1;
				}
			}
		}
	}

	public static void print(String s) {
		System.out.println("������ַ�������ĸͳ�Ƹ������£�");
		for (int i = 0; i < s.length(); i++) {
// ֱ�Ӵ�ӡ���ɣ�
			if (symbolNum[i] > 0) {
				System.out.println("��" + s.charAt(i) + "��" + "�ĸ����ǣ�" + symbolNum[i]);
			}
		}
	}
}

