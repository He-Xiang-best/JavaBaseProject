package ex10.four;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import ex2.InputPara;

/**
 * 
 * @author Administrator
 *
 */
public class J_DataGradeOutput {
	
	/**
	 * �ӿ���̨���������ѧ���ɼ�
	 * �������ɼ�����ȷ�򷵻ؿ�ֵ
	 * ���򷵻ض�Ӧ�ĳɼ�����
	 * @param length���������N��ѧ����
	 * @return �ɼ�����������
	 */
	public int[] inputGrade(int length){
		int[] studentG=new int[length];
		for (int i=0;i<studentG.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ɼ�:");
			studentG[i]=InputPara.inputIntNumber();
			if (!J_Byte_Fourth.idGrade(studentG[i])){
				studentG=null;
				break;
			}
			
		}
		return studentG;
	}
	/**
	 * ������a�ĳɼ�д���ļ�filename��
	 * @param filename д���ļ����ļ���
	 * @param a Ҫд���ѧ���ɼ�����
	 */
	public static void writeFile(String filename,int a[]){
		try{
		FileOutputStream fout = new FileOutputStream(filename);
        DataOutputStream dfout =new DataOutputStream(new BufferedOutputStream(fout));
        int i;
        for (i=0; i< a.length; i++)
            dfout.writeInt(a[i]);
        dfout.close( );
		}catch(Exception ex){
			System.err.println("�����쳣:" + ex);
            ex.printStackTrace( );
		}
	}
}
