package ch06;

import java.io.*;

public class _7TestIndexException {

	public static void printarray(int[] b,int m) throws _7IndexException{

		if(m<0||m>=b.length)
				throw new _7IndexException();
		System.out.print(b[m]);		
	}
	public static void main(String[] args) throws IOException
	{
	    int n=0;
		int a[]={1,2,3,4,5,6,7,8,9,10};
		String s="";
		try{
			System.out.println("input integer n:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�������뻺����
			s=br.readLine();//�Ӽ��̶�������
			n=Integer.parseInt(s);//�����������ת��Ϊ����
			printarray(a,n);		
		}
		catch(NumberFormatException e){
			System.out.println("Invalid integer!");
			System.exit(-1);
		}
		catch(_7IndexException e){
			System.out.println(e.toString());
			System.exit(-1);
		}
	}
}
