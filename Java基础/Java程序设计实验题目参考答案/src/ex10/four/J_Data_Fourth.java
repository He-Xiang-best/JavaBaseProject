package ex10.four;

import java.util.Arrays;
/**
 * �����µ�����
 * �ڶ��ַ������������ֽ����������
 * @author ������
 *
 */
public class J_Data_Fourth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int grade[],result[];
		J_DataGradeOutput jdout=new J_DataGradeOutput();
		grade=jdout.inputGrade(5);
		if (grade==null){
			System.out.print("�ɼ���������˳�");
		}
		else{
			J_DataGradeOutput.writeFile("data1.txt", grade);		
			J_DataGradeInput jdin=new J_DataGradeInput();
			result=J_DataGradeInput.readFile("data1.txt", 5);
			System.out.println("ƽ����"+jdin.averageGrade(result));
			Arrays.sort(result);
			for(int num:result)
				System.out.println(num);
		}
	}

}
