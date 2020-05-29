package ex07_new;

import java.util.Scanner;
/**
 * 
 * @content:编写一个应用程序String_Method.java，实现以下功能
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午3:22:23
 * @第一次修改的时间：
 * @time:2020年5月27日下午3:22:23
 * @修改原因：课堂测验，修改内容：
 */
public class String_Method {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("题目1.");
		firstest();
		System.out.println("=====================================================");
		System.out.println("\n题目2.");
		secondTest();
		System.out.println("\n=====================================================");
		System.out.println("\n题目3.");
		thirdTest();
	}

	/*
	 * 用一个方法判断一个身份证号码是否是某个省身份证，方法要求传递三个参数，第一个参数是身份证，
	 * 第二个参数为判断的前缀，第三个是对应的省份。方法输出为布尔值，真则成功，假则失败。（提示：判断前缀“44”）；
	 * 虽然按常规意识，这个问题的确明显已经有解，此处为实现题目要求而写
	 */
	public static void firstest() {

		System.out.println("请依次输入您的身份证号，您所在省份以及此省份的身份证前缀");
		String id = input.next();
		String province = input.next();
		String head = input.next();
		if (judge(id, head, province))
			System.out.println("您的身份证是" + province + "省份的");
		else
			System.out.println("您的身份证不是" + province + "省份的");

	}

	public static boolean judge(String id, String head, String province) {
		if (id.subSequence(0, 2).equals(head))
			return true;
		else
			return false;
	}

	/*
	 * 写一个方法，可以一个字符串中的一个字符全部替换为另一个字符串后再输出，
	 *  比如字符串为“AB-C-ABC”，用“First”替换所有的A；
	 */
	public static void secondTest() {
		System.out.println("请输入一个字符串：");
		String str = input.next();
		System.out.println("初始的字符串为：" + str);
		// 转换为字符串拆分（没有分割符的情况）
		/*
		 * 如果有分割符的话，可以采用String.split()方法简化，下面的是普遍通解方法
		 * 以下的方法为自定义更改方法，更加全面
		 */
		char[] charArray = str.toCharArray();
		// 将字符数组转换为字符串数组
		String[] str2 = new String[charArray.length];
		for (int i = 0; i < str2.length; i++) {
			str2[i] = String.valueOf(charArray[i]);
			// 写法2：str2[i] = Character.toString(charArray[i]);
		}
// 注意：此处输入的 是字符，如果想更改字符串的话，可以使用String.subSequence().equals()的方法截取更改实现
		System.out.println("你想要的替换上述字符串中的那个“字符”？");
		String replaced = input.next();
		System.out.println("您想替换成的字符或字符串是什么：");
		String replaceSymbol = input.next();
		//替换
		for (int i = 0; i < str2.length; i++) {
			if (str2[i].equals(replaced)) {
				str2[i] = replaceSymbol;
			}
		}

		System.out.println("替换后的字符串如下：");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
	}
	
	/*
	 * 写一个方法将传入字符串将该字符数组的前3个元素创建成一个新字符串并输出；
	 */
	public static void thirdTest() {
		System.out.println("请输入一个字符串，将截取前三个字符输出");
		System.out.println(input.next().subSequence(0, 3));
	}
}