package ch03;

public class _21OuterClass {
	private boolean outerClassAccessible;
	public _21OuterClass()
	{
		System.out.println("�����ⲿ�๹�췽��");
		outerClassAccessible=true;
		InnerClass in=new InnerClass();
System.out.println("���ⲿ���з����ⲿ�����: "+outerClassAccessible);
System.out.println("���ⲿ���з����ڲ������: "+in.innerClassAccessible);
	}
	class InnerClass
	{
	String str="testInnerVarible";
	private	boolean innerClassAccessible;
		public InnerClass()
		{
			System.out.println("�����ڲ��๹�췽��");
			innerClassAccessible=true;
	System.out.println("���ڲ����з����ⲿ�����: "+outerClassAccessible);
	System.out.println("���ڲ����з����ڲ������: "+innerClassAccessible);
		}
		boolean isInnerClassAccessible()
		{
			return innerClassAccessible;
		}
	}
}

