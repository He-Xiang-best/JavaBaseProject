package ex6.selected;
/**
 * 
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalender {
	int weekday;//��ǰ���ڶ�Ӧ��������
	int count;//ͳ�����ڸ�λ������������ͬ����Ŀ
	/**
	 * ���ָ�������С�ڵ����·ݵ�����
	 * @param year ���
	 * @param month ���������С�ڵ���month���·�
	 */
	PrintCalender(int year, int month) {

		for (int j = 1; j < month + 1; j++) {
			System.out.println(year+"��" + j + "��");
			System.out.println("��\tһ\t��\t��\t��\t��\t��");

			GregorianCalendar d = new GregorianCalendar(year, j - 1, 1);
			d.set(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK); //�õ����µ�1������ڼ���ʼ ,���������� 
			//��֮ǰ�Ĵ�ӡ��
			for (int i = Calendar.SUNDAY; i < weekday; i++) {
				System.out.print("\t");
			}

			do {
				//��ӡ��ǰ����
				System.out.print(d.get(Calendar.DAY_OF_MONTH) +"\t");
				//��ӡ����������׼������
				if (weekday == Calendar.SATURDAY)
					System.out.println();
				//���ڼ�1����Ӧ�����ڼ���Ӧ��������
				d.add(Calendar.DAY_OF_MONTH, 1);
				weekday = d.get(Calendar.DAY_OF_WEEK);
				//ͳ�����ڸ�λ�����Ӧ������ͬ������
				if(d.get(Calendar.DAY_OF_MONTH)==(d.get(Calendar.DAY_OF_WEEK)-1))
					count++;
			} while ((d.get(Calendar.MONTH) + 1) == j);
			System.out.println();
			System.out.println("|--------------------------------------------------|");
		}
		System.out.println("ͳ����Ľ��Ϊ"+count);
	}

}