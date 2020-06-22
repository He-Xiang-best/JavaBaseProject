package ex10.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import ex10.J_Student;
import ex2.InputPara;

public class J_ObjectGradeOutput {
	/**
	 * ��������PrintStream��д��һ����������
	 * @param out ���������
	 * @param st ��������
	 */
	public static void  GradeOutput(PrintStream out,J_Student[] st){
		 try
	        {
			  for(J_Student stu:st){
	            out.println(stu);
	            }
			  //out.close( );
	        }
	        catch (Exception e)
	        {
	            System.err.println("�����쳣:" + e);
	            e.printStackTrace( );
	        } // try-catch�ṹ����
		}
	/**
	 * ��һ����������д���ļ���
	 * @param filename д���ļ����ļ���
	 * @param st д������ݣ�һ����������
	 */
	public void  writeFile(String filename,J_Student[] st){
		try{
			
			PrintStream obout=new PrintStream(new FileOutputStream(filename,true));
			//for(J_Student s:st)
			GradeOutput(obout,st);
			obout.close();
		}catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
	}
	/**
	 * �ӿ���̨��ȡѧ����Ϣ�������ݱ�������Ӧ�Ķ���������
	 * @param length ��������ĳ���
	 * @return ���ض�������
	 */
	public static J_Student[] getScore(int length){
		J_Student[] st=new J_Student[length];
		String name;
		int age,cScore,javaScore;
		for (int i=0;i<length;i++){
			System.out.print("��������");
			name=InputPara.inputString();
			System.out.print("��������");
			age=InputPara.inputIntNumber();
			System.out.print("����c�ɼ�");
			cScore=InputPara.inputIntNumber();
			System.out.print("����java�ɼ�");
			javaScore=InputPara.inputIntNumber();
			st[i]=new J_Student(name,age,cScore,javaScore);
		}
		/*for (J_Student s:st)
			System.out.println(s);*/
		return st;
	}
}
