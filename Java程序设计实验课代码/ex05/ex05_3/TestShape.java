package ex05_3;

import java.util.Scanner;
/**
 * 
* @content:����һ�����Բ����ֻ࣬��һ�������������ö�̬˼�룬��������������������״�൫
                      �����õķֱ��Ǿ��������������Ķ��󣬲��ֱ���������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������11:31:34
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������11:31:34
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class TestShape {
	public static Scanner input;

	public static void main(String[] args) {
		for (;;) {
			System.out.println("��Ҫ�����ĸ�ͼ�Σ�");
			System.out.println("1.������\t\t2.������\t\t3.�������\t4.Բ��");
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
