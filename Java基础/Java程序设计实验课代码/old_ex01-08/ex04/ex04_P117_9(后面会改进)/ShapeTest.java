package ex04_P117_9;

import java.util.Scanner;

public class ShapeTest {

	private static Scanner input;

	public static void main(String[] args) {
		for (;;) {
			System.out.println("您要计算哪个图形？");
			System.out.println("1.三角形\t\t2.正方形\t\t3.正五边形\t4.圆形");
			input = new Scanner(System.in);
			char key = input.next().charAt(0);
			double a = 0, b = 0, c = 0;

			switch (key) {
			case '1':
				System.out.println("请分别输入三角形的三条边长：");
				a = input.nextDouble();
				b = input.nextDouble();
				c = input.nextDouble();
				while(a+b<=c||a+c<=b||b+c<=a) {
					System.out.println("输入的边长无法构成三角形！请重新输入三条边长：");
					a = input.nextDouble();
					b = input.nextDouble();
					c = input.nextDouble();
				}
				Triangle triangle = new Triangle(a, b, c);
				triangle.print(triangle);
				break;
			case '2':
				System.out.println("请输入正方形的边长：");
				a = input.nextDouble();
				Square square = new Square(a);
				square.print(square);
				break;
			case '3':
				System.out.println("请输入正五边形的边长：");
				a = input.nextDouble();
				Pentagon pentagon = new Pentagon(a);
				pentagon.print(pentagon);
				break;
			case '4':
				System.out.println("请输入圆的半径：");
				a = input.nextDouble();
				Circle circle = new Circle(a);
				circle.print(circle);
				break;

			default:
				System.out.println("输入错误！！！程序已退出！！！");
				System.exit(0);
				break;
			}
			System.out.println("\n是否继续求图形的信息？(y/n)");
			char judge = input.next().charAt(0);
			while (judge != 'y' && judge != 'n') {
				System.out.println("输入错误！！！请重新输入！！！");
				judge = input.next().charAt(0);
			}
			if (judge == 'n') {
				System.out.println("程序已退出！");
				System.exit(0);
			}
		}
	}
}
