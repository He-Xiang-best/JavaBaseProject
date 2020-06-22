package ex2;

import java.util.Scanner;

/**
 * 做一个接收键盘输入的通用类
 * 可以接收从键盘传入的数字或字符
 * 方便其他类来调用
 * @author 郭晓燕
 * @since jdk1.7
 * 2017.3.1
 */
public class InputPara {
	static Scanner in=null;
    /**
     * 从键盘中获取一个整数
     * @return 返回这个整数值
     */
	public static int inputIntNumber(){
		int num=0;
		try{
		in=new Scanner(System.in);
		//读取键盘输入的一行（以回车换行为结束输入）
		//System.out.print("请输入一个数字：");
		num=in.nextInt();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return num;
	}
	
	public static String inputString(){
		String ch="";
		try{
			Scanner in=null;
			in=new Scanner(System.in);
			//读取键盘输入的一行（以回车换行为结束输入）
			//System.out.print("请输入一个字符：");
			ch = in.next().trim();
			
		 }catch(Exception ex){
				System.out.println(ex);
			}
			return ch;
	}
	/**
	 * 从键盘中获取一个字符
	 * @return 返回一个字符
	 */
	public static char inputCharNumber(){
		char ch='1';
		try{
		Scanner in=null;
		in=new Scanner(System.in);
		//读取键盘输入的一行（以回车换行为结束输入）
		System.out.print("请输入一个字符：");
		String readLine = in.next().trim();
		ch=readLine.charAt(0);
		//System.out.println("你输入的是"+ch);
		//in.close();
		}catch(Exception ex){
			System.out.println(ex);
		}
		return ch;
	}
	
	public static void closeIn(){
		if (in!=null)
			in.close();
	}
}
