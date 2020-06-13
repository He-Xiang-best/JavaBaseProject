package ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * @content:演示键盘输入的三种方式
 * @author:04191315何翔
 * @time:2020年4月21日下午3:39:56
 */
public class TestInput {
	/**
	 * 方法一：
	 * 采用标准输入流的方法获取从键盘中输入的字符内容
	 *jdk1.4之前的方法，从控制台接收一个字符串，然后将其打印出来。
         * 需要用到BufferedReader类和InputStreamReader类
         * 看懂此部分要预习第7章文件与数据流。
	* @return 返回键盘输入的字符串
	 */
	public static String InputOne(){
		String str = null;
		try{
			//System.in是标准输入流，是字节流。
			//InputStreamReader是将字节流转换为字符流。
			//BufferedReader是带缓冲的输入流
			System.out.println("使用输入流方法从键盘输入你的内容:");
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      	str = br.readLine();//str获取到从键盘输入的数据，按回车键结束。
	   		
	       }//第33行代码会抛出一个IO异常，所以要进行捕捉。
	       catch(IOException e){
	    	   System.err.print(e);
	       }
		return str;
	}
	/**
	 * 最推荐的方法：用Scanner类，比较自由
	 * 关于Scanner类的介绍书上没有相关内容
	 * 自行百度或查看jdk帮助文档
	 * @return 返回键盘输入的字符串
	 */
	public static String InputTwo(){
		Scanner in=null;
		System.out.println("使用Scanner方法从键盘输入你的内容:");
		in=new Scanner(System.in);
		//读取键盘输入的一行（以回车换行为结束输入）
		String readLine = in.nextLine();  
		in.close();
		return readLine;
	}
	/**
	 * 用图形化组件的方式
	 * 三种方式不能和其他两种一起出现，
	 * 可以单独在主方法中调用方法三
	 * @return 返回键盘输入的字符串
	 * 
	 */
	public static String InputThree(){
		String a=JOptionPane.showInputDialog("请输入：");
	    System.out.println("your value is :"+a);
	    return a;
	}

	public static void main(String[] args) {
	  String input1,input2;
	  input1=TestInput.InputOne();//调用第一种方法；
	  input2=TestInput.InputTwo();//调用第二种方法    	      
	  System.out.println("使用输入流方法输入的内容是 :"+input1);
      System.out.println("使用scanner方法输入的字符串："+input2);
      /**
       String input3;
      input3=TestInput.InputThree();//调用第三种方法     
	  System.out.println("使用scanner方法输入的字符串："+input3);
	  */	
			
	}

}

