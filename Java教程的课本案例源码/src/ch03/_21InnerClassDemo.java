package ch03;

public class _21InnerClassDemo {
	public static void main(String args[])
	{
		_21OuterClass out=new _21OuterClass();
		_21OuterClass.InnerClass inner=out.new InnerClass();
		System.out.println("内部类成员域str:"+inner.str);
		System.out.println("内部类的成员域innerClassAccessible："+inner.isInnerClassAccessible());	
		
	}
}
