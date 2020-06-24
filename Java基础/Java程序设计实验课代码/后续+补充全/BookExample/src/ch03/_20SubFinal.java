package ch03;

public class _20SubFinal extends _20Testfinal{
	public static void main(String args[])
	{	_20Testfinal testf=new _20Testfinal();
		_20SubFinal subtf=new _20SubFinal();
		_20Testfinal testf1=new _20SubFinal();
		System.out.println ("subtf.getvalue()="+subtf.getvalue());//15
		System.out.println ("testf.getvalue()="+testf.getvalue());//8
	}
	public int getvalue()
		{  return a*b;   }

}
