package ex04_P117_9;

public class Triangle {
private double a;
private double b;
private double c;

public void print(Triangle shape) {
	System.out.println("该图形的周长为：" +(float) shape.perimeter() + "\t面积为：" +(float) shape.area());
}

public Triangle() {
	a = 3;
	b = 4;
	c = 5;
}

public Triangle(double a,double b,double c) {
	setA(a);
	setB(b);
	setC(c);
}
public double perimeter() {
	return (a+b+c);
}
public double area() {
	double p =(float) (a+b+c)/2;
	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public double getC() {
	return c;
}
public void setC(double c) {
	this.c = c;
}

}
