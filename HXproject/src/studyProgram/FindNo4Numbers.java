package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:�ҳ�1-500�ں��Ͳ�������4����Ȼ������
 * @author:����
 * @time:2020��2��26������8:30:23
 */
public class FindNo4Numbers {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("������һ�����֣��������ҳ���������ڵ���ż��������");
		int n = input.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int one = i % 10;
			int two = i / 10 % 10;
			int three = i / 100 % 10;
			if(i%10==0)
				System.out.println();
			if(one==4||two==4||three==4)
			{	count++;
				System.out.print(i + "\t");
				}
			
		}
		System.out.println();
		System.out.println("1-500�ں�����4����Ȼ������Ϊ��     " + count);
		System.out.println("1-500�ڲ�������4����Ȼ������Ϊ�� " + (500-count));
	}
}
