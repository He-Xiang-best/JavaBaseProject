package ex8;

class Fi_square implements Five_2_Shape{
	double length,width;
	
	public Fi_square(double length,double width){
		if ((length>0)&&(width>0)){
		this.length=length;
		this.width=width;
		}else{
			this.length=0;
			this.width=0;
		}
	}
	public double getArea(){
		double area=length*width;
		return area;
	}
	
	public void print(){
		System.out.print("长方形面积"+getArea());
	}

}

public class Five_2_Circle implements Five_2_Shape {
	double radius;
	
	public Five_2_Circle(double radius){
		if (radius>0)
		this.radius=radius;
		else this.radius=0;
	}	
	
	@Override	
	public double getArea() {
		double area=Math.PI*radius*radius;
		return area;
	}
	
	public void print(){
		System.out.print("圆形面积"+getArea());
	}

}
