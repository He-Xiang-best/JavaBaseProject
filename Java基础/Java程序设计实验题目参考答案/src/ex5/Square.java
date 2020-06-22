package ex5;
/**
 * 正方形类
 * 继承Shape抽象类
 * @author 郭晓燕
* 2017.3.20
*/

public class Square extends Shape{
	
	private double width;
	
	
	public Square(double width){
		this.width=width;
		this.area=0;
		this.primeter=0;
	}
	/*
	 * 如果边长大于0，计算周长并返回对应值
	 * 否则周长为-1
	 */
	public double getPrimeter(){
		if (width>0)
			primeter=4*width;
		else
			primeter=-1;
		return primeter;
	}
	
	public double getArea(){
		if (width>0)
			area=Math.pow(width,2);
		else
			area=-1;
		return area;
	}
	//实现Shape类的抽象方法draw
	public void draw(){
		getArea();
		getPrimeter();
		if ((width>0) ){
		System.out.println("正方形边长"+width);
		System.out.println("其周长是"+primeter+"其面积是"+area);
		}
		else
			System.out.println("数据非法，无法构建一个正方形");
		
	}

}
