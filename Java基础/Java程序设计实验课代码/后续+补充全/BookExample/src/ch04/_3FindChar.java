package ch04;

public class _3FindChar {
	public static void main(String[] args) {
		String str = new String("this is a java string");
		System.out.println("str = " + str);
		// 在str中查找字符'a'第一次出现的位置
		System.out.println("indexOf((int)'a') = "
			+ str.indexOf((int)'a'));
		// 在str中从第10个位置开始查找字符'a'第一次出现的位置'
		System.out.println("indexOf((int)'a', 10) = "
			+ str.indexOf((int)'a', 10));
		System.out.println("indexOf((int)'x') = "
			+ str.indexOf((int)'x'));
		// 在str中查找字符'a'最后一次出现的位置
		System.out.println("lastIndexOf((int)'a') = "
			+ str.lastIndexOf((int)'a'));
		// 在str中从第10个位置开始向前查找字符'a'第一次出现的位置
		System.out.println("lastIndexOf((int)'a', 10) = "
			+ str.lastIndexOf((int)'a', 10));
		System.out.println("lastIndexOf((int)'x') = "
			+ str.lastIndexOf((int)'x'));
			System.out.println(str.startsWith("this"));
			System.out.println(str.startsWith("ood"));
			System.out.println(str.endsWith("ing"));
			String strarry[]=str.split("a");
			System.out.println("strarry[0]="+strarry[0]);
			char c; //输出某一个位置的字符
			c=str.charAt(6);
			System.out.println ("c="+c);
			//找出str字符串中s的个数
			int s_cnt=0;
			for(int i=0;i<str.length();i++)
			{if('s'==str.charAt(i))
				{
					s_cnt++;
				}	
			}
			System.out.println ("the number of s is "+s_cnt);
	}

}
