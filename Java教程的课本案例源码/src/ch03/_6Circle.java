package ch03;
import java.util.*;
public class _6Circle {
	private float radius;
	static double PI=3.14;
	_6Circle c1,c2;
	_6Circle()
	{	radius=2.0f;	}
	_6Circle(float r)
	{	radius=r;		}
	public double getPerimeter()
	{
		Math.sqrt(1);
		return 2*radius*PI;
	}
	public double getArea()
	{
		return PI*radius*radius;
	}
	public static void showPI()
	{
		System.out.println("�κ�Բ�����Բ����Ϊ��"+PI);
	}
	public static void showRadius(int r)
	{
		_6Circle c=new _6Circle(r);
		System.out.println("��Բ�İ뾶Ϊ"+c.radius+_6Circle.PI);
	}
	public static void main(String[] args) {
		_6Circle c1=new _6Circle();
		_6Circle c2=new _6Circle(3);
		System.out.println("c1���ܳ�Ϊ��"+c1.getPerimeter());
		System.out.println("c2�����Ϊ��"+c2.getArea());
System.out.println("c1�İ뾶Ϊ"+c1.radius+",c2�İ뾶Ϊ"+c2.radius);
		_6Circle.showPI();
		_6Circle.showRadius(5);
	}
}

