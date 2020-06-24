package ex08;

import java.util.Scanner;
/**
 * 
 * @content:�½�һ��ѧ���༶��StudentClass����������һ��ѧ�����鳤��Ϊ5������5��ѧ��Student��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������6:35:45
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������10:45:35
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�����ѧ���Ƿ�Ϊ��λ���жϺϷ��ԣ��Լ��Ƿ�Ϊ�����ѧԺ��ѧ��
 */
public class StudentClass {

	private static Scanner input;
	public static void main(String[] args) {
		//ʹ�ö�������洢ѧ������Ϣ��
		input = new Scanner(System.in);
		Student[] s = new Student[5];
		//��������ռ�
		for (int i = 0; i < s.length; i++) {
			if(s[i]==null)
				s[i]=new Student();
		}
		
		writeIn(s);//Ҳ�����ڹ��췽������ʵ����Ϣ��¼��
		
       for(;;) {
    	   System.out.println("\n���ϵ���Ϣ�Ƿ���Ҫ�޸�(y/n)��");
       if(input.next().charAt(0)=='y')
    	   correct(s);
       else 
    	   break;
       }
       
       System.out.println("**************************************************************");
       System.out.println("¼���5��ѧ��ƽ���ɼ���Ϣ���£�");
       //for���򻯴�ӡ�������Ϣ������дtoString������
       
       for (Student student : s) {
		System.out.println(student.toString());
	}
       
}
	
	private static void correct(Student[] s) {
		//�򵥵��޸ĳ���
		System.out.println("�����޸ļ���ͬѧ(����ѧ�Ų���)��");
		String find = input.next();
		boolean canfind = false;
         for (Student student : s) {
			if(student.getID().equals(find)){
				canfind = true;
				System.out.println("������Ҫ�޸��ĸ���Ϣ��");
				//ע�⣬һ��ѧ�Ų����ģ���Ϊ������Դ����Ŀ�ɼ����ĺ�ƽ����Ҫ��֮�仯��
				//��Ŀ˵���ܸ�ƽ����Ӧ����˵��ȥ�ֶ��޸İɣ�ʵ�ʵĻ��ǻ���
				System.out.println("1.����  2.������ɼ�  3.��ѧ�ɼ�  4.Ӣ��ɼ�");
				int choose = input.nextInt();
				switch (choose) {
				case 1:
					System.out.println("�����������֣�");
					student.setName(input.next());
					break;
				case 2:
					System.out.println("��ѧ���ļ�����ɼ�Ϊ��");
					student.setComputer(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				case 3:
					System.out.println("��ѧ������ѧ�ɼ�Ϊ��");
					student.setMath(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				case 4:
					System.out.println("��ѧ����Ӣ��ɼ�Ϊ��");
					student.setEnglish(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				default:
					System.out.println("ѡ�񲻴��ڣ��뷵������ѡ��");
					break;
				}
			}
		}
         if(!canfind)
         System.out.println("��ѧ�������ڣ��Ƿ�ѧ��������أ�����һ�ΰ�");
	}
	
	public static void writeIn(Student[] s) {
		System.out.println("������¼��5��ѧ���Ļ�����Ϣ���Լ�����Ӣ����������ſγ̵ĳɼ�:");
		String str;
	       for (Student student : s) {   	  
			System.out.print("������ѧ����������");
			student.setName(input.next());
			System.out.print("������ѧ����ѧ�ţ�");
			str = input.next();
			student.setID(judge(str));
			System.out.println("��ѧ���ļ��������ѧ��Ӣ������ѧ�Ƶĳɼ������ǣ�");
			student.setComputer(input.nextFloat());
//			System.out.print("������ѧ������ѧ�ɼ���");
			student.setMath(input.nextFloat());
//			System.out.print("������ѧ����Ӣ��ɼ���");
			student.setEnglish(input.nextFloat());
			student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
			System.out.println("**************************************************************");
		}
	}
	
	/*
	 * ����ѧ���Ƿ�Ϊ��λ���жϺϷ���:
	 */
	public static String judge(String str) {
		while(str.length()!=8) {
			System.out.println("ѧ�Ų��ǰ�λ���������������������ѧ�ţ�");
			str =input.next();
		}
		return str;
	}
}
