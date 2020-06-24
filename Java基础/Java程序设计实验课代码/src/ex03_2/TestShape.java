package ex03_2;
/**
 * @content:对Rect类和Circle类进行测试
 * @author:04191315何翔
 * 第一次完成时间为:
 * @time:2020年4月28日下午11:56:58
 * 第一次修改时间为：
 * @time:2020年5月6日上午10:36:22
 * 修改原因：课堂测验，修改内容：增加三角形类。
 */
public class TestShape {
	public static void main(String[] args) {
		//生成一个圆形对象和一个矩形对象以及三角形对象
		Rect rectshape = new Rect();
		Circle circleshape = new Circle();
		Triangle triangle =new Triangle();
		//打印出两个对象的相关信息。
		System.out.println("\n计算可得圆的面积为：" + (float) circleshape.getCircleArea_S() + "\t\t周长为："
				+ (float) circleshape.getCirclePerimeter());
		System.out.println();
		System.out.println(
				"计算可得矩形的面积为：" + (float) rectshape.getRectArea_S() + "\t\t周长为：" + (float) rectshape.getRectPerimeter());
		System.out.println();
		System.out.println(
				"计算可得三角形的面积为：" + (float) triangle.getTriangleArea_S() + "\t\t周长为：" + (float) triangle.getTrianglePerimeter());

	}
}
