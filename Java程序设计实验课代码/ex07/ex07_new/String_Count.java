package ex07_new;

import java.util.Scanner;

/**
 * 用最简单的数组方法实现：
 * @content:用户通过键盘指定一个字符串，然后由程序来统计并输出在该字符串中每个字符出现的次数
 * @author:04191315_何翔 
 * @第一次完成的时间：
 * @time:2020年5月27日下午12:05:33 
 * @第一次修改的时间：
 * @time:2020年5月29日下午2:20:08
 * @修改原因：课堂测验，修改内容：完善先前的漏洞
 */
public class String_Count {
	static int[] symbolNum;// 对于个数的存储，最后输出统计结果

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请随便输入一串字符：");
		String s = input.nextLine();
		symbolNum = new int[s.length()];
		find2(s);// 查找有哪些字母出现过
		print(s);// 打印信息
		input.close();
	}

	public static void find2(String s) {
		for (int i = 0; i < s.length(); i++) {
			//抽取本身单个字符，逐一查找是否重复出现，出现就记录
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					symbolNum[i]++;
					//注意这里的会把出现过的字符个数重复统计，只要在输出的时候剔除即可
				}
			}
		}
	}

	public static void print(String s) {
		System.out.println("输入的字符串中字母统计个数如下：");
		for (int i = 0; i < s.length(); i++) {
			if (symbolNum[i] > 0) {
				System.out.println("‘" + s.charAt(i) + "’" + "的个数是：" + symbolNum[i]);
				//对上面打印过的字符输出后，剔除后面重复打印的即可
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						symbolNum[j] = 0;
					}
				}
			}
		}
	}
}
