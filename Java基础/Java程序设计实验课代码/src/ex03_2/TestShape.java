package ex03_2;
/**
 * @content:��Rect���Circle����в���
 * @author:04191315����
 * ��һ�����ʱ��Ϊ:
 * @time:2020��4��28������11:56:58
 * ��һ���޸�ʱ��Ϊ��
 * @time:2020��5��6������10:36:22
 * �޸�ԭ�򣺿��ò��飬�޸����ݣ������������ࡣ
 */
public class TestShape {
	public static void main(String[] args) {
		//����һ��Բ�ζ����һ�����ζ����Լ������ζ���
		Rect rectshape = new Rect();
		Circle circleshape = new Circle();
		Triangle triangle =new Triangle();
		//��ӡ����������������Ϣ��
		System.out.println("\n����ɵ�Բ�����Ϊ��" + (float) circleshape.getCircleArea_S() + "\t\t�ܳ�Ϊ��"
				+ (float) circleshape.getCirclePerimeter());
		System.out.println();
		System.out.println(
				"����ɵþ��ε����Ϊ��" + (float) rectshape.getRectArea_S() + "\t\t�ܳ�Ϊ��" + (float) rectshape.getRectPerimeter());
		System.out.println();
		System.out.println(
				"����ɵ������ε����Ϊ��" + (float) triangle.getTriangleArea_S() + "\t\t�ܳ�Ϊ��" + (float) triangle.getTrianglePerimeter());

	}
}
