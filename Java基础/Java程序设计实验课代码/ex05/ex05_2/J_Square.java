package ex05_2;
/**
 * 
 * @content:建立子类 J_Square，继承 Shape,分别实现Shape中的抽象方法draw()
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月8日下午9:16:16
 * @第一次修改的时间：
 * @time:2020年5月8日下午9:16:16
 * @修改原因：课堂测验，修改内容：
 */
public class J_Square extends Shape {

@Override
	public void draw() {
	System.out.println("\nSquare:我画了一个方形！");
	}
}
