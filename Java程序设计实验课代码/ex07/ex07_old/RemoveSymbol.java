package ex07_new;

import java.util.Scanner;

/**
 * 
 * @content:
 * 一个以回车结束的字符串（少于20个字符），
 * 把字符串中的所有数字字符（‘0’-‘9’）转换为整数，去掉其他字符。
 * 例如字符串“3A56BC”转换为整数后是“356”
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午3:23:37
 * @第一次修改的时间：
 * @time:2020年5月27日下午3:23:37
 * @修改原因：课堂测验，修改内容：
 */
public class RemoveSymbol {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一串字母加数字的字符串，系统将为您删除所有字母并输出数据结果");
	String str = input.next();
	System.out.println("去除字母后的结果为："+ move(str));
	input.close();
}
	public static int move(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i])) {
				str2.append(charArray[i]);
			}
		}
		return Integer.parseInt(str2.toString());
	}
	
}
