package ex09;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @content:	
 * ��д����DivideExcep.java�����������������������
 * ʹ������catch�Ӿ䣬�ֱ�׽����Ϊ0���쳣�Ͳ������������쳣��
 * ���벢���У����������Ϊ0ʱ�������쳣���֣�
 * ������Ĳ�������ʱ���罫30�����3o�����ֵ�����һ���쳣��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������8:54:44
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������8:54:44
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class DivideExcep {

	public static void main(String[] args) {
		try {
			System.out.println("�������� x / y = " + input());
		} catch (ArithmeticException e1) {
			System.err.println("����������󣬷�ĸ����Ϊ��0����");
			e1.printStackTrace();
		} catch (InputMismatchException e2) {
			System.err.println("�������������������ݷ����ͣ�");		
			e2.printStackTrace();
		}

	}

	public static int input() {
		Scanner input = new Scanner(System.in);
		System.out.println("��������������x,y�����ɼ���x/y����Ľ����");
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		return x / y;

	}
}
