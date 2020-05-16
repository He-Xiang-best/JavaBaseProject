package ch03.Interface;

public class _18CircleImpl implements _17ShapeInterface{
	double radius;
	
	
	public _18CircleImpl(double radius) {
		super();
		this.radius = radius;
	}
	
	
	public double getArea()
	{
		return PI*radius*radius;
	}
	public  void showArea()
	{
		System.out.println("圆的面积是"+getArea());
	}
	public double getPerimeter()
	{
		return 2*PI*radius;
	}
	public void showPerimeter()
	{		
	}

}
