package ex14;
/**
 * 
 * @content:
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��18������4:52:14
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��18������4:52:14
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class UseRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("����ã��ҵ��������������ģ���"+(i+1)+"���������");
		}
		
	}

}
