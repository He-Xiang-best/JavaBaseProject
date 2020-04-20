package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:找出1-500内含和不含数字4的自然数个数
 * @author:何翔
 * @time:2020年2月26日下午8:30:23
 */
public class FindNo4Numbers {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请输入一个数字，将帮您找出这个数字内的正偶数及个数");
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
		System.out.println("1-500内含数字4的自然数个数为：     " + count);
		System.out.println("1-500内不含数字4的自然数个数为： " + (500-count));
	}
}
