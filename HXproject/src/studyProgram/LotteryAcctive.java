package studyProgram;

import java.util.Scanner;

/**
 * @contend���¼۸�齱� 
 * @author�� ���� 
 * @time�� 2020��2��18������10:21:14
 */
public class LotteryAcctive {
	private static Scanner input;

	public static void main(String[] args) {
		//��������齱����Χ��1000~9000��ǧ�����ͣ�
		final int rightPrice = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;
		//System.out.println(rightPrice);
		//final int rightPrice = 5000;
		int guessPrice = -1;
		System.out.println("��ӭ�����¼۳齱��ֳ������λ������5�β¼ۻ���Ŷ��");
		for (int i = 1; i <= 5; i++) {
			System.out.println("���������µļ۸�ɣ�");
			input = new Scanner(System.in);
			guessPrice = input.nextInt();
			if (guessPrice == rightPrice && i == 1) {
				System.out.println("��ϲ������1�ξͲ¶���!\n�����iPhone8s plus plus ����������Ʒһ��!");
				break;
			} else if (guessPrice == rightPrice && (i == 2 || i == 3)) {
				System.out.println("��ϲ������" + i + "�ξͲ¶���!\n����˻�Ϊ��ҫ�ֻ�������Ʒһ��!");
				break;
			} else if (guessPrice == rightPrice) {
				System.out.println("��ϲ������" + i + "�ξͲ¶���!\n�����С�����������ഺ�澫����Ʒһ��!");
				break;
			} else if ((5 - i) == 0)
				System.out.println("�ܱ�Ǹ�����Ĳ½����������꣬�¼۳齱��ѽ�����");
			else if (guessPrice <= rightPrice)
				System.out.println("���ź���û�в¶ԣ����µļ۸���ͣ������ɣ�������" + (5 - i) + "�λ���Ŷ��");
			else if (guessPrice >= rightPrice)
				System.out.println("���ź���û�в¶ԣ����µļ۸���͸ߣ������ɣ�������" + (5 - i) + "�λ���Ŷ��");
		}
	}
}
