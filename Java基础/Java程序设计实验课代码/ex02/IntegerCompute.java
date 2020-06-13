package ex02;

import java.util.Scanner;
/**
 * 升级版
 * @content:定义两个整数，一个字符变量，当这个字符变量分别是‘+’、‘-’、‘*’、‘/’时，
                        用switch 语句输出这两个数的运算结果
 * @author:04191315何翔
 * @time:2020年4月21日下午3:45:11
 */
public class IntegerCompute {
private static Scanner input;
public static int x=0,y=0;
public static boolean isRight = true;
public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.println("请输入两个整数：");
	 x = input.nextInt();
	 y = input.nextInt();
	 judge();
//实现符号输入错误的可重操作性：
	while(!isRight) {
     judge();
	}     

}
 public static void judge() {
	 isRight = true;
	 System.out.println("请选择你要运算的运算符：+\t\t—\t*\t/");	
	 char symbol = input.next().charAt(0);
	 switch (symbol) {
		case '+':
			System.out.println(x+" + "+y+" = "+(x+y));
			break;
		case '-':
			System.out.println(x+" — "+y+" = "+(x-y));
			break;
		case '*':
			System.out.println(x+" * "+y+" = "+(x*y));
			break;
		case '/':
			System.out.println(x+" / "+y+" = "+(x/y));
			break;
		default:
			System.out.println("输入错误！！！请重新输入！");
			isRight = false;
			break;
		}
 }


}
