package ex14;
/**
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��18������4:51:54
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��18������4:51:54
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class UseThread extends Thread{
@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println("����ã��ҵ�������������������"+(i+1)+"���������");
	}
	System.out.println();
}
}

