package ex9;

import java.util.Scanner;

/**
 * 第六章 异常处理
 * @author guoxiaoyan
 * 2017.5.1
 *
 */
public class IntergerExcep {
	
	public double catchEx() throws NumberFormatException{
		String inputs;
		double inputd;
		Scanner in=null;
		System.out.println("输入一个浮点数：");
		in=new Scanner(System.in);
			inputs=in.next();
			inputd=Double.parseDouble(inputs);
		in.close();
		return inputd;
	}
	
	public static void main(String args[]){
		IntergerExcep six=new IntergerExcep();
		try{
		double d=six.catchEx();
		System.out.println(d);
		}catch(NumberFormatException ex){
			System.err.print("输入错误"+ex);
		}
	}

}
