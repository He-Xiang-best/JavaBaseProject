package ex06;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @content:编写类文件Sort.java，内含变量一维数组，其中有方法可以按升序及降序对一维整型数组元素进行排序，打印
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月21日下午5:04:41
 * @第一次修改的时间：
 * @time:2020年5月21日下午5:04:41
 * @修改原因：课堂测验，修改内容：
 */
public class Sort {
	private static Scanner input;
	static long startTime = System.nanoTime();
	static long endTime = System.nanoTime();

	public static void main(String[] args) {
		int[] array = generate();// 生成随机数且为乱序
		System.out.println("\n===================================");
		/*
		 * 使用不同的方法排序，并比较这些方法的效率（使用纳秒单位比较）：
		 */
		Arrays_sort方法(array);
		冒泡排序法(array);
		选择排序方法(array);
		插入排序方法(array);
	}

	public static int[] generate() {
		System.out.println("请问您想随机生成几个数并排序？");
		input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int count = 0;
		System.out.println("随机数乱序生成的排序如下：");
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random() * 1000)) % 1001;
			if (count != 0 && count++ % 5 == 0)
				System.out.println();
			System.out.print(array[i] + "\t");
			// System.out.print("array[" + i + "]=" + array[i] + "\t");
		}
		return array;
	}

	public static void output(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (count != 0 && count++ % 5 == 0)
				System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.print("\n排序用时：");
		System.out.print(endTime - startTime + " ns\n");
	}

	public static void 逆序output(int[] array) {
		// 逆序打印输出：
		System.out.println("逆序打印输出如下：");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (count != 0 && count++ % 5 == 0)
				System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n===================================");
	}

	public static void Arrays_sort方法(int[] array) {
		System.out.println("使用Arrays.sort方法升序排序:");
		startTime = System.nanoTime();
		Arrays.sort(array);
		endTime = System.nanoTime();
		output(array);
		// 逆序：
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;
		}
		逆序output(array);
	}

	public static void 冒泡排序法(int[] array) {
		System.out.println("使用冒泡排序法：");
		startTime = System.nanoTime();
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		endTime = System.nanoTime();
		output(array);
		// 逆序：
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		逆序output(array);

	}

	public static void 选择排序方法(int[] array) {
		System.out.println("使用选择排序法升序排序：");
		startTime = System.nanoTime();
		for (int i = 0; i < array.length; i++) {
			int minvalue = array[i];// 假设第i个值为最小值
			int minIndex = i; // 最小值的下标
			// 找到数组中最小的元素并登记其下标：
			for (int j = i + 1; j < array.length; j++) {
				if (minvalue > array[j]) {
					minvalue = array[j];
					minIndex = j;
				}
			}
			// 把最小元素与开始循环查找的首元素进行交换实现排序
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		endTime = System.nanoTime();
		output(array);
		// 逆序：
		for (int i = 0; i < array.length; i++) {
			int maxvalue = array[i];// 假设第i个值为最大值
			int maxIndex = i; // 最大值的下标
			// 找到数组中最大的元素并登记其下标：
			for (int j = i + 1; j < array.length; j++) {
				if (maxvalue < array[j]) {
					maxvalue = array[j];
					maxIndex = j;
				}
			}
			// 把最大元素与开始循环查找的首元素进行交换实现排序
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
		逆序output(array);
	}

	public static void 插入排序方法(int[] array) {
		System.out.println("使用插入排序法：");
		int current;
		startTime = System.nanoTime();
		for (int i = 0; i < array.length - 1; i++) {
			current = array[i + 1];
			int preIndex = i;
			while (preIndex >= 0 && current < array[preIndex]) {
				array[preIndex + 1] = array[preIndex];
				preIndex--;
			}
			array[preIndex + 1] = current;
		}
		endTime = System.nanoTime();
		output(array);
		int current2;
		// 逆序
		for (int i = 0; i < array.length - 1; i++) {
			current2 = array[i + 1];
			int preIndex2 = i;
			while (preIndex2 >= 0 && current2 > array[preIndex2]) {
				array[preIndex2 + 1] = array[preIndex2];
				preIndex2--;
			}
			array[preIndex2 + 1] = current2;
		}
		逆序output(array);
	}

}
