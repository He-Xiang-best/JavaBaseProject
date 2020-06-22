package ex2;

import java.util.Scanner;

/**
 * ��һ�����ռ��������ͨ����
 * ���Խ��մӼ��̴�������ֻ��ַ�
 * ����������������
 * @author ������
 * @since jdk1.7
 * 2017.3.1
 */
public class InputPara {
	static Scanner in=null;
    /**
     * �Ӽ����л�ȡһ������
     * @return �����������ֵ
     */
	public static int inputIntNumber(){
		int num=0;
		try{
		in=new Scanner(System.in);
		//��ȡ���������һ�У��Իس�����Ϊ�������룩
		//System.out.print("������һ�����֣�");
		num=in.nextInt();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return num;
	}
	
	public static String inputString(){
		String ch="";
		try{
			Scanner in=null;
			in=new Scanner(System.in);
			//��ȡ���������һ�У��Իس�����Ϊ�������룩
			//System.out.print("������һ���ַ���");
			ch = in.next().trim();
			
		 }catch(Exception ex){
				System.out.println(ex);
			}
			return ch;
	}
	/**
	 * �Ӽ����л�ȡһ���ַ�
	 * @return ����һ���ַ�
	 */
	public static char inputCharNumber(){
		char ch='1';
		try{
		Scanner in=null;
		in=new Scanner(System.in);
		//��ȡ���������һ�У��Իس�����Ϊ�������룩
		System.out.print("������һ���ַ���");
		String readLine = in.next().trim();
		ch=readLine.charAt(0);
		//System.out.println("���������"+ch);
		//in.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return ch;
	}
	
	public static void closeIn(){
		if (in!=null)
			in.close();
	}
}
