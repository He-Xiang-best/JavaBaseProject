package ex10;

import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * 第十次实验
 * 第七章 文件与数据流
 * 在文件中输出三角形
 * 采用标准输出流
 * @author 郭晓燕
 * 2017.5.10
 *
 */
public class J_Triangle_One {
/**
 * 使用System.out系统输出流打印倒立三角形
 *  @param length 倒立三角形的行数
 */
	public static void printTrian(int length){
		for (int i=0;i<length;i++){
			for (int m=0;m<i;m++)
				  System.out.print(" ");
		    for (int n=0;n<2*(length-1-i)+1;n++)
				  System.out.print("*");
			  System.out.println();
		 }//end for for
	}
	/**
	 * 将系统输出流重定向至文件输出流
	 * 调用打印三角形的方法，将三角形输出至文件。
	 * @param args无意义
	 */
	public static void main(String args[]){
		try{
			//向控制台输出倒立三角形
			printTrian(5);
			
			//将标准输出流转向至文件流
			System.setOut(new PrintStream(new FileOutputStream("triangle.txt")));
			printTrian(5);//打印一个5行的倒立三角形
		}catch(Exception ex){
		System.out.println(ex);
		}
	}
}
