package ch06;

import java.io.*;

public class _6TestThrowException extends Exception {

	public static void square(double n)throws _6TestThrowException{
		if(n<0.0) throw new _6TestThrowException();//��������ʱ��ִ��throw���
		else System.out.println(Math.sqrt(n));
	}
	public static void main(String[] args) throws IOException{
		double number=0;
		_6TestThrowException tt=new _6TestThrowException();
		try{
			System.out.println("input double number:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�������뻺����
			String s=br.readLine();//ͨ������������һ�ַ���
			number=Double.parseDouble(s);//��������ַ���ת��Ϊ������
			tt.square(number);
		}catch(_6TestThrowException e){
			System.out.println("�������ݴ���");
		}
	}
}
