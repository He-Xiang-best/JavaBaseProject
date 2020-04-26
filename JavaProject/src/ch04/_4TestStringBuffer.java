package ch04;

public class _4TestStringBuffer {
	public static void main(String[] args) {
		//getStrFromStrBuf();
		modifyStrBuf();
	}
	static void getStrFromStrBuf()
	{StringBuffer strBuf = new StringBuffer("geting char(s) in a string");
		System.out.println("strBuf =" + strBuf);
		System.out.println("length = " + strBuf.length());
		System.out.println("strBuf.charAt(10) =" + strBuf.charAt(10));
		char[] dst = new char[20];
		// 获取strBuf中从位置7到位置14-1之间的字符子串，并存于dst数组中
		strBuf.getChars(7, 14, dst, 0);
		System.out.print("dst =");
		System.out.println(dst);
		strBuf.setCharAt(0,'G');
		System.out.println("substring(0,6) ="+strBuf.substring(0,6) );
		// 获取strBuf中从位置7到位置14-1之间的字符子串，
		// 并以String对象返回
	System.out.println("substring(7, 14) =" + strBuf.substring(7, 14));
		//append连接方法操作
		strBuf.append(15);
		System.out.println ("strBuf＝"+strBuf);
	}
	static void modifyStrBuf()
	{	StringBuffer
	strBuf = new StringBuffer("leaning to modify the stringBuffer Object");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// 将strBuf中的起始字符修改为'L'
	strBuf.setCharAt(0, 'L');
	System.out.println("\nresult of setCharat(0, 'L')");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// 删除strBuf中最后一个字符
	strBuf.deleteCharAt(strBuf.length() - 1);
	System.out.println("\nresult of deleteCharAt(strBuf.length - 1)");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// 删除strBuf中从位置8开始到位置18-1之间的字符
	strBuf.delete(8, 18);
	System.out.println("\nresult of delete(8, 18)");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// 修改strBuf中字符串的长度
	//strBuf.setLength(40);
	strBuf.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// 将strBuf中的字符串的字符序列前后颠倒
	strBuf.reverse();
	System.out.println("\nresult of reverse()");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	}

}
