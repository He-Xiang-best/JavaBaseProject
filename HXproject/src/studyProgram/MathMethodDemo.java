package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:����ƽ������֮��������ľ���
 * @author:����
 * @time:2020��2��24������8:36:48
 */
public class MathMethodDemo {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("�����������������꣬������룺\n");
		input = new Scanner(System.in);
		double[] x = new double[3];
		double[] y = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("\n�������"+(i+1)+"��������x:\t");
			double numx = input.nextDouble();
			x[i] = numx;
			System.out.print("�������"+(i+1)+"��������y:\t");
			double numy = input.nextDouble();
			y[i] = numy;
			System.out.println("��" +(i+1)+"������Ϊ��("+x[i]+","+y[i]+")");
		}
       System.out.println("\n���1������Ϊ��A����2������Ϊ��B,��3������Ϊ��C");
		System.out.println("\n������Ҫ��ѯ����������֮��ľ����أ�1.AB\t2.AC\t3.BC");
		int point = input.nextInt();
		switch (point) {
		case 1:
			System.out.printf("��AB֮��ľ���Ϊ��%.2f",
			Math.sqrt(Math.pow(x[0]-x[1], 2)+Math.pow(y[0]-y[1], 2)));
			break;
			case 2:
				System.out.printf("��AC֮��ľ���Ϊ��%.2f",
				Math.sqrt(Math.pow(x[0]-x[2], 2)+Math.pow(y[0]-y[2], 2)));
			break;
			case 3:
				System.out.printf("��BC֮��ľ���Ϊ��%.2f",
				Math.sqrt(Math.pow(x[1]-x[2], 2)+Math.pow(y[1]-y[2], 2)));
				break;
		default:
			System.err.println("��ѯ����");
			break;
		}
	}
}
