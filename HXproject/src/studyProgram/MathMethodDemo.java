package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:计算平面坐标之间三个点的距离
 * @author:何翔
 * @time:2020年2月24日下午8:36:48
 */
public class MathMethodDemo {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("下面请输入三个坐标，计算距离：\n");
		input = new Scanner(System.in);
		double[] x = new double[3];
		double[] y = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("\n请输入第"+(i+1)+"个横坐标x:\t");
			double numx = input.nextDouble();
			x[i] = numx;
			System.out.print("请输入第"+(i+1)+"个纵坐标y:\t");
			double numy = input.nextDouble();
			y[i] = numy;
			System.out.println("第" +(i+1)+"个坐标为：("+x[i]+","+y[i]+")");
		}
       System.out.println("\n令第1个坐标为点A，第2个坐标为点B,第3个坐标为点C");
		System.out.println("\n请问您要查询哪两个坐标之间的距离呢？1.AB\t2.AC\t3.BC");
		int point = input.nextInt();
		switch (point) {
		case 1:
			System.out.printf("点AB之间的距离为：%.2f",
			Math.sqrt(Math.pow(x[0]-x[1], 2)+Math.pow(y[0]-y[1], 2)));
			break;
			case 2:
				System.out.printf("点AC之间的距离为：%.2f",
				Math.sqrt(Math.pow(x[0]-x[2], 2)+Math.pow(y[0]-y[2], 2)));
			break;
			case 3:
				System.out.printf("点BC之间的距离为：%.2f",
				Math.sqrt(Math.pow(x[1]-x[2], 2)+Math.pow(y[1]-y[2], 2)));
				break;
		default:
			System.err.println("查询错误！");
			break;
		}
	}
}
