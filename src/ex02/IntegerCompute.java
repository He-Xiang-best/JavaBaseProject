package ex02;

import java.util.Scanner;
/**
 * ������
 * @content:��������������һ���ַ�������������ַ������ֱ��ǡ�+������-������*������/��ʱ��
                        ��switch ����������������������
 * @author:04191315����
 * @time:2020��4��21������3:45:11
 */
public class IntegerCompute {
private static Scanner input;
public static int x=0,y=0;
public static boolean isRight = true;
public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("����������������");
	 x = input.nextInt();
	 y = input.nextInt();
	 judge();
//ʵ�ַ����������Ŀ��ز����ԣ�
	while(!isRight) {
     judge();
	}     

}
 public static void judge() {
	 isRight = true;
	 System.out.println("��ѡ����Ҫ������������+\t\t��\t*\t/");	
	 char symbol = input.next().charAt(0);
	 switch (symbol) {
		case '+':
			System.out.println(x+" + "+y+" = "+(x+y));
			break;
		case '-':
			System.out.println(x+" �� "+y+" = "+(x-y));
			break;
		case '*':
			System.out.println(x+" * "+y+" = "+(x*y));
			break;
		case '/':
			System.out.println(x+" / "+y+" = "+(x/y));
			break;
		default:
			System.out.println("������󣡣������������룡");
			isRight = false;
			break;
		}
 }


}
