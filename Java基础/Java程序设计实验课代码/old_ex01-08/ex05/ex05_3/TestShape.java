package ex05_3;

import java.util.Scanner;
/**
 * 
* @content:定义一个测试操作类，只有一个主方法，运用多态思想，生成两个数据类型是形状类但
                      其引用的分别是矩形类和正方形类的对象，并分别输出结果。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月13日下午11:31:34
 * @第一次修改的时间：
 * @time:2020年5月13日下午11:31:34
 * @修改原因：课堂测验，修改内容：
 */
public class TestShape {
	public static Scanner input;

	public static void main(String[] args) {
		for (;;) {
			System.out.println("您要计算哪个图形？");
			System.out.println("1.三角形\t\t2.正方形\t\t3.正五边形\t4.圆形");
			input = new Scanner(System.in);
			char key = input.next().charAt(0);
			switch (key) {
			case '1':
				new Triangle().outPut();
				break;
			case '2':
				new Square().outPut();
				break;
			case '3':
				new Pentagon().outPut();
				break;
			case '4':
				new Circle().outPut();
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
