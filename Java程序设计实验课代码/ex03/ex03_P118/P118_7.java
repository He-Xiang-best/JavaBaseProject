package ex03_P118;

import java.util.Scanner;
/**
 * @content:�α�P118ҳ��7�⣬����һ�����������ж����Ƿ�Ϊ������������жϽ��
 * @author:04191315����
 * @time:2020��4��29������12:16:34
 */
public class P118_7 {
	private static Scanner input;

	public static void main(String[] args) {
		//�������󣬲�ͨ��������÷���ʵ�ֹ���
		P118_7 p = new P118_7();
		//����inputnum����ʵ�����ֵ�¼��
		int getnum = p.inputnum();
		//��¼������ִ���judge�������棬�ж��Ƿ�Ϊ��������������
		if (p.judge(getnum))
			System.out.println(getnum + " ������");
		else
			System.out.println(getnum + " ��������");
	}

	//�жϴ�����������Ƿ�Ϊ����
	public  boolean judge(int num) {
		int i;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		if (num == i)
			return true;
		return false;
	}
   
	//�ӿ���̨�ϻ�ȡһ��������
	public  int inputnum() {
		System.out.println("�����һ�����������ж����Ƿ�Ϊ������");
		input = new Scanner(System.in);
		int num = input.nextInt();
		while (num <= 0) {
			System.out.println("�����������������һ����������");
			num = input.nextInt();
		}
		return num;
	}

}
