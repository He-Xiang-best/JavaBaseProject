package ex05_1;
/**
 * 
 * @content:����������Car�� Bike��ʵ��Vehicle�ӿ�,������ʵ�ֽӿ�start()��stop()����
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��8������8:52:30
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��8������8:52:30
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Car implements Vehicle {
      
	@Override
	public void start() {
		 System.out.println("�������ڹ꣡�����㵥�������գ�");
		
	}
	@Override
	public void stop() {
		System.out.println("ͣ������������");
		
	}
}
