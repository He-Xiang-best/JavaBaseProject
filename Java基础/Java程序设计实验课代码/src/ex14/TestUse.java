package ex14;
/**
 * @content:ѧϰ����Thread���Runnalbe�ӿ����ַ�����д�̳߳���
 *          �ֱ������ַ�ʽ��д���̹߳��ܵĳ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��18������4:51:08
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��18������4:51:08
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class TestUse {

	public static void main(String[] args) {
		UseThread ut = new UseThread();
		ut.start();
		UseRunnable ur = new UseRunnable();
		new Thread(ur).start();

	}

}
