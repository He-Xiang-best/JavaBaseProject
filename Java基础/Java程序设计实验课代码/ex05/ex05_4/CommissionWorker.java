package ex05_4;
/**
 *������Employee��ÿ�����඼����Ϊfinal����Ϊ����Ҫ�ټ̳�������������
 * @content:CommissionWorker�������������⻹�������۶�Ÿ������ʣ�
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:24:29
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:24:29
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public final class CommissionWorker extends Employee {
	@Override
	public void earning() {
		System.out.println("CommissionWorker�����˱���Ǯ�����࿴���ۿ���");

	}

	public CommissionWorker() {
		earning();
	}
}
