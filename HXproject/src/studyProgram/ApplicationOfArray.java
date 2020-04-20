package studyProgram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @content:��������ص��ۺ�Ӧ��
 * @author:����
 * @time:2020��2��21������10:51:53
 */

public class ApplicationOfArray {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("��������������ɼ������飿");
		int n = input.nextInt();
		int[] array = new int[n];
		int c = 0;
		System.out.println("��������������£�");
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
			// �ж�������ż���ĸ���
			if (array[i] % 2 == 0)
				count2++;
			else
				count1++;
		}
		System.out.println();
		System.out.println("\n�������ɵ������У�");
		// ��ֵ��ѯ
		System.out.println("\n���ֵΪ�� " + max + "���ǵ�" + (a + 1) + "��Ԫ�أ�����" + "array[" + a + "]");
		System.out.println("��СֵΪ�� " + min + "���ǵ�" + (b + 1) + "��Ԫ�أ�����" + "array[" + b + "]");
		// ������ż���Ĳ�ѯ
		System.out.println("\n��ֵΪ�����������У� " + count1 + "��");
		System.out.println("��ֵΪż���������У� " + count2 + "��");
		// Ԫ����Ϣ������ѯ
		System.out.println("\n������Ҫ���ҵڼ���Ԫ�أ�");
		int num = input.nextInt();
		System.out.println("�� " + num + " ��Ԫ�ص�ֵΪ�� " + array[num - 1]);
		System.out.println("\n����������һ����ֵ�����������ҵ���Ԫ�صı��");
		//��ͨ���ң�
		int x = input.nextInt();
		int d = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				d = i;
				break;
			}
		}
		if (d == -1)
			System.out.println("�ܱ�Ǹ��û���ҵ���Ԫ�ص��±꣡");
		else
			System.out.println("����ֵ�ǵ�" + (d + 1) + "��Ԫ�أ�����" + "array[" + d + "]");
		System.out.println();
		System.out.println("�Ƿ����������С��������(y/n)");
		char judge = input.next().charAt(0);
		switch (judge) {
		case 'y':
			//ð�����򷨣�
			c = 0;
			System.out.println("�������������£�");
			for (int i = 1; i < array.length; i++) {
				for (int j = 0; j < array.length - i; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			//���������ź�֮�������β�������ɣ�
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
			//���ֲ��ҷ���
			System.out.println();
			System.out.println("\n����������Ҫ�鿴�����֣���ѯ���ţ����Ҷ������ɾ���������룺");
			int searchNumber = input.nextInt(); 
			boolean isFind = false;//�Ƿ��ҵ�
			int low = 0;
			int high = array.length - 1;//�Ͻ���½������
			//��֪�����Ҷ��ٴ�
			while(high >= low) {
				//�����е��±�
				int mid = (low + high) / 2;//���keyС���м�Ԫ�أ�ֻ���������ǰһ��Ԫ���м�������
				if(searchNumber < array[mid]) 
					high = mid - 1;
				else if(searchNumber > array[mid]) 
					low = mid + 1;
				else //���key���м�Ԫ�ص�ֵ��ȣ�����ҳɹ���
					{System.out.println("��������������������еĵ�"+(mid+1)+"��Ԫ�ؼ���array["+mid+"]");
				    isFind = true;	
			    	//����Ԫ�ص�ɾ����
				    System.out.println("\n�Ƿ�Ը���ֵ����ɾ����(y/n)");
				    String choose2 = input.next();
				    int count3 = array.length - 1;
				    if("y".equals(choose2)) {
				    	for (int i = mid; i < count3; i++) {
						array[i] = array[i+1];	
						}
				    	System.out.println("ɾ������ֵ�����������Ϊ��");
				    	c=0;
						for (int j = 0; j < array.length - 1; j++) {
							if (c++ % 5 == 0)
								System.out.println();
							System.out.print("array[" + j + "]=" + array[j] + "\t");
						}
						//����Ԫ�ص�����
						System.out.println("\n\n�Ƿ���Ҫ��������ֵ����y/n��");
						String choose3 = input.next();
						if("y".equals(choose3)) {
							System.out.println("������Ҫ���Ӽ�������ֵ��");
							int newcount = input.nextInt();
							int[] newarray = new int[newcount+array.length-1];
							for (int i = 0; i < array.length - 1; i++) {
								newarray[i] = array[i];
							}System.out.println("������Ҫ���ӵ���ֵ��");
							for (int i = 0; i < newcount; i++) {
								int addnum = input.nextInt();
								newarray[array.length-1+i] = addnum;		
							}
							System.out.println("��������������£�");
							Arrays.sort(newarray);
							c=0;
							for (int j = 0; j < newarray.length; j++) {
								if (c++ % 5 == 0)
									System.out.println();
								System.out.print("array[" + j + "]=" + newarray[j] + "\t");
							}
						System.out.println("\n��������\n����������");
						System.exit(0);}
						else 
						{System.out.println("\n\n����������");
						System.exit(0);}
				    }
				    else {
				    	System.out.println();
					     break;}
				    }
			}
				if(!isFind)
				{System.out.println("�ܱ�Ǹ������ʧ�ܣ�����ֵ�����ڣ�\n");
				break;}
                break;
		case 'n':
			System.out.println();
			break;
		default:
			System.out.println("����ʧ�ܣ������Զ���������");
			//����һ������Java��sort����������			
			Arrays.sort(array);
			c=0;
			for (int j = 0; j < array.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + array[j] + "\t");
			}
			/*
			//��������
			// ѡ������ÿ��ѭ�������� i �� minIndex��ֵ
			for (int i = 0; i < array.length; i++) {
				int minvalue = array[i];// �����i��ֵΪ��Сֵ
				int minIndex = i; // ��Сֵ���±�
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
		System.out.println("����ɾ��������������Ƿ���Ҫ��������ֵ����y/n��");
		String choose3 = input.next();
		if("y".equals(choose3)) {
			System.out.println("������Ҫ���Ӽ�������ֵ��");
			int newcount = input.nextInt();
			int[] newarray = new int[newcount+array.length];
			for (int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}System.out.println("������Ҫ���ӵ���ֵ��");
			for (int i = 0; i < newcount; i++) {
				int addnum = input.nextInt();
				newarray[array.length+i] = addnum;		
			}
			System.out.println("��������������£�");
			Arrays.sort(newarray);
			c=0;
			for (int j = 0; j < newarray.length; j++) {
				if (c++ % 5 == 0)
					System.out.println();
				System.out.print("array[" + j + "]=" + newarray[j] + "\t");
			}
			
		}	
		else 
			System.out.println("����������");
		}
}


