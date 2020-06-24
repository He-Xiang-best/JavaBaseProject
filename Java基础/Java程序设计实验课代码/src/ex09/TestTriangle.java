package ex09;
/**
 * 
 * @content:主方法中构造一个三角形对象Tri，三条边从控制台输入，显示三角形的信息和面积，要求捕获异常
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月4日下午2:45:00
 * @第一次修改的时间：
 * @time:2020年6月4日下午2:45:00
 * @修改原因：课堂测验，修改内容：
 */
public class TestTriangle {

	public static void main(String[] args) throws NotTriangleException {
		Triangle Tri = new Triangle();
		System.out.println("\n此三角形的面积为："+(float)Tri.getArea());
	}
}
