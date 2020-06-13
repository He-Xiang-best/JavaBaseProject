package ch03;

public class _3Rect                     //类声明部分；
{	private float rectLong, rectWide;    //类成员变量部分；
public _3Rect( )                   //类的构造方法
{	rectLong=2.5f;
	rectWide=1.2f;
}
public _3Rect(float r_long,float r_wide) //类的重载构造方法
{	rectLong=r_long;
	rectWide=r_wide;
}
public float getPerimeter()         //类成员方法部分；
{	return 2*(rectLong+rectWide);
}
public double getArea(){  return rectLong*rectWide;  
}
public static void main(String args[])
	{	_3Rect rect1=new _3Rect();			//定义并创建矩形对象实例rect1
		_3Rect rect2=new _3Rect(7.8f, 5.4f);
//调用对象成员方法，显示矩形1的周长
System.out.println("矩形rect1的周长="+rect1.getPerimeter( )); 
//调用对象成员方法，显示矩形2的面积
System.out.println("矩形rect2的面积="+rect2.getArea( ));
}
}
