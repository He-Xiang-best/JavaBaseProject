package ex2.select;

import java.util.Scanner;

import ex2.InputPara;
/**
 * ʵ��ڶ���
 * ѡ���⣬�ڳ����ж�����������
 * �Ӽ�������һ���ַ�������
 * ��Ϊ+������-������*������/��ʱ������Ӧ��ֵ�����
 **@author ������
 *@version 2.0
 *@since J2SE1.7
 *2017.2.28
 */
public class IntegerCompute {
	/**
	 * ����aInt�� bInt�����������������ch
	 * ������Ϊ0���׳��쳣
	 * @param aInt ��һ��������
	 * @param bInt ������������������Ϊ0
	 * @param ch �����
	 * @return ��������
	 */
	static int comp(int aInt,int bInt,char ch) throws Exception{
	  int result=0;
	//�ж�����������Ͳ����м���
		switch(ch){
		case '+':
			result=aInt+bInt;
			break;
		case '-':
			result=aInt-bInt;
			break;
		case '*':
			result=aInt*bInt;
			break;
		case '/':
			if (bInt!=0) result=aInt/bInt;
			else throw new Exception("����Ϊ0");
			break;
		}
		return result;
	}
	
	public static void main(String args[]) throws Exception{
		int aInt ,bInt, result;
		char op;

		//��ȡ�����������������
		//����InputPar�ľ�̬��������ȡ�������������
		aInt=InputPara.inputIntNumber();
		op=InputPara.inputCharNumber();
		bInt=InputPara.inputIntNumber();		
		InputPara.closeIn();
		
		//���÷������м���
		result=comp(aInt,bInt,op);
		
		//������
		System.out.println(Integer.toString(aInt)+
		    		Character.toString(op)+Integer.toString(bInt)+
				"����Ľ��: " +result);
		
	}
}
