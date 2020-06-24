package ex10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @content:ʵ��P246_4_5��Ŀ��Ҫ�󣬲���������һ����ϵͳ
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������8:47:44
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��11������10:47:44
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�����һ����
 */
public class P246_4_5 {
	public final static String pathName = "src/ex10/data.txt";
	private static Scanner input;
    private static int[] gradeInfo = null;//����һ�����鱣�����ݣ������ڱ༭�����¼��ٶ�ȡ�Ĳ���
	public static void main(String[] args) throws IOException {
		boolean judge = true;
		for (;;) {
			do {
				judge = true;
 System.out.println(
  "��ѡ����Ҫ���еĲ���ѡ�\n1.д��5��ѧ���ɼ���data.txt��\t" + "2.��data.txt�ж�ȡ5��ѧ��\n"
	+ "3.�༭data.txt��ѧ������Ϣ\t4.�˳�����");
				input = new Scanner(System.in);
				char key = input.next().charAt(0);
				switch (key) {
				case '1':writeData();break;//���ļ���д����
				case '2':ReadData();break;//���ļ��ж�ȡ����
				case '3':edit();break;//�༭����
				case '4':
					System.out.println("\n�������˳���");
					System.exit(0);
					break;
				default:
					System.out.println("����������������룡\n");
					judge = false;
					break;
				}
			} while (!judge);
			System.out.println("\n\n��Ҫ��������Ϣ���в���ô��(y/n)");
			char key2 = input.next().charAt(0);
			while (key2 != 'y' && key2 != 'n') {
				System.out.println("����������������룡");
				key2 = input.next().charAt(0);
			}
			if(key2=='n') {
				System.out.println("�����ѽ�����");
				System.exit(0);
			}
		}
	}
	/*
	 * �ж����������Ƿ�Ϊ�����Լ��Ƿ���0~100�ķ�Χ
	 */
public static boolean isInteger(String s) {
	for (int i = 0; i < s.length(); i++) {
		if(!Character.isDigit(s.charAt(i))) {
			System.out.print("������������������������룺");
			return true;
		}
	} 	
	//�жϳɼ�����ȷ�ԣ�
	if(Integer.parseInt(s)<0||Integer.parseInt(s)>100) {
	System.out.print("�ɼ���Χ¼��������������룺");
	return true;
}
	
	return false;	
}
/*
 * д�����ݣ�
 */
	public static void writeData() throws FileNotFoundException {
		System.out.println("��ֱ�����5λѧ���ĳɼ���0~100����������");
		//�˴�ʹ����򵥵������PrintStream��д���ݣ���ȻҲ����ʹ�������ķ�������������PrintWriter�Ӹ�����
		PrintStream p = new PrintStream(pathName);
		input = new Scanner(System.in);
		int[] grade = new int[5];//���ô�ӡ�ɼ���Ϣ������
		String s ;
		for (int i = 0; i < 5; i++) {
			System.out.print("��" + (i + 1) + "λͬѧ�ĳɼ��ǣ� ");
			//�ж����������Ƿ���ȷ��ʵ�����ʹ����������빦��:
			s = input.next();
			boolean judge = isInteger(s);
			while(judge) {
				//System.out.print("������������������������룺");
				s = input.next();
				judge = isInteger(s);
			}
				grade[i] = Integer.parseInt(s);		
//			//�жϳɼ�����ȷ�ԣ�
//			while(grade[i]<0||grade[i]>100) {
//				System.out.println("�ɼ�¼��������������룺");
//				grade[i] = input.nextInt();
//			}
			System.out.println("--------------------------------------------");	
			//��ӡ����Ӧ���ļ����У�
			p.println(grade[i]);
		}
		gradeInfo = grade.clone();
		System.out.println("�ɼ��ѳɹ�¼��data.txt��\n");
		p.flush();
		p.close();

	}
/*
 * �����ݣ�
 */
	public static void ReadData() throws IOException {
		BufferedReader readData = new BufferedReader(new FileReader(pathName));
		String str = null;
		int[] newGrade = new int[5];
		int sum = 0;
		for (int i = 0; (str = readData.readLine()) != null; i++) {
			sum += Integer.parseInt(str);
			newGrade[i] = Integer.parseInt(str);
		}
	//	gradeInfo = newGrade.clone();
		System.out.println("�ɼ���Ϣ��ȡ���£�\n");
		System.out.print("ѧ����\t1\t2\t3\t4\t5\n�ɼ���\t");
		for (int i = 0; i <newGrade.length; i++) {
			System.out.print(newGrade[i]+"\t");
		}
		System.out.println("\n��λѧ���ĳɼ�ƽ����Ϊ�� " + (float) sum / 5);
		Arrays.sort(newGrade);
		System.out.println("\n�ɼ��ӵ͵��ߵ�����Ϊ��");
		for (int i = 0; i < newGrade.length; i++) {
			System.out.print(newGrade[i] + "\t");
		}
		readData.close();
	}
/*
 * �༭ѧ����Ϣ��
 */
	public static void edit() throws NumberFormatException, IOException {
		PrintStream p = new PrintStream(pathName);
		input = new Scanner(System.in);
		System.out.println("�����޸ĵڼ���ѧ���ĳɼ���");
		int num = input.nextInt();
		System.out.println("�����������ѧ���ĳɼ�(����������ȡ��)��");
		String s = input.next();
		boolean judge = isInteger(s);
		while(judge) {
//			System.out.print("������������������������룺");
			s = input.next();
			judge = isInteger(s);
		}
		gradeInfo[num-1] = Integer.parseInt(s);	
		//���༭��ĳɼ����´�ӡ��ȥ
		for (int i = 0; i < 5; i++) {
			p.println(gradeInfo[i]);
		}
		System.out.println("\n�ɼ��༭��ϣ��µ���Ϣ��ȡ���£�\n");
		ReadData();
		p.flush();
		p.close();
	}

}

