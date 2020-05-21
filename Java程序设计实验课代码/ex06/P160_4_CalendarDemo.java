package ex06;

import java.util.Calendar;
/**
 * ����һ��������
 * @content:ʹ��Calendar�����2008�����������ͳ�����ڵĸ�λ������Ӧ������ǡ����ͬ��������
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��21������5:23:28
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��21������5:23:28
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P160_4_CalendarDemo {
	//�ҵ�����Ӧ������ǡ����ͬ��Ŀ��
	static String[] weekday = { "������", "����һ", "���ڶ�", "������", "������", "������", "������" };
	//������Ӧ���·�����
	static int[] Monthday = { 0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	//���ô�ӡ����ݣ�Ҳ��������������ʹ��Scanner¼��,���Ͳ�����final���壩
	static final int year = 2008;

	public static void main(String[] args) {
		System.out.println("ʹ��Calendar���ӡ2008�����������:");
		//�ж��Ƿ�Ϊ���꣬����2�·ݵ�����
		if (Isleapyear())
			Monthday[2] = 29;
		else
			Monthday[2] = 28;		
		int date = 0,count = 0,days = 0,weekdate;
		//ѭ����ӡ�·���Ϣ
		for (int month = 1; month <= 12; month++) {
			printCalender(month);
			System.out.println();
			//�̶��Ĺ�ʽ�����ڶ�Ӧ�����������ڼ�
			for (int day = 1; day <= Monthday[month]; day++) {
				days++;
				weekdate = ((year - 1) + (int) (year - 1) / 4 - (int) (year - 1) / 100 + (int) (year - 1) / 400 + days) % 7;
				date = day % 10;
				if (date == weekdate) {
					System.out.println(year + "��" + month + "��" + day + "��ǡ����" + weekday[weekdate]);
					count++;
				}
			}
			System.out.println("=====================================================");
			
		}
		System.out.println(year + "�����ڵĸ�λ������Ӧ������ǡ����ͬ��������Ϊ��" + count);
	}

	public static void printCalender(int month) {
		System.out.println("\t\t\t" + month + "��\n");
		//Calendar�ǳ����࣬ͨ������getInstance()��ȡ����
		Calendar calendar = Calendar.getInstance();
		//������������Ϣ����ע���·��Ǵ�0��ʼ�ģ������Ļ���
		calendar.set(year, month - 1, 1);
		// ���ܿ�ʼ�ĵ�һ�������ڼ�
		int startDay = calendar.get(Calendar.DAY_OF_WEEK); 
		int count = startDay - 1;
		int maxDay = Monthday[month];
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		//�ÿ���¿�ͷǰ�Ŀ�ȱ
		fillSpace(startDay);
		//��ӡ������Ϣ
		for (int day = 1; day <= maxDay; day++) {
			System.out.print(day + "\t");
			count++;
			// ÿ���7�컻һ����
			if (count >= 7) { 
				count = 0;
				System.out.println();
			}
		}
	}

	public static void fillSpace(int startDay) {
		for (int i = 1; i < startDay; i++) {
			System.out.print("\t");
		}
	}

	public static boolean Isleapyear() {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}
