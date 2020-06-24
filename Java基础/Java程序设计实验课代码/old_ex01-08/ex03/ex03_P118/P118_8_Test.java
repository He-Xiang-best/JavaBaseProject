package ex03_P118;
/**
 * @content:求给定三个整数系数的方程的解
 * @author:04191315何翔
 * @time:2020年4月29日上午12:11:00
 */
public class P118_8_Test {
	
	public static void main(String[] args) {
	  //通过创建对象并调用构造函数进行录入a，b，c三个整数系数的值
	  P118_8 num = new P118_8();
	  //判断方程是否有解，有则输出根的值，无则提示此方程无解
	  num.judge();
	}	
}



