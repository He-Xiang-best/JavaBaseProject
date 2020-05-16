package ch03;

public class _2Rect                     //类声明部分；
{	
	private float rectLong, rectWide;
	//类成员变量部分；
	public static double PI=3.1415;

	public _2Rect( )                   //类的构造方法
{	rectLong=2.5f;
rectWide=1.2f;
}
public _2Rect(float r_long,float r_wide) //类的重载构造方法
{	rectLong=r_long;
rectWide=r_wide;
}
public float getPerimeter()         //类成员方法部分；
{
	return 2*(rectLong+rectWide);
}
public double getArea()
{  
	return rectLong*rectWide;}


public static void main(String args[])
{
	_2Rect rect=new _2Rect();
	System.out.print(_2Rect.PI);
	System.out.print(rect.getArea());
}
}

