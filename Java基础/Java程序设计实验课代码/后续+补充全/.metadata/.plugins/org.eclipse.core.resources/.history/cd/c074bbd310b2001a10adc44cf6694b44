package ex05_2;
/**
 * 
 * @content:建立 Test_Shape类，创建一个J_Square类的对象sqare，再创建一个Shape关于J_Circle
 *          的引用对象circle；
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月8日下午9:13:50
 * @第一次修改的时间：
 * @time:2020年5月8日下午9:13:50
 * @修改原因：课堂测验，修改内容：
 */
public class Test_Shape {

	public static void main(String[] args) {
		J_Square square = new J_Square();
		Shape circle = new J_Circle();
		/*
		 * 常见错误：
		 * Shape circle2= new Shape();
		 * J_Circle cir = new Shape();
		 */
		System.out.println("以普通的方式实现如下：");
		circle.draw();//通过 circle对象调用方法draw(),观察如何实现Shape类的多态性
		square.draw();
		System.out.println();
//	    //计算三角形的面积：
//		new Trangle().draw();
		
		//用多态的方法来实现：
		System.out.println("\n以多态的方式实现如下：");
		多态性的实现(circle);
		多态性的实现(square);
//		System.out.println();
//		多态性的实现(new Trangle());
	}
     //多态性的实现：
	public static void 多态性的实现(Shape shape) {
		shape.draw();
	}
}
