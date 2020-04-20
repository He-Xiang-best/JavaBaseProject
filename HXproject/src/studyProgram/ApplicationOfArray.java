package studyProgram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @content:和数组相关的综合应用
 * @author:何翔
 * @time:2020年2月21日上午10:51:53
 */

public class ApplicationOfArray {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请问您想随机生成几个数组？");
		int n = input.nextInt();
		int[] array = new int[n];
		int c = 0;
		System.out.println("随机数组生成如下：");
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random() * 1000)) % 1001;
			if (c++ % 5 == 0)
				System.out.println();
			System.out.print("array[" + i + "]=" + array[i] + "\t");
		}
		int max = 0, min = ((int) (Math.random() * 1000)) % 1001;
		int a = 0, b = 0, count1 = 0, count2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
				a = i;
			}
			if (array[i] <= min) {
				min = array[i];
				b = i;
			}
			// 判断奇数和偶数的个数
			if (array[i] % 2 == 0)
				count2++;
			else
				count1++;
		}
		System.out.println();
		System.out.println("\n以上生成的数组中：");
		// 最值查询
		System.out.println("\n最大值为： " + max + "，是第" + (a + 1) + "个元素，即：" + "array[" + a + "]");
		System.out.println("最小值为： " + min + "，是第" + (b + 1) + "个元素，即：" + "array[" + b + "]");
		// 奇数和偶数的查询
		System.out.println("\n数值为奇数的数组有： " + count1 + "个");
		System.out.println("数值为偶数的数组有： " + count2 + "个");
		// 元素信息自主查询
		System.out.println("\n请问您要查找第几个元素：");
		int num = input.nextInt();
		System.out.println("第 " + num + " 个元素的值为： " + array[num - 1]);
		System.out.println("\n您可以输入一个数值，将帮您查找到其元素的编号");
		//普通查找：
		int x = input.nextInt();
		int d = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				d = i;
				break;
			}
		}
		if (d == -1)
			System.out.println("很抱歉，没有找到该元素的下标！");
		else
			System.out.println("该数值是第" + (d + 1) + "个元素，即：" + "array[" + d + "]");
		System.out.println();
		System.out.println("是否将上述数组从小到大排序？(y/n)");
		char judge = input.next().charAt(0);
		switch (judge) {
		case 'y':
			//冒泡排序法：
			c = 0;
			System.out.println("排序后的数组如下：");
			for (int i = 1; i < array.length; i++) {
				for (int j = 0; j < array.length - i; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			//逆序：正序排好之后进行首尾交换即可；
			/*
			  for (int i = 0;  < array.length / 2; j++) {
						int temp = array[i];
						array[i] = array[array.length -i - 1];
						array[array.length -i - 1] = temp;
					}
					
			 */
			for (int j = 0; j < array.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + array[j] + "\t");
			}
			//二分查找法：
			System.out.println();
			System.out.println("\n您可输入需要查看的数字，查询其编号，并且对其进行删除，请输入：");
			int searchNumber = input.nextInt(); 
			boolean isFind = false;//是否找到
			int low = 0;
			int high = array.length - 1;//上界和下界的坐标
			//不知道查找多少次
			while(high >= low) {
				//计算中点下标
				int mid = (low + high) / 2;//如果key小于中间元素，只需在数组的前一半元素中继续查找
				if(searchNumber < array[mid]) 
					high = mid - 1;
				else if(searchNumber > array[mid]) 
					low = mid + 1;
				else //如果key和中间元素的值相等，则查找成功！
					{System.out.println("该数字是排序后新数组中的第"+(mid+1)+"个元素即：array["+mid+"]");
				    isFind = true;	
			    	//数组元素的删除：
				    System.out.println("\n是否对该数值进行删除？(y/n)");
				    String choose2 = input.next();
				    int count3 = array.length - 1;
				    if("y".equals(choose2)) {
				    	for (int i = mid; i < count3; i++) {
						array[i] = array[i+1];	
						}
				    	System.out.println("删除该数值后的数组排序为：");
				    	c=0;
						for (int j = 0; j < array.length - 1; j++) {
							if (c++ % 5 == 0)
								System.out.println();
							System.out.print("array[" + j + "]=" + array[j] + "\t");
						}
						//数组元素的增加
						System.out.println("\n\n是否需要增加新数值？（y/n）");
						String choose3 = input.next();
						if("y".equals(choose3)) {
							System.out.println("请问您要增加几个新数值？");
							int newcount = input.nextInt();
							int[] newarray = new int[newcount+array.length-1];
							for (int i = 0; i < array.length - 1; i++) {
								newarray[i] = array[i];
							}System.out.println("请输入要增加的数值：");
							for (int i = 0; i < newcount; i++) {
								int addnum = input.nextInt();
								newarray[array.length-1+i] = addnum;		
							}
							System.out.println("新数组排序后如下：");
							Arrays.sort(newarray);
							c=0;
							for (int j = 0; j < newarray.length; j++) {
								if (c++ % 5 == 0)
									System.out.println();
								System.out.print("array[" + j + "]=" + newarray[j] + "\t");
							}
						System.out.println("\n操作错误\n操作结束！");
						System.exit(0);}
						else 
						{System.out.println("\n\n操作结束！");
						System.exit(0);}
				    }
				    else {
				    	System.out.println();
					     break;}
				    }
			}
				if(!isFind)
				{System.out.println("很抱歉，查找失败，此数值不存在！\n");
				break;}
                break;
		case 'n':
			System.out.println();
			break;
		default:
			System.out.println("操作失败，程序自动进行排序！");
			//方法一：运用Java的sort包进行排序；			
			Arrays.sort(array);
			c=0;
			for (int j = 0; j < array.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + array[j] + "\t");
			}
			/*
			//方法二：
			// 选择排序：每次循环，交换 i 和 minIndex的值
			for (int i = 0; i < array.length; i++) {
				int minvalue = array[i];// 假设第i个值为最小值
				int minIndex = i; // 最小值的下标
				for (int j = i + 1; j < array.length; j++) {
					if (minvalue > array[j])
						{minvalue = array[j];
					minIndex = j;}
				}
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}  
			c=0;
			for (int j = 0; j < array.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + array[j] + "\t");
			}*/
			break;
		}
		System.out.println("在无删除数组的条件下是否需要增加新数值？（y/n）");
		String choose3 = input.next();
		if("y".equals(choose3)) {
			System.out.println("请问您要增加几个新数值？");
			int newcount = input.nextInt();
			int[] newarray = new int[newcount+array.length];
			for (int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}System.out.println("请输入要增加的数值：");
			for (int i = 0; i < newcount; i++) {
				int addnum = input.nextInt();
				newarray[array.length+i] = addnum;		
			}
			System.out.println("新数组排序后如下：");
			Arrays.sort(newarray);
			c=0;
			for (int j = 0; j < newarray.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + newarray[j] + "\t");
			}
			
		}	
		else 
			System.out.println("操作结束！");
		}
}


