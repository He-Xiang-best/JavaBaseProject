package ex05_2;
/**
 * 
 * @content:���� Test_Shape�࣬����һ��J_Square��Ķ���sqare���ٴ���һ��Shape����J_Circle
 *          �����ö���circle��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��8������9:13:50
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��8������9:13:50
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Test_Shape {

	public static void main(String[] args) {
		J_Square square = new J_Square();
		Shape circle = new J_Circle();
		System.out.println("����ͨ�ķ�ʽʵ�����£�");
		circle.draw();//ͨ�� circle������÷���draw(),�۲����ʵ��Shape��Ķ�̬��
		square.draw();
		//�ö�̬�ķ�����ʵ�֣�
		System.out.println("\n�Զ�̬�ķ�ʽʵ�����£�");
		��̬�Ե�ʵ��(circle);
		��̬�Ե�ʵ��(square);
	}
     //��̬�Ե�ʵ�֣�
	public static void ��̬�Ե�ʵ��(Shape shape) {
		shape.draw();
	}
}
