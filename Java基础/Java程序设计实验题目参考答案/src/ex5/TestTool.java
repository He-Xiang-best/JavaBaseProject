package ex5;



/**
 * ����Vehicle�ӿ�����ʵ����Bike��Car�Ķ�̬��̬��
* @author ������
* 2017.3.20
*/

public class TestTool {

	public static void main(String[] args) {
		Vehicle audi=new Car();
		audi.run();
		audi=new Bike();
		audi.run();

	}

}
