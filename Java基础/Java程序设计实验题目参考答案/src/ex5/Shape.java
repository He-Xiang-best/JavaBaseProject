package ex5;
/***
 * ������Shape
 * ������״��
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
	//���󷽷�������ͼ��
	public abstract void draw();
}
