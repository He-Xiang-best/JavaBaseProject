package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:用户通过键盘指定一个字符串，然后由程序来统计并输出在该字符串中每个字符出现的次数
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午12:05:33
 * @第一次修改的时间：
 * @time:2020年5月27日下午12:05:33
 * @修改原因：课堂测验，修改内容：
 */
public class String_Count {
	static int[] symbolNum = new int[26];//对于个数的存储，最后输出统计结果
	static char[] symbol = new char[26];//存储字母，与个数匹配对应
/*
 * 当然上面的方法是最简单的，其他思路:
 * (1)直接用一个数组symbolNum，需要寻找的匹配字母可以通过强制转换实现(试过会出错)
 * (2)可以使用map等集合方法，通过键-值匹配的方式匹配字母及其个数
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请随便输入一串字符：");
		String s = input.next();
		// 将输入的字符串转换为字符数组，方便查找统计时使用（简单方法）
		char[] charArray = s.toCharArray();
		对应字母储存();
		find(charArray);//查找有哪些字母出现过
		print();//打印信息
       input.close();
	}

	public static void 对应字母储存() {
		int i = 0;
		for (char ch = 'a'; ch <= 'z' && ch >= 'a' && i < symbol.length; ch++, i++) {
			symbol[i] = ch;
		}
	}

	public static void find(char[] array) {
		for (int i = 0; i < array.length; i++) {
			//对于输入的字符串中，每个字符遍历寻找是否出现，若出现，则统计数增加
			for (char ch = 'a'; ch <= 'z' && ch >= 'a'; ch++) {
				if (array[i] == ch) {
					//将字母转换为数据存储
					symbolNum[(int) ch - 97]++;
				}
			}
		}
	}

	public static void print() {
		System.out.println("输入的字符串中字母统计个数如下：");
		for (int i = 0; i < symbolNum.length; i++) {
			if (symbolNum[i] > 0) {
				System.out.println("字母" + symbol[i] + "的个数是：" + symbolNum[i]);
			}
		}

	}

}
