package ex10;

import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * ��ʮ��ʵ��
 * ������ �ļ���������
 * ���ļ������������
 * ���ñ�׼�����
 * @author ������
 * 2017.5.10
 *
 */
public class J_Triangle_One {
/**
 * ʹ��System.outϵͳ�������ӡ����������
 *  @param length ���������ε�����
 */
	public static void printTrian(int length){
		for (int i=0;i<length;i++){
			for (int m=0;m<i;m++)
				  System.out.print(" ");
		    for (int n=0;n<2*(length-1-i)+1;n++)
				  System.out.print("*");
			  System.out.println();
		 }//end for for
	}
	/**
	 * ��ϵͳ������ض������ļ������
	 * ���ô�ӡ�����εķ�������������������ļ���
	 * @param args������
	 */
	public static void main(String args[]){
		try{
			//�����̨�������������
			printTrian(5);
			
			//����׼�����ת�����ļ���
			System.setOut(new PrintStream(new FileOutputStream("triangle.txt")));
			printTrian(5);//��ӡһ��5�еĵ���������
		}catch(Exception ex){
		System.out.println(ex);
		}
	}
}
