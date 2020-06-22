package ex5;
/***
 * 抽象类Shape
 * 代表形状类
 * @author Administrator
 *
 */
public abstract class Shape {

	public static final double PI = 3.1415926;
	double area,primeter;
	
	public double getArea() {
		return area;
	}

	public double getPrimeter() {
		return primeter;
	}
	//抽象方法，代表画图形
	public abstract void draw();
}
