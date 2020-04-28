package ex03_2;
/**
 * @content:对Rect类和Circle类进行测试
 * @author:04191315何翔
 * @time:2020年4月28日下午11:56:58
 */
public class TestShape {
	public static void main(String[] args) {
		//生成一个圆形对象和一个矩形对象
		Rect rectshape = new Rect();
		Circle circleshape = new Circle();
		//打印出两个对象的相关信息。
		System.out.println("\n计算可得圆的面积为：" + (float) circleshape.getCircleArea_S() + "\t\t周长为："
				+ (float) circleshape.getCirclePerimeter());
		System.out.println();
		System.out.println(
				"计算可得矩形的面积为：" + (float) rectshape.getRectArea_S() + "\t\t周长为：" + (float) rectshape.getRectPerimeter());

	}
}
