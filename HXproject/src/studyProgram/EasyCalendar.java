package studyProgram;
/**
 * 
 * @contend����ѭ����ӡ���� 
 * @author�� ���� 
 * @time�� 2020��2��18������11:57:56
 */
public class EasyCalendar {
	/*
	 * ��ӡ1997��7�·ݵ����� ��֪7�·ݵ�1�������ڶ�
	 */
	public static void main(String[] args) {
		// ���Դ���Ŀ��ʱ
		long startTime = System.currentTimeMillis();
		// ����1��
		System.out.println("һ\t��\t��\t��\t��\t��\t��");
		System.out.print("\t");
		int dayOfMonth = 31;
		for (int i = 1; i <= dayOfMonth; i++) {
			if (i % 7 == 0)
				System.out.print("\n");
			System.out.print(i + "\t");
		}
		// ����2��
		System.out.println("\n");
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		System.out.print("\t");
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i + "\t");
			if ((i + 1) % 7 == 0)
				System.out.print("\n");
		}
		// else System.out.println("\t");
		System.out.println("\n");
		long endTime = System.currentTimeMillis();//������Ŀ�����������г���������ʱ��
		System.out.println("����Ŀ��ʼ����������ʱ: " + (endTime - startTime) + " ���룡");
	}
}
