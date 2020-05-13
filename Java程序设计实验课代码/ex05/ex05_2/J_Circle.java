package ex05_2;
/**
 * 
 * @content:建立子类J_Circle，继承 Shape,分别实现Shape中的抽象方法draw()
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月8日下午9:15:47
 * @第一次修改的时间：
 * @time:2020年5月8日下午9:15:47
 * @修改原因：课堂测验，修改内容：
 */
public class J_Circle extends Shape {
@Override
	public void draw() {
		System.out.println("\nCircle:我画了一个圆形！");
	}
}
