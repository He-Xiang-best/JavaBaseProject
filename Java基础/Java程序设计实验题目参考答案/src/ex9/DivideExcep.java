package ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideExcep {
	public static void main(String args[]){
		try{
			  BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
			  System.out.print("�����������");
			  String cl=strin.readLine();
			  int a=Integer.parseInt(cl);
			   System.out.print("�����뱻������");
			  cl=strin.readLine();
			  int b=Integer.parseInt(cl);
			  int c=b/a;
			  System.out.println("��Ϊ��"+c);
		   }
		
		  
		   //������I/O�йص��쳣 
		  catch(IOException e){
			  e.printStackTrace();
		  }
		  //������ֵת��ʱ���쳣���粻�ܽ��ַ�ת������ֵ 
		  catch(NumberFormatException e){
			  System.out.print("������������");
			  
			  //e .printStackTrace(); 
		  }
		  //�������Ϊ0���쳣 
		  catch(ArithmeticException e){
			  System.out.print("����������0��");
			  //e .printstackTrace();
		  }
		 
	}	  

}
