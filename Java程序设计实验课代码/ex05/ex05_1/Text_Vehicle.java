package ex05_1;
/**
 * 
 * @content:������һ����Test_Vehicle��
 *          ��main�������зֱ�ͨ��ʹ��Vehicle�ӿڴ�������Car ��Bike ������ö���audi �� yongjiu��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��8������8:52:40
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��8������8:52:40
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Text_Vehicle {

	public static void main(String[] args) {
		//��������Car ��Bike ������ö���audi �� yongjiu
		Vehicle audi = new Car();
		Vehicle yongjiu = new Bike();
		//ʹ�ýӿ�Vehicle���������ö���ֱ���ø��Ե�����start()��ɲ��stop()����ʾ��ͬ���乤�ߵĶ�̬�ԡ�
		System.out.println("Car�²�Bike:");
		audi.start();
		System.out.println("Bike�²�Car:");
		yongjiu.start();
		System.out.println("\n���Ǹ��Ե����磺");
		System.out.print("Car:");audi.stop();
		System.out.print("Bike:");yongjiu.stop();
       
	}

}
