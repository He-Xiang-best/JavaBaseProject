package ex03_2;
/**
 * @content:��Rect���Circle����в���
 * @author:04191315����
 * @time:2020��4��28������11:56:58
 */
public class TestShape {
	public static void main(String[] args) {
		//����һ��Բ�ζ����һ�����ζ���
		Rect rectshape = new Rect();
		Circle circleshape = new Circle();
		//��ӡ����������������Ϣ��
		System.out.println("\n����ɵ�Բ�����Ϊ��" + (float) circleshape.getCircleArea_S() + "\t\t�ܳ�Ϊ��"
				+ (float) circleshape.getCirclePerimeter());
		System.out.println();
		System.out.println(
				"����ɵþ��ε����Ϊ��" + (float) rectshape.getRectArea_S() + "\t\t�ܳ�Ϊ��" + (float) rectshape.getRectPerimeter());

	}
}
