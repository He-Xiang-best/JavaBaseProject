package ex02;

import java.util.Scanner;
/**
 * @content:用一个for循环找出n以内的偶数
 * @author:04191315何翔
 * @time:2020年4月21日下午3:20:03
 */
public class EvenNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字n，将帮您查询0 ~ n内的偶数及个数");
		int n = input.nextInt();
		int count = 0,j = 0;
		System.out.println("0~"+n+"以内的偶数有：     ");
		for (int i = 0; i < n; i++) {
			if (j++ % 10 == 0)
				System.out.println();
			if (i % 2 == 0) {
				System.out.print(i + "\t");
				count++;
			}
		}
		System.out.println("\n");
		System.out.println(n+"以内的偶数个数为：     " + count);
		System.out.println(n+"以内的奇数个数为： " + (n - count));
		input.close();
	}
}
