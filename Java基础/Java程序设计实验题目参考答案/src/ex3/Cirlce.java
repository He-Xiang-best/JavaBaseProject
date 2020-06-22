package ex3;
/**
 * 圆形类
 * @author 郭晓燕
 * 2016.3.20
 *  
 */
public class Cirlce {
	//半径，面积及周长
	private double radius,area,primeter;
	
	
	public Cirlce(double radius){
		this.radius=radius;
		this.area=0;
		this.primeter=0;
	}
	public double getPrimeter(){
		if (radius>0)
			primeter=2*Math.PI*radius;
		else
			primeter=-1;
		return primeter;
	}
	
	public double getArea(){
		if (radius>0)
			area=Math.PI*radius*radius;
		else
			area=-1;
		return area;
	}
	/**
	 * 计算面积，周长
	 *打印圆形的半径、周长和面积
	 */
	public void printInfo(){
		getArea();
		getPrimeter();
		if ((radius>0) ){
			System.out.println("圆形的半径是"+radius);
			System.out.println("其周长是"+primeter+"其面积是"+area);
		}
		else
			System.out.println("数据非法，无法构建一个圆形");
		
	}

}
