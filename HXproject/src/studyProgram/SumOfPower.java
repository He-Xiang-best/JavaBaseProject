package studyProgram;

import java.util.Scanner;

public class SumOfPower {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("��������Ҫ����ɴη��͵��������ӵ����һ�����Ǹ�����");
		input = new Scanner(System.in);
		long x = input.nextLong();
		double num=0, sum=0;
		for (int i = 1; i <=x ; i++) {
				num = Math.pow(i, i);
				sum += num;
			}
		if(sum<=Long.MAX_VALUE)
		System.out.println( "����Ĺ��ɴη���Ϊ�� " + (long)sum);
		else
			System.out.println("����Ĺ��ɴη���Ϊ�� " + sum);
		}
	}


