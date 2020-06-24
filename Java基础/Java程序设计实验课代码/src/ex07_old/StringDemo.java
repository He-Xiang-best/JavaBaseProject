package ex07_old;

import java.util.Scanner;

public class StringDemo {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//虽然按常规意识，这个问题的确已经有解，此处为实现题目要求
		System.out.println("题目1.");
		firstest();
		System.out.println("题目2.");
		secondTest();
//		
//		//(3)
//		System.out.println("\n\n题目3.\n请输入两个字符串进行大小比较（要求输入字符串长度大于3）：");
//		String str2 = input.nextLine();
//		String str3 = input.nextLine();
//		if(judge(str2,str3)==0) {
//			System.out.println("这两个字符串的大小相等");
//		}
//		else
//			if(judge(str2,str3)<0) {
//				System.out.println("字符串"+str2+"比"+str3+"小");
//			}
//			else
//				System.out.println("字符串"+str2+"比"+str3+"大");     
//		
//		System.out.print("\n题目4.\n下面将字符串"+str2+"转换为字符数组，并输出前三个字符组成的字符串\n结果为：");
//		char[] ch = new char[100];
//		ch = str2.toCharArray();
//		for (int i = 0; i < 3; i++) {
//			System.out.print(ch[i]);
//		}
	}
	
/*
 *  用一个方法判断一个身份证号码是否是某个省身份证，方法要求传递三个参数，第一个参数是身份证，
 *  第二个参数为判断的前缀，第三个是对应的省份。方法输出为布尔值，真则成功，假则失败。（提示：判断前缀“44”）；
 *  虽然按常规意识，这个问题的确明显已经有解，此处为实现题目要求而写
 */
	public static void firstest() {
		
		System.out.println("请依次输入您的身份证号，您所在省份以及此省份的身份证前缀");
		String id = input.next();
		String province = input.next();	
		String head = input.next();
		if(judge(id, head, province))
			System.out.println("您的身份证是"+ head +"省份的");
		else
			System.out.println("您的身份证不是"+ head +"省份的");
		
	}
	
	public static boolean judge(String id,String head,String province) {
		if(id.subSequence(0, 2).equals(head))
			return true;
		else
		    return false;
	}
	
	/*
	 *写一个方法，可以一个字符串中的一个字符全部替换为另一个字符串后再输出， 
	 *比如字符串为“AB-C-ABC”，用“First”替换所有的A；
	 */
	public static void replace2() {
		String[] str = {"A","B","-","C","-","A","B","C"};//也可以录入一个字符串，再把其转为字符串数组完成
		System.out.println("题目2.\n初始字符串为：");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("A"))
				str[i]="First";			
		}
		System.out.println("\n用First替换A后的字符串为：");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		int j=0;
		System.out.println("\n替换后用“-”拆分如下：");
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("-")) {
				for(;j<i;j++) {
					System.out.print(str[j]);
				}
				System.out.println();
				j=i+1;
			}
		}
		for (; j < str.length; j++) {
			System.out.print(str[j]);
		}
		
	}
	public static void secondTest() {
		System.out.println("请输入一个字符串：");
		String str = input.nextLine();
		System.out.println("初始的字符串为："+str);
		//转换为字符串拆分（没有分割符的情况）
		/*
		 * 如果有分割符的话，可以采用String.split()方法简化，下面的是普遍通解方法
		 */
	   char[] charArray = str.toCharArray();
	   //将字符数组转换为字符串数组
		String[] str2 = new String[charArray.length];
		for (int i = 0; i < str2.length; i++) {
			str2[i] = String.valueOf(charArray[i]);
			//写法2：str2[i] = Character.toString(charArray[i]);
		}
		System.out.println("请输入您想替换的字符或字符串是什么：");
		String replaceSymbol = input.nextLine();
		System.out.println("你想要的替换上述字符串中的那个“字符”？");
		String replaced = input.next();
		for (int i = 0; i < str2.length; i++) {
			if(str2[i].equals(replaced)) {
				str2[i] = replaceSymbol;
			}
		}
		
		System.out.println("替换后的字符串如下：");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
	}
}
