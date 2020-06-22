package ex2.select;

import java.util.Scanner;

import ex2.InputPara;
/**
 * 实验第二题
 * 选做题，在程序中定义两个整数
 * 从键盘输入一个字符变量，
 * 若为+’、‘-’、‘*’、‘/’时计算相应的值并输出
 **@author 郭晓燕
 *@version 2.0
 *@since J2SE1.7
 *2017.2.28
 */
public class IntegerCompute {
	/**
	 * 计算aInt和 bInt的运输结果，运算符是ch
	 * 若除数为0，抛出异常
	 * @param aInt 第一个操作数
	 * @param bInt 操作数，做除法不能为0
	 * @param ch 运算符
	 * @return 运算结果，
	 */
	static int comp(int aInt,int bInt,char ch) throws Exception{
	  int result=0;
	//判断运算符的类型并进行计算
		switch(ch){
		case '+':
			result=aInt+bInt;
			break;
		case '-':
			result=aInt-bInt;
			break;
		case '*':
			result=aInt*bInt;
			break;
		case '/':
			if (bInt!=0) result=aInt/bInt;
			else throw new Exception("除数为0");
			break;
		}
		return result;
	}
	
	public static void main(String args[]) throws Exception{
		int aInt ,bInt, result;
		char op;

		//读取两个操作数及运算符
		//调用InputPar的静态方法，获取操作数和运算符
		aInt=InputPara.inputIntNumber();
		op=InputPara.inputCharNumber();
		bInt=InputPara.inputIntNumber();		
		InputPara.closeIn();
		
		//调用方法进行计算
		result=comp(aInt,bInt,op);
		
		//输出结果
		System.out.println(Integer.toString(aInt)+
		    		Character.toString(op)+Integer.toString(bInt)+
				"计算的结果: " +result);
		
	}
}
