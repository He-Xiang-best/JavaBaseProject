package ch06;

import java.io.*;

public class _2TestTry {

	public static void main(String[] args){
		int n=0;
		String str="hello every!";
		try{
			System.out.println("input integer n:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//声明输入缓冲区
			String s=br.readLine();//通过键盘输入任一字符串
			n=Integer.parseInt(s);//将输入的字符串转换为整型
			char ch=str.charAt(n);
			System.out.println(ch);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		
		System.out.println("try/catch语句块后执行的语句");
	}
}
		
