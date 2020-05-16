package ch04;

public class _3JoinString {
	public static void main(String[] args) {
		String firstString = "Many ";
	    String secondString = "hands ";
	    String thirdString = "make light work";
	    String myString;         
	   // 将以上三个字符串常量连接起来，保存到字符串myString中；
	    myString = firstString + secondString + thirdString;
	    System.out.println(myString);
	   // 将整数99自动转换成字符串，与后面两个字符串连接起来；
	    int numHands = 99;
	    myString = numHands + " " + secondString + thirdString;
	    System.out.println(myString);
	    // 测试字符串与整数相连的操作；
	    myString = "hello " + 5 + 5;
	    System.out.println(myString);
	    myString = 5 + 5 + " hello";
	    System.out.println(myString);
	}

}
