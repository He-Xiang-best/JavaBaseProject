package ch06;

import java.io.*;

public class _6TestThrowException extends Exception {

	public static void square(double n)throws _6TestThrowException{
		if(n<0.0) throw new _6TestThrowException();//条件成立时，执行throw语句
		else System.out.println(Math.sqrt(n));
	}
	public static void main(String[] args) throws IOException{
		double number=0;
		_6TestThrowException tt=new _6TestThrowException();
		try{
			System.out.println("input double number:");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//声明输入缓冲区
			String s=br.readLine();//通过键盘输入任一字符串
			number=Double.parseDouble(s);//将输入的字符串转换为浮点数
			tt.square(number);
		}catch(_6TestThrowException e){
			System.out.println("输入数据错误！");
		}
	}
}
