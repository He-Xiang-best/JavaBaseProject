package ex05_4;
/**
 * ������Employee��ÿ�����඼����Ϊfinal����Ϊ����Ҫ�ټ̳�������������
 * @content:Employee��������Boss��ÿ���ڷ������̶����ʣ������ƹ���ʱ�䣩
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��13������12:24:08
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��13������12:24:08
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public final class Boss extends Employee {
public Boss() {
	earning();
}

@Override
public void earning() {
	System.out.println("Boss���ҹ�����н������Ľ����");	
 }
}
