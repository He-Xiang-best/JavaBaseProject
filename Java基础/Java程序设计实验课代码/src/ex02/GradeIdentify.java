package ex02;

import java.util.Scanner;
/**
 * @content:
      ����һ��ѧ����JAVA�ɼ�Ϊn��0��100����������
      ��дһ������������ѧ���ɼ��ĵȼ���
      ����76Ϊ���С������ţ�>=90;����>=80;�У�>=70;����>=60;������<60)
 * @author:04191315����
     �������һ�����ʱ��Ϊ��
 * @time:2020��4��21������3:15:36
     �������һ���޸�ʱ��Ϊ��
 * @time:2020��4��29������10:45:36 ; 
     �޸�ԭ�򣺿��ò��飬�޸����ݣ�����������Ч���ж�
 */

public class GradeIdentify {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ѧ����Java�ɼ���");
		int n = input.nextInt();
		//����������Ч���ж�,����������
		while (n < 0 || n > 100) {
			System.out.println("����������ֲ���1-100֮�䣬����������ɼ���");
			n = input.nextInt();
		}
		switch (n / 10) {
		case 9:
		case 10:
			System.out.println("�ɼ���" + n + "\t �ȼ����� ");
			break;
		case 8:
			System.out.println("�ɼ���" + n + "\t �ȼ� ����");
			break;
		case 7:
			System.out.println("�ɼ���" + n + "\t �ȼ����� ");
			break;
		case 6:
			System.out.println("�ɼ���" + n + "\t �ȼ������� ");
			break;
		default:
			System.out.println("�ɼ���" + n + "\t �ȼ� ��������");
			break;
		}
		input.close();
	}
}
