package ch03;

public class _4Circle {
	private float radius;
	static double PI=3.14;
	_4Circle()
	{	radius=2.0f;	}
	_4Circle(float r)
	{	radius=r;		}
	public double getPerimeter()
	{
		return 2*radius*PI;
	}
	public double getArea()
	{
		return PI*radius*radius;
	}
	public static void main(String[] args) {
		_4Circle c1=new _4Circle();
		_4Circle c2=new _4Circle(3);
		System.out.println("c1的周长为："+c1.getPerimeter());
		System.out.println("c2的面积为："+c2.getArea());
	}
	
	public double getTriangleArea(double high,double baseline)
	{
		double area;
		area=1/2*high*baseline;
		return area;
	}

	
}

