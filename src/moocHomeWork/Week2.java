package moocHomeWork;

import java.util.Scanner;

/**
 * @content:
 * ��дһ��Ӧ�ó�����֤���µ�ʽ�ǳ����ģ� 
 * 3^3 + 4^3 + 5^3 = 6^3 
 * 6^3 + 7^3 + ... + 69^3 = 180^3
 * @author:04191315����
 * @time:2020��4��13������8:14:40
 */
public class Week2 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = (int) Math.pow(6 , 3);
		for (int i = 3; i < 6; i++) {
			sum1 += (int) Math.pow(i, 3);
		}
		System.out.println("��֤��ʽ��3^2 + 4^2 + 5^2 = 6^2�Ľ���� �������� " + (sum1 == sum2));
		System.out.println();
		sum1 = 0;
		sum2 = (int) Math.pow(40, 3);
		for (int i = 3; i <= 22; i++) {
			sum1 += (int) Math.pow(i, 3);
		}
	 System.out.println("��֤��ʽ��6^3 + 7^3 + ... + 69^3 = 180^3�Ľ���� �������� " + (sum1 == sum2));
	 System.out.println("\n������һ������n�����ҳ�n^3��������������֮�͵ĵ�ʽ��\n(ע���Բ⡪������10000����ҵ��ٶȻ����)");	
	 Scanner input = new Scanner(System.in);
	 int n = input.nextInt();
       long [] x = new long [n];
       long sum = 0,t=0;
       for (int i = 0; i < x.length; i++) {
		x[i] = (long)Math.pow(i+1, 3);
	}
       for(int count =1;count<=x.length ;count++) {
		sum=0;
		t=count-1;
       for (int i =count-1; i < x.length; i++) {
		sum += x[i];
		t++;
		for (int j = i+1; j < x.length; j++) {
			if(sum==x[j]) {
				System.out.println(count+"^3 +...+ "+t+"^3 = "+(j+1)+"^3");
			}
		}
	} 
       }		
		input.close();
		
	}	
}
