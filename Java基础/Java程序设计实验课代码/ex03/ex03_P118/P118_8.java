package ex03_P118;

import java.util.Scanner;
/**
 * @content:�̲�P118ҳ��8��
 * @author:04191315����
 * @time:2020��4��29������12:03:11
 */
public class P118_8 {
private Scanner input;	
//������������a��b��c������Ϊ���̵�ϵ��
private int a;
private int b;
private int c;

//ͨ�����췽��������ϵ�����и�ֵ
public P118_8() {
System.out.print("������������a,b,c,�󷽳�ax^2+bx+c=0�ĸ�: \t");
input = new Scanner(System.in);
this.a = input.nextInt();
this.b= input.nextInt();
this.c= input.nextInt();
}
/**
 * 
 * @content��
     ����judge�����Է��̽����������ж�
 * @return
 */
public void judge() {
	//�����̵ĸ����б�ʽ<0������ѧ֪ʶ֪�������޽�
	if (Math.pow(b, 2) - 4 * a * c < 0) {
		System.out.println("Ҫ���ķ��̣� " + a + "x^2" + "+" + b + "x" + "+" + c + "=0  �޽⣡");
	} 
	//��֮�������б�ʽ>=0,�򷽳��н⣬������ѧ��ʽ:
	//x=(-b +- Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a �������
	else {
		double x1 = (double) (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		double x2 = (double) (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		System.out.println("���̣� " + a + "x^2" + "+" + b + "x" + "+" + c + "=0�ĸ�Ϊ��");
		System.out.println("x1=" + (float) x1 + "\tx2=" + (float) x2);
	}
  }
}