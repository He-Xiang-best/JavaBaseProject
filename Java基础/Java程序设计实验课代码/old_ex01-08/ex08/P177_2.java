package ex08;

import java.util.Scanner;
/**
 * @content:P177页第2题
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午8:19:50
 * @第一次修改的时间：
 * @time:2020年5月27日下午8:19:50
 * @修改原因：课堂测验，修改内容：
 */
//定义一个泛型类，但是这个泛型类必须实现计算面积的接口（因为输出面积要用到接口中被实现的方法）
public class P177_2<E extends Calculate> {
	static float x = 0;// 正方形边长和圆的半径，简单就直接用一个量

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正方形的边长：");
		x = input.nextFloat();
		//泛型类，这个类中的方法可以给不同的类共同使用。
		new P177_2<Z>().outcome(new Z());
		System.out.println("\n请输入圆的半径：");
		x = input.nextFloat();
		new P177_2<Y>().outcome(new Y());
		input.close();
	}

	public void outcome(E e) {
		System.out.println("计算可得面积为" + e.calculation(x));
	}

}

class Z implements Calculate {

	@Override
	public float calculation(float x) {

		return x * x;
	}

}

class Y implements Calculate {
	final double pi = 3.14;

	@Override
	public float calculation(float x) {

		return (float) (x * x * pi);
	}

}