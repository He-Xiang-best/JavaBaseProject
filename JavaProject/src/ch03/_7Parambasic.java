package ch03;

public class _7Parambasic {
	static int i=5;
	public static void testParam(int x)
	{	System.out.println("传递到方法中的参数值x="+x);
		x=x*x;
		System.out.println("x变量在方法中修改后的值="+x);
	}
	public static void main(String[] args) {
		// 测试基本数据类型的参数传递
		System.out.println("参数传递前的类属性变量数值i="+i);
		testParam(i);
		System.out.println("参数传递后类属性变量值i="+i);
	}

}
