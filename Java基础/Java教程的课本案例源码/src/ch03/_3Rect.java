package ch03;

public class _3Rect                     //���������֣�
{	private float rectLong, rectWide;    //���Ա�������֣�
public _3Rect( )                   //��Ĺ��췽��
{	rectLong=2.5f;
	rectWide=1.2f;
}
public _3Rect(float r_long,float r_wide) //������ع��췽��
{	rectLong=r_long;
	rectWide=r_wide;
}
public float getPerimeter()         //���Ա�������֣�
{	return 2*(rectLong+rectWide);
}
public double getArea(){  return rectLong*rectWide;  
}
public static void main(String args[])
	{	_3Rect rect1=new _3Rect();			//���岢�������ζ���ʵ��rect1
		_3Rect rect2=new _3Rect(7.8f, 5.4f);
//���ö����Ա��������ʾ����1���ܳ�
System.out.println("����rect1���ܳ�="+rect1.getPerimeter( )); 
//���ö����Ա��������ʾ����2�����
System.out.println("����rect2�����="+rect2.getArea( ));
}
}
