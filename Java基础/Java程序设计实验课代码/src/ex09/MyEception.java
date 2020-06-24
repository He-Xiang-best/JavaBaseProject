package ex09;

import java.util.Scanner;
/**
 * @content:编写程序MyExcep.java包含自定义异常，当输入数值为13和4时抛出该异常
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午3:04:53
 * @第一次修改的时间：
 * @time:2020年6月4日下午3:04:53
 * @修改原因：课堂测验，修改内容：
 */
public class MyEception {

	private static Scanner input;

	public static void main(String[] args) throws Num {
		input = new Scanner(System.in);
        System.out.println("请输入一个数字，如果是13或4是则抛出异常：");
        double num = input.nextDouble();
        if(num==13||num==4) {
       	   throw new Num(num);
        }
        else
        	System.out.println("输入的数字为: "+num+" != 13 or 4  ,  无异常抛出！");
	}

}

//自定义异常抛出：
    class Num extends Exception{
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	      public Num(double num) {
	    	  super("\n当前的数值为"+(int)num+" , 已按要求抛出异常！");
	      }
}