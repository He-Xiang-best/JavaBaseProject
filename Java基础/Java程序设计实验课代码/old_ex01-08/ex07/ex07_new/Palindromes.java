package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:判断一个字符串是否为回文
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午4:52:39
 * @第一次修改的时间：
 * @time:2020年5月27日下午4:52:39
 * @修改原因：课堂测验，修改内容：
 */
public class Palindromes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个字符串，系统将为您判断是否为回文");
		String str = input.nextLine();
	if(isPalindromes(str))
		System.out.println("此字符串文本是回文");
	else
		System.out.println("此字符串文本不是回文");
	input.close();
}
	public static boolean isPalindromes(String str) {
		boolean judge = true;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length/2; i++) {
			if(charArray[i]==charArray[charArray.length-1-i]) {
				continue;			
		}
			judge = false;
			break;
	}
		return judge;
	}
}
