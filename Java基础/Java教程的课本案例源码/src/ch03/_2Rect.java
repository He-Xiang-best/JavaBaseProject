package ch03;

public class _2Rect                     //���������֣�
{	
	private float rectLong, rectWide;
	//���Ա�������֣�
	public static double PI=3.1415;

	public _2Rect( )                   //��Ĺ��췽��
{	rectLong=2.5f;
rectWide=1.2f;
}
public _2Rect(float r_long,float r_wide) //������ع��췽��
{	rectLong=r_long;
rectWide=r_wide;
}
public float getPerimeter()         //���Ա�������֣�
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

