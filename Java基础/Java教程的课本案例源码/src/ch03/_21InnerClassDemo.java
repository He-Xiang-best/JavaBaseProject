package ch03;

public class _21InnerClassDemo {
	public static void main(String args[])
	{
		_21OuterClass out=new _21OuterClass();
		_21OuterClass.InnerClass inner=out.new InnerClass();
		System.out.println("�ڲ����Ա��str:"+inner.str);
		System.out.println("�ڲ���ĳ�Ա��innerClassAccessible��"+inner.isInnerClassAccessible());	
		
	}
}
