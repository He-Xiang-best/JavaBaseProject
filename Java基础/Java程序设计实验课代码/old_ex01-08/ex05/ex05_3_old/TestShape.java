package ex05_3_old;

import java.util.Scanner;

public class TestShape {
	public static Scanner input;

	public static void main(String[] args) {
		for (;;) {
			System.out.println("��Ҫ�����ĸ�ͼ�Σ�");
			System.out.println("1.������\t\t2.������\t\t3.�������\t4.Բ��");
			input = new Scanner(System.in);
			char key = input.next().charAt(0);
			double a = 0, b = 0, c = 0;
			switch (key) {
			case '1':
				System.out.println("��ֱ����������ε������߳���");
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				while(a+b<=c||a+c<=b||b+c<=a) {
					System.out.println("����ı߳��޷����������Σ����������������߳���");
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
				}
				Triangle triangle = new Triangle(a, b, c);
				triangle.outPut(triangle);
				break;
			case '2':
				System.out.println("�����������εı߳���");
				a = input.nextDouble();
				Square square = new Square(a);
				square.outPut(square);
				break;
			case '3':
				System.out.println("������������εı߳���");
				a = input.nextDouble();
				Pentagon pentagon = new Pentagon(a);
				pentagon.outPut(pentagon);
				break;
			case '4':
				System.out.println("������Բ�İ뾶��");
				a = input.nextDouble();
				Circle circle = new Circle(a);
				circle.outPut(circle);
				break;

			default:
				System.out.println("������󣡣����������˳�������");
				System.exit(0);
				break;
			}
			System.out.println("\n�Ƿ������ͼ�ε���Ϣ��(y/n)");
			char judge = input.next().charAt(0);
			while (judge != 'y' && judge != 'n') {
				System.out.println("������󣡣������������룡����");
				judge = input.next().charAt(0);
			}
			if (judge == 'n') {
				System.out.println("�������˳���");
				System.exit(0);
			}
		}

	}
}
