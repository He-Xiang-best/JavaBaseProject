package ex07_new;

import java.util.Scanner;

/**
 * 
 * @content:编写通用方法countlets()，
 * 返回以参数形式传递的字符串中的字母数。返回的计数中应该不包括数字、空格、标点符号和换行符等。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午3:43:58
 * @第一次修改的时间：
 * @time:2020年5月27日下午3:43:58
 * @修改原因：课堂测验，修改内容：
 */
public class ReturnSymbol {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一串字母加数字的字符串，系统将仅为您保留字母并输出数据结果");
		String str = input.nextLine();
	System.out.println("留下字母的结果为："+ countlets(str));
	input.close();
}
	public static String countlets(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLetter(charArray[i])) {
				str2.append(charArray[i]);
			}
		}
		return (str2.toString());
	}
}
