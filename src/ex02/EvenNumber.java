package ex02;

import java.util.Scanner;
/**
 * @content:��һ��forѭ���ҳ�n���ڵ�ż��
 * @author:04191315����
 * @time:2020��4��21������3:20:03
 */
public class EvenNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������n����������ѯ0 ~ n�ڵ�ż��������");
		int n = input.nextInt();
		int count = 0,j = 0;
		System.out.println("0~"+n+"���ڵ�ż���У�     ");
		for (int i = 0; i < n; i++) {
			if (j++ % 10 == 0)
				System.out.println();
			if (i % 2 == 0) {
				System.out.print(i + "\t");
				count++;
			}
		}
		System.out.println("\n");
		System.out.println(n+"���ڵ�ż������Ϊ��     " + count);
		System.out.println(n+"���ڵ���������Ϊ�� " + (n - count));
		input.close();
	}
}
