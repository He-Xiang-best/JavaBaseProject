package ex05_3_old;
/**
 * 
 * @content:����һ����״�ࣨ���ɳ������ӿڽԿɣ������ܳ������������������������󷽷���
                        �����ܳ������������������ܳ�������ĳ��󷽷�
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��10������1:04:49
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��10������1:04:49
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public interface Shape {
	public double perimeter = 0;
	public double area = 0;

	double calculateP();

	double calculateA();

	void outPut(Shape shape);

}
 