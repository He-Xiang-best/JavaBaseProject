package ex07_new;

import java.util.Scanner;

/**
 * 用最简单的数组方法实现：
 * @content:用户通过键盘指定一个字符串，然后由程序来统计并输出在该字符串中每个字符出现的次数
 * @author:04191315_何翔 
 * @第一次完成的时间：
 * @time:2020年5月27日下午12:05:33 
 * @第一次修改的时间：
 * @time:2020年6月3日下午13:42:08
 * @修改原因：课堂测验，修改内容：完善BUG
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
   /*
      s--------- | N | N | n | _ _ _ | n | h | o |
  symbolNum[i] =   0   0   0   0 0 0   0   0   0
                    4   -1  -1  3 -1 -1 -1  1   1
    */
	public static void find2(String s) {
		for (int i = 0; i < s.length(); i++) {
//对于已经查过的字符已被记录（用-1记录），当循环被记录的字符时，直接跳过，更加高效
			if(symbolNum[i]<0) continue; 

			//抽取本身单个字符，逐一查找是否重复出现，出现就记录
			for (int j = 0; j < s.length(); j++) {
				if(i==j) symbolNum[i]++; //由于初始，默认为0，自身时要+1
if (String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))&& i != j) {
					symbolNum[i]++;
//记录已经算过的字符： 
					symbolNum[j] = -1;
				}
			}
		}
	}

	public static void print(String s) {
		System.out.println("输入的字符串中字母统计个数如下：");
		for (int i = 0; i < s.length(); i++) {
// 直接打印即可：
			if (symbolNum[i] > 0) {
				System.out.println("‘" + s.charAt(i) + "’" + "的个数是：" + symbolNum[i]);
			}
		}
	}
}

