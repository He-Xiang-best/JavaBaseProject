package ex09;
/**
 * 
 * @content:�������й���һ�������ζ���Tri�������ߴӿ���̨���룬��ʾ�����ε���Ϣ�������Ҫ�󲶻��쳣
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������2:45:00
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������2:45:00
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class TestTriangle {

	public static void main(String[] args) throws NotTriangleException {
		Triangle Tri = new Triangle();
		System.out.println("\n�������ε����Ϊ��"+(float)Tri.getArea());
	}
}
