package studyProgram;

import java.util.Scanner;

public class SumOfPower {
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


