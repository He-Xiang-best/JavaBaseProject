package studyProgram;

import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @contend��VIP��Ա�齱�
 * @author�� ����
 * @time�� 2020��2��19������11:09:51
 */
public class VIPlottery {
private static Scanner input;
/*
 * ������ҳ��������������֣�ϵͳ���Զ�������������VIP���룬�����õ��ĺ��������ϵͳ��
 * ϵͳ���Զ������жϸú����Ƿ��н��������н�Ҫ��Ϊ�������λ֮�͵���15�����н�����
 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("���ã�����������������");
		String name = input.next();
		Random number = new Random();//�����������ӵ��������ÿ���������ɵĺ���������ģ��޹��ɿ��ԣ�
		System.out.println("���𾴵� " + name + " ����������γ�ȡ�ĺ���Ϊ��");
		for(int i = 0;i < 5;i++ ) {
			System.out.print(number.nextInt(10));
		}//��ӡ0~9�������ѭ����ӡ��һ����λ����
		System.out.println();
		System.out.println("�뽫����õĳ齱��ȷ�Ϻ����룬��Ϊ���鿴���Ƿ��н�");
		int num = input.nextInt();
		int oneplace = num % 10;
		int twoplace = num / 10 % 10;
		int threeplace = num / 100 % 10;
		int fourplace = num / 1000 % 10;
		int fiveplace = num / 10000 % 10;
		int sum = oneplace + twoplace + threeplace + fourplace + fiveplace;
		if(sum > 0 && sum==15)
			System.out.println("��ϲ�������ĺ����н��ˣ�����˾��������һ�ݣ�ף������");
		else
			System.err.println("���ź������ĺ���û�н�����л���Ĳ��룡");
	}
	
}

