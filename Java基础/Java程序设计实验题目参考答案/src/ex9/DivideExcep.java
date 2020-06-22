package ex9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideExcep {
	public static void main(String args[]){
		try{
			  BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
			  System.out.print("请输入除数：");
			  String cl=strin.readLine();
			  int a=Integer.parseInt(cl);
			   System.out.print("请输入被除数：");
			  cl=strin.readLine();
			  int b=Integer.parseInt(cl);
			  int c=b/a;
			  System.out.println("商为："+c);
		   }
		
		  
		   //捕获与I/O有关的异常 
		  catch(IOException e){
			  e.printStackTrace();
		  }
		  //捕获数值转化时的异常，如不能将字符转化成数值 
		  catch(NumberFormatException e){
			  System.out.print("请输入整数：");
			  
			  //e .printStackTrace(); 
		  }
		  //捕获除数为0的异常 
		  catch(ArithmeticException e){
			  System.out.print("除数不可以0！");
			  //e .printstackTrace();
		  }
		 
	}	  

}
