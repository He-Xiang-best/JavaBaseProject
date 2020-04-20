package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:打印一串斐波那契数列
 * @author:何翔
 * @time:2020年2月21日上午12:10:52
 */

public class FibonacciSeries {

	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
		System.out.println("您要查看前几项斐波那契数列？请输入：");
        int num = input.nextInt();
        while(num<=0) {
        	System.err.println("请输入大于零的整数！");
        	 num = input.nextInt();
        }
		int[] nums = new int[num];
		nums[0] = 0;
		nums[1] = 1;
		long sum = 0;
		for (int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];	
		}
		System.out.println("前"+ num + "项的斐波那契数列的打印结果如下：");
	    for (int i = 0; i < nums.length; i++) {
			if(i%5==0)
				System.out.println();
			sum += nums[i];
	    	System.out.print(nums[i] + "\t");
		}
	    System.out.println("\n\n前"+ num + "项的斐波那契数列的和为： " + sum);
		System.out.println("\n辅助：您想查看第几项斐波那契数列的值呢？请输入：");
		int item = input.nextInt();
		int[]array = new int[item];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];	
		}
		System.out.println("第" + item + "项斐波那契数的数值为：" + array[item-1]);
	}

}
