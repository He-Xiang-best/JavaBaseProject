package ex07_old;

import java.util.Scanner;

public class StringDemo {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//��Ȼ��������ʶ����������ȷ�Ѿ��н⣬�˴�Ϊʵ����ĿҪ��
		System.out.println("��Ŀ1.");
		firstest();
		System.out.println("��Ŀ2.");
		secondTest();
//		
//		//(3)
//		System.out.println("\n\n��Ŀ3.\n�����������ַ������д�С�Ƚϣ�Ҫ�������ַ������ȴ���3����");
//		String str2 = input.nextLine();
//		String str3 = input.nextLine();
//		if(judge(str2,str3)==0) {
//			System.out.println("�������ַ����Ĵ�С���");
//		}
//		else
//			if(judge(str2,str3)<0) {
//				System.out.println("�ַ���"+str2+"��"+str3+"С");
//			}
//			else
//				System.out.println("�ַ���"+str2+"��"+str3+"��");     
//		
//		System.out.print("\n��Ŀ4.\n���潫�ַ���"+str2+"ת��Ϊ�ַ����飬�����ǰ�����ַ���ɵ��ַ���\n���Ϊ��");
//		char[] ch = new char[100];
//		ch = str2.toCharArray();
//		for (int i = 0; i < 3; i++) {
//			System.out.print(ch[i]);
//		}
	}
	
/*
 *  ��һ�������ж�һ�����֤�����Ƿ���ĳ��ʡ���֤������Ҫ�󴫵�������������һ�����������֤��
 *  �ڶ�������Ϊ�жϵ�ǰ׺���������Ƕ�Ӧ��ʡ�ݡ��������Ϊ����ֵ������ɹ�������ʧ�ܡ�����ʾ���ж�ǰ׺��44������
 *  ��Ȼ��������ʶ����������ȷ�����Ѿ��н⣬�˴�Ϊʵ����ĿҪ���д
 */
	public static void firstest() {
		
		System.out.println("�����������������֤�ţ�������ʡ���Լ���ʡ�ݵ����֤ǰ׺");
		String id = input.next();
		String province = input.next();	
		String head = input.next();
		if(judge(id, head, province))
			System.out.println("�������֤��"+ head +"ʡ�ݵ�");
		else
			System.out.println("�������֤����"+ head +"ʡ�ݵ�");
		
	}
	
	public static boolean judge(String id,String head,String province) {
		if(id.subSequence(0, 2).equals(head))
			return true;
		else
		    return false;
	}
	
	/*
	 *дһ������������һ���ַ����е�һ���ַ�ȫ���滻Ϊ��һ���ַ������������ 
	 *�����ַ���Ϊ��AB-C-ABC�����á�First���滻���е�A��
	 */
	public static void replace2() {
		String[] str = {"A","B","-","C","-","A","B","C"};//Ҳ����¼��һ���ַ������ٰ���תΪ�ַ����������
		System.out.println("��Ŀ2.\n��ʼ�ַ���Ϊ��");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("A"))
				str[i]="First";			
		}
		System.out.println("\n��First�滻A����ַ���Ϊ��");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		int j=0;
		System.out.println("\n�滻���á�-��������£�");
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("-")) {
				for(;j<i;j++) {
					System.out.print(str[j]);
				}
				System.out.println();
				j=i+1;
			}
		}
		for (; j < str.length; j++) {
			System.out.print(str[j]);
		}
		
	}
	public static void secondTest() {
		System.out.println("������һ���ַ�����");
		String str = input.nextLine();
		System.out.println("��ʼ���ַ���Ϊ��"+str);
		//ת��Ϊ�ַ�����֣�û�зָ���������
		/*
		 * ����зָ���Ļ������Բ���String.split()�����򻯣���������ձ�ͨ�ⷽ��
		 */
	   char[] charArray = str.toCharArray();
	   //���ַ�����ת��Ϊ�ַ�������
		String[] str2 = new String[charArray.length];
		for (int i = 0; i < str2.length; i++) {
			str2[i] = String.valueOf(charArray[i]);
			//д��2��str2[i] = Character.toString(charArray[i]);
		}
		System.out.println("�����������滻���ַ����ַ�����ʲô��");
		String replaceSymbol = input.nextLine();
		System.out.println("����Ҫ���滻�����ַ����е��Ǹ����ַ�����");
		String replaced = input.next();
		for (int i = 0; i < str2.length; i++) {
			if(str2[i].equals(replaced)) {
				str2[i] = replaceSymbol;
			}
		}
		
		System.out.println("�滻����ַ������£�");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
	}
}
