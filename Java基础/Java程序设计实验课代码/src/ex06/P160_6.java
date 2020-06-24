package ex06;

import java.util.Arrays;
/**
 * 
 * @content:随机生成10个不同的26个英文字母并排序
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月21日下午5:18:45
 * @第一次修改的时间：
 * @time:2020年5月21日下午5:18:45
 * @修改原因：课堂测验，修改内容：
 */
public class P160_6 {
	static int num;

	public static void main(String[] args) {
		generate();
	}

	public static void sortAndPut(char[] symbol) {
		// 将随机生成的10个字符从小到大排序
		Arrays.sort(symbol);
		// 打印输出排序后的随机生成的字符
		for (int i = 0; i < symbol.length; i++) {
			System.out.print(symbol[i] + "  ");
		}
	}

	public static void generate() {
		// 定义一个数组连续存放随机生成的字符
		char[] symbol = new char[10];
		// 随机生成10个a~z的字符
		for (int i = 0; i < symbol.length; i++) {
			num = i;
			// 写法1：symbol[i]=(char)(int)(Math.random()*26+97);
			symbol[i] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
			// 使用方法判断是否生成的字符是各不相同的
			boolean p = true;
			while (p) {
				p = judge(symbol);
			}
		}sortAndPut(symbol);
	}

	public static boolean judge(char[] symbol) {
		for (int j = 0; j < num; j++) {
			// 判断新生成的字符是否与之前生成的字符有重复，如果有，则重新生成
			if (symbol[num] == symbol[j]) {
				symbol[num] = (char) (((int) (Math.random() * 1000)) % 26 + 97);
				return true;
			}
		}
		return false;

	}
}
