package ex10.ten;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;

public class J_ObjectGradeInput {
	/**
	 * �Ӷ�����BufferedReader�ж�ȡһ������
	 * @param in ������
	 * @return ��������ȡ���Ķ��� 
	 */
	public static StringBuffer GradeInput(BufferedReader in){
		//String st[]=new String[length];
		StringBuffer bs=new StringBuffer();
		String s="";
		 try
	        {
			   for(;s!=null;s=in.readLine()){
				   bs.append(s+"\n");
	            System.err.println(s);
   
			  }
			 }
	        catch (Exception e)
	        {
	            System.err.println("�����쳣gradeInput:" + e);
	            e.printStackTrace( );
	        } // try-catch�ṹ����
		return bs;
	}
	/**
	 * ���ļ��ж�ȡ���ݽ��������ַ��������С�
	 * @param filename ��ȡ�ļ����ļ���
	 * @param length  ��ȡ����������������ַ�������ĳ���
	 * @return�ַ������飬�����ļ�������
	 */
	public static StringBuffer readFile(String filename){
		StringBuffer st=new StringBuffer();
		try{
			BufferedReader obin=new BufferedReader(new FileReader(filename));
			st=GradeInput(obin);
			obin.close();
		}catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
		
		return st;
	}

}
