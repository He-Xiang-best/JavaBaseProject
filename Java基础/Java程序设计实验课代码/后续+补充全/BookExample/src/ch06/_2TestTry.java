package ch06;

import java.io.*;

public class _2TestTry {

	public static void main(String[] args){
		int n=0;
		String str="hello every!";
		try{
			System.out.println("input integer n:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�������뻺����
			String s=br.readLine();//ͨ������������һ�ַ���
			n=Integer.parseInt(s);//��������ַ���ת��Ϊ����
			char ch=str.charAt(n);
			System.out.println(ch);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
		System.out.println("try/catch�����ִ�е����");
	}
}
		
