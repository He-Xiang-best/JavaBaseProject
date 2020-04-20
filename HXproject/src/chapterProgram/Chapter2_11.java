package chapterProgram;

import java.util.Scanner;
/**
 * 
 * @content:计算1的1次方+2的2次方+······n的n次方的和
 * @author:何翔
 * @time:2020年2月20日下午11:26:47
 */
public class Chapter2_11 {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("请输入你要求规律次方和的数（即加到最后一个的那个数）");
		input = new Scanner(System.in);
		long x = input.nextLong();
		double num=0, sum=0;
		for (int i = 1; i <=x ; i++) {
				num = Math.pow(i, i);
				sum += num;
			}
		if(sum<=Long.MAX_VALUE)
		System.out.println( "所求的规律次方和为： " + (long)sum);
		else
			System.out.println("所求的规律次方和为： " + sum);
		}
	}


