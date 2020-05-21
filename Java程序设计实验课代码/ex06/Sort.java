package ex06;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @content:��д���ļ�Sort.java���ں�����һά���飬�����з������԰����򼰽����һά��������Ԫ�ؽ������򣬴�ӡ
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��21������5:04:41
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��21������5:04:41
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Sort {
	private static Scanner input;
	static long startTime = System.nanoTime();
	static long endTime = System.nanoTime();

	public static void main(String[] args) {
		int[] array = generate();// �����������Ϊ����
		System.out.println("\n===================================");
		/*
		 * ʹ�ò�ͬ�ķ������򣬲��Ƚ���Щ������Ч�ʣ�ʹ�����뵥λ�Ƚϣ���
		 */
		Arrays_sort����(array);
		ð������(array);
		ѡ�����򷽷�(array);
		�������򷽷�(array);
	}

	public static int[] generate() {
		System.out.println("��������������ɼ�����������");
		input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int count = 0;
		System.out.println("������������ɵ��������£�");
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
		System.out.print("\n������ʱ��");
		System.out.print(endTime - startTime + " ns\n");
	}

	public static void ����output(int[] array) {
		// �����ӡ�����
		System.out.println("�����ӡ������£�");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (count != 0 && count++ % 5 == 0)
				System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n===================================");
	}

	public static void Arrays_sort����(int[] array) {
		System.out.println("ʹ��Arrays.sort������������:");
		startTime = System.nanoTime();
		Arrays.sort(array);
		endTime = System.nanoTime();
		output(array);
		// ����
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - (i + 1)];
			array[array.length - (i + 1)] = temp;
		}
		����output(array);
	}

	public static void ð������(int[] array) {
		System.out.println("ʹ��ð�����򷨣�");
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
		// ����
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		����output(array);

	}

	public static void ѡ�����򷽷�(int[] array) {
		System.out.println("ʹ��ѡ��������������");
		startTime = System.nanoTime();
		for (int i = 0; i < array.length; i++) {
			int minvalue = array[i];// �����i��ֵΪ��Сֵ
			int minIndex = i; // ��Сֵ���±�
			// �ҵ���������С��Ԫ�ز��Ǽ����±꣺
			for (int j = i + 1; j < array.length; j++) {
				if (minvalue > array[j]) {
					minvalue = array[j];
					minIndex = j;
				}
			}
			// ����СԪ���뿪ʼѭ�����ҵ���Ԫ�ؽ��н���ʵ������
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
		endTime = System.nanoTime();
		output(array);
		// ����
		for (int i = 0; i < array.length; i++) {
			int maxvalue = array[i];// �����i��ֵΪ���ֵ
			int maxIndex = i; // ���ֵ���±�
			// �ҵ�����������Ԫ�ز��Ǽ����±꣺
			for (int j = i + 1; j < array.length; j++) {
				if (maxvalue < array[j]) {
					maxvalue = array[j];
					maxIndex = j;
				}
			}
			// �����Ԫ���뿪ʼѭ�����ҵ���Ԫ�ؽ��н���ʵ������
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
		����output(array);
	}

	public static void �������򷽷�(int[] array) {
		System.out.println("ʹ�ò������򷨣�");
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
		// ����
		for (int i = 0; i < array.length - 1; i++) {
			current2 = array[i + 1];
			int preIndex2 = i;
			while (preIndex2 >= 0 && current2 > array[preIndex2]) {
				array[preIndex2 + 1] = array[preIndex2];
				preIndex2--;
			}
			array[preIndex2 + 1] = current2;
		}
		����output(array);
	}

}
