package ex02;

import java.util.Scanner;
/**
 * @content:����n��(�ǵݹ鷽��)
 * @author:04191315����
 * @time:2020��4��21������3:32:58
 */
public class Factorial_my {


public static void main(String[] args) {
	System.out.println("����������������ֵĽ׳�");
	Scanner input = new Scanner(System.in);
	long n = input.nextLong();
	double sum = 1;//��long�õ��Ľ��Ҳ���ܻ������
	for (int i = 1; i <= n; i++) {
		sum *= i; 
	}
	if(n <= 10)
	System.out.println(n + "!= " + (long)sum);//��С���ֵĽ׳�ʱ����
	else
	System.out.println(n + "!= " + sum);     //������ֵĽ׳�ʱ����
	input.close();
}
}
