package ch06;

import java.io.*;
import java.util.Scanner;

public class TestIndexException {

	public static void printarray(int[] b,int m) throws IndexException{
		if(m<0||m>=b.length)
				throw new IndexException();
		System.out.print("  "+b[m]);
	}

	public static void main(String[] args) {
		int n=0;
		int a[]={1,2,3,4,5,6,7,8,9,10};
		String s="";
		try{
			System.out.println("input integer n:");
			Scanner in=new Scanner(System.in);
			//读取键盘输入的一行（以回车换行为结束输入）
			String readLine = in.nextLine();  
			System.out.println("输入字符串："+readLine);
			n=Integer.parseInt(readLine);
			printarray(a,n);
		}		
		catch(IndexException e){
			System.out.println(e.toString());
			System.exit(-1);
		}
		catch(NumberFormatException e){
			System.out.println("Invalid integer");
			//System.exit(-1);
		}
	}

}
