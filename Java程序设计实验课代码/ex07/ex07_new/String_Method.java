package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:��дһ��Ӧ�ó���String_Method.java��ʵ�����¹���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������3:22:23
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������3:22:23
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class String_Method {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("��Ŀ1.");
		firstest();
		System.out.println("=====================================================");
		System.out.println("\n��Ŀ2.");
		secondTest();
		System.out.println("\n=====================================================");
		System.out.println("\n��Ŀ3.");
		thirdTest();
	}

	/*
	 * ��һ�������ж�һ�����֤�����Ƿ���ĳ��ʡ���֤������Ҫ�󴫵�������������һ�����������֤��
	 * �ڶ�������Ϊ�жϵ�ǰ׺���������Ƕ�Ӧ��ʡ�ݡ��������Ϊ����ֵ������ɹ�������ʧ�ܡ�����ʾ���ж�ǰ׺��44������
	 * ��Ȼ��������ʶ����������ȷ�����Ѿ��н⣬�˴�Ϊʵ����ĿҪ���д
	 */
	public static void firstest() {

		System.out.println("�����������������֤�ţ�������ʡ���Լ���ʡ�ݵ����֤ǰ׺");
		String id = input.next();
		String province = input.next();
		String head = input.next();
		if (judge(id, head, province))
			System.out.println("�������֤��" + province + "ʡ�ݵ�");
		else
			System.out.println("�������֤����" + province + "ʡ�ݵ�");

	}

	public static boolean judge(String id, String head, String province) {
		if (id.subSequence(0, 2).equals(head))
			return true;
		else
			return false;
	}

	/*
	 * дһ������������һ���ַ����е�һ���ַ�ȫ���滻Ϊ��һ���ַ������������
	 *  �����ַ���Ϊ��AB-C-ABC�����á�First���滻���е�A��
	 */
	public static void secondTest() {
		System.out.println("������һ���ַ�����");
		String str = input.next();
		System.out.println("��ʼ���ַ���Ϊ��" + str);
		// ת��Ϊ�ַ�����֣�û�зָ���������
		/*
		 * ����зָ���Ļ������Բ���String.split()�����򻯣���������ձ�ͨ�ⷽ��
		 * ���µķ���Ϊ�Զ�����ķ���������ȫ��
		 */
		char[] charArray = str.toCharArray();
		// ���ַ�����ת��Ϊ�ַ�������
		String[] str2 = new String[charArray.length];
		for (int i = 0; i < str2.length; i++) {
			str2[i] = String.valueOf(charArray[i]);
			// д��2��str2[i] = Character.toString(charArray[i]);
		}
// ע�⣺�˴������ ���ַ������������ַ����Ļ�������ʹ��String.subSequence().equals()�ķ�����ȡ����ʵ��
		System.out.println("����Ҫ���滻�����ַ����е��Ǹ����ַ�����");
		String replaced = input.next();
		System.out.println("�����滻�ɵ��ַ����ַ�����ʲô��");
		String replaceSymbol = input.next();
		//�滻
		for (int i = 0; i < str2.length; i++) {
			if (str2[i].equals(replaced)) {
				str2[i] = replaceSymbol;
			}
		}

		System.out.println("�滻����ַ������£�");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
	}
	
	/*
	 * дһ�������������ַ��������ַ������ǰ3��Ԫ�ش�����һ�����ַ����������
	 */
	public static void thirdTest() {
		System.out.println("������һ���ַ���������ȡǰ�����ַ����");
		System.out.println(input.next().subSequence(0, 3));
	}
}