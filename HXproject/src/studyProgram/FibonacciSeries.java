package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:��ӡһ��쳲���������
 * @author:����
 * @time:2020��2��21������12:10:52
 */

public class FibonacciSeries {

	private static Scanner input;

	public static void main(String[] args) {
        input = new Scanner(System.in);
		System.out.println("��Ҫ�鿴ǰ����쳲��������У������룺");
        int num = input.nextInt();
        while(num<=0) {
        	System.err.println("������������������");
        	 num = input.nextInt();
        }
		int[] nums = new int[num];
		nums[0] = 0;
		nums[1] = 1;
		long sum = 0;
		for (int i = 2; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];	
		}
		System.out.println("ǰ"+ num + "���쳲��������еĴ�ӡ������£�");
	    for (int i = 0; i < nums.length; i++) {
			if(i%5==0)
				System.out.println();
			sum += nums[i];
	    	System.out.print(nums[i] + "\t");
		}
	    System.out.println("\n\nǰ"+ num + "���쳲��������еĺ�Ϊ�� " + sum);
		System.out.println("\n����������鿴�ڼ���쳲��������е�ֵ�أ������룺");
		int item = input.nextInt();
		int[]array = new int[item];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];	
		}
		System.out.println("��" + item + "��쳲�����������ֵΪ��" + array[item-1]);
	}

}
