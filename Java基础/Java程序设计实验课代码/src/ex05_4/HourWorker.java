package ex05_4;
/**
 * ������Employee��ÿ�����඼����Ϊfinal����Ϊ����Ҫ�ټ̳�������������
 * @content:HourlyWorker�����ݹ���ʱ�䳤�̷��Ź��ʣ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:26:27
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:26:27
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public final class HourWorker extends Employee {
	@Override
	public void earning() {
	System.out.println("HourWorker���ɵþã���Ǯ�࣡");
	
}
public HourWorker() {
	earning();
}
}
