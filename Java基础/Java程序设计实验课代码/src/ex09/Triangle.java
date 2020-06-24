package ex09;

import java.util.Scanner;
/**
 * @content:
自定义一个三角形类Triangle.java，其中：
1）成员x,y,z作为三角形的三边长；
2）构造方法通过参数分别对x,y,z赋值；
3）两个方法getArea求面积，显示三角形信息showInfo。
      这两个方法中当三条边不能构成三角形要抛出自定义异常NotTriangleException，否则显示正确信息。

 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午2:03:21
 * @第一次修改的时间：
 * @time:2020年6月4日下午2:03:21
 * @修改原因：课堂测验，修改内容：
 */
public class Triangle{
private double x,y,z;
   /*
    * 构造方法实现初始化
    */
   public Triangle() throws NotTriangleException{
	   Scanner input = new Scanner(System.in);
	   System.out.println("请分别输入三角形的三条边长：");
	   try {
		   //这里虽然系统会抛异常，但自己也打印一下
		   this.x = input.nextDouble();
		   this.y = input.nextDouble();
		   this.z = input.nextDouble();
	} catch (Exception e) {
		System.err.println("数据类型输入错误！");
		e.printStackTrace();
	}
       showInfo();
       input.close();
   }
   
   public double getArea() {
	   double p =(float) (x+y+z)/2;
		return Math.sqrt(x*(p-x)*(p-y)*(p-z));   
   }
   
   public void showInfo() throws NotTriangleException {
	   if(x<=0||y<=0||z<=0||x+y<=z||x+z<=y||y+z<=x)
		   //错误就抛出异常
	       throw new NotTriangleException();
	   else
		   //显示三角形信息
		   System.out.println("输入的三条边长依次为： "+x+"   ,   "+y+"   ,   "+z);
   }
}
/*
 * 当三条边不能构成三角形要抛出自定义异常NotTriangleException
 */
   class NotTriangleException extends Exception{
	/**
	 * Propose:
	 */
	private static final long serialVersionUID = 1L;
	public NotTriangleException() {
		super("\n输入的三条边不具备构成三角形的条件！");
	}
}
   


