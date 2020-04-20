package studyProgram;

import java.util.Scanner;

/**
 * 
 * @content:��ӡ��������֪1900��һ��һ��Ϊ����һ(����1900�������������
 * @author:04191315����
 * @time:2020��2��27������12:36:25
 */
public class PrintCalenderDemo {
public static int year=-1,month=-1;
public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
private static Scanner input;
	public static void main(String[] args) {
		// ���û�������ݺ��·�
		InputYearAndMonth();
		//��ӡ����
		PrintCalender();

	}

/**
 * 
 * @content����ӡ�����ĺ��ķ���
 * @2020��2��27������12:38:57
 * @return
 */
	public static void PrintCalender() {
		//����1900��1-1���û��������·ݵ�������
		/*
		 * ����������������
		 * ������µ�����֮��
		 */
		int sum = getSumDayOfYear();
		sum += getSumDayOfMonth();
		//sum++;
		//System.out.println(sum);
		//��ӡ��ݺ��·�
		String[] monthNames = {"1��","2��","3��","4��","5��","6��",
				               "7��","8��","9��","10��","11��","12��"};
		System.out.println("\t\t"+year+"\t"+monthNames[month-1]);
		System.out.println("======================================================");
		//��ӡ�·ݵı��⣨����һ�������գ�
		String[] weekDays = { "����һ","���ڶ�","������","������","������","������","������"};
		for (int i = 0; i < weekDays.length; i++) {
			System.out.print(weekDays[i]+"\t");
		}
		System.out.println();
		//����ĳ��1�������ڼ�����ӡ����������
		//dayOfWeekȡֵ��Χ��0~6��
		int dayOfWeek = 1+sum % 7;// �����������ڼ���õ�������,1900��1��1������һ
		//System.out.println("���������Ϊ��" + year + "-" + month + ",����µ�1��������" + dayOfWeek);
		// ����������գ���ͷ�� ���ÿճ�������
		// �˴�֮��dayOfWeek������ʾ����1��ǰ���Ʊ���ĸ���
			if(dayOfWeek==7)
			   dayOfWeek=0;
		for (int i = 0; i <dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month-1]; i++) {
			System.out.print(i+1);
			if((dayOfWeek+i) % 7 ==0)
				System.out.println();
			else
				System.out.print("\t");
		}
	}

	// �ж��Ƿ�������
	public static boolean isleapYear(int year) {	
	return year % 400 == 0||year % 4 == 0 && year % 100 != 0;
}
	
	// ��1900~year֮�����ݽ����ۼ�����
	public static int getSumDayOfYear() {
		if(year<=1900) {
			System.out.println("�������������������룺");
			year = input.nextInt();
		}
		int sum = 0;
		for(int i = 1900;i<year;i++) {
			sum += 365;//ÿһ���ۼ�365��
			if(isleapYear(i)) {
				sum++;//�����+1��
			}
		}
		return sum;
	}
	
	// ���·ݽ����ۼӼ���
	public static int getSumDayOfMonth() {
		int sum = 0;		
		for(int i = 0;i<=month;i++) {
			sum += dayOfMonth[i];
			if(isleapYear(year)&&month >=3) {
				sum++;
			}
		}
		return sum;
	}
	

	public static void InputYearAndMonth() {
	input = new Scanner(System.in);
	System.out.println("��������ݣ�");
	year = input.nextInt();
	System.out.println("�������·�");
	month = input.nextInt();
	//System.out.println("���������Ϊ��" + year + "-" + month);
}





































































}
