package ch03;

public class _21OuterClass {
	private boolean outerClassAccessible;
	public _21OuterClass()
	{
		System.out.println("调用外部类构造方法");
		outerClassAccessible=true;
		InnerClass in=new InnerClass();
System.out.println("在外部类中访问外部类变量: "+outerClassAccessible);
System.out.println("在外部类中访问内部类变量: "+in.innerClassAccessible);
	}
	class InnerClass
	{
	String str="testInnerVarible";
	private	boolean innerClassAccessible;
		public InnerClass()
		{
			System.out.println("调用内部类构造方法");
			innerClassAccessible=true;
	System.out.println("在内部类中访问外部类变量: "+outerClassAccessible);
	System.out.println("在内部类中访问内部类变量: "+innerClassAccessible);
		}
		boolean isInnerClassAccessible()
		{
			return innerClassAccessible;
		}
	}
}

