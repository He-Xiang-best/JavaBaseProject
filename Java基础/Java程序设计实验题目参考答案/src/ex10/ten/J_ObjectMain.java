package ex10.ten;

import ex10.J_ObjectOutputStream;
import ex10.J_Student;
import ex2.InputPara;
/**
 * ������ʵ��ʮ
 * ���ö������������
 * �����Ϊ�򻯣����ñ仯������
 * @author ������
 * 2017.5.18
 */
public class J_ObjectMain {
	
	public static void main(String[] args) {
		System.out.print("�������뼸λͬѧ�ĳɼ���");
		int length=InputPara.inputIntNumber();
		J_Student[] js=J_ObjectGradeOutput.getScore(length);
		
		J_ObjectOutputStream.writeFile("data1.dat",js);
		
		StringBuffer bs=J_ObjectInputStream.readFile("data1.dat");
		System.out.print(bs);
	}

}
