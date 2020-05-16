package ch03.Interface;
interface A{
	
}
public class _18RectImpl implements _17ShapeInterface,A{
	double w,h;
	
	public _18RectImpl(double w, double h) {
		super();
		this.w = w;
		this.h = h;
	}
	public double getArea()
	{		return w*h;
	}
	public void showArea()
	{		//空方法体		
	}
	public  double getPerimeter()
	{		return 2*(w+h);
	}
	public void showPerimeter()
	{		System.out.println("矩形的周长为"+getPerimeter());
	}

}
