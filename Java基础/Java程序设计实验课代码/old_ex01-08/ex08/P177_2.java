package ex08;

import java.util.Scanner;
/**
 * @content:P177ҳ��2��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��5��27������8:19:50
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��5��27������8:19:50
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
//����һ�������࣬����������������ʵ�ּ�������Ľӿڣ���Ϊ������Ҫ�õ��ӿ��б�ʵ�ֵķ�����
public class P177_2<E extends Calculate> {
	static float x = 0;// �����α߳���Բ�İ뾶���򵥾�ֱ����һ����

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������εı߳���");
		x = input.nextFloat();
		//�����࣬������еķ������Ը���ͬ���๲ͬʹ�á�
		new P177_2<Z>().outcome(new Z());
		System.out.println("\n������Բ�İ뾶��");
		x = input.nextFloat();
		new P177_2<Y>().outcome(new Y());
		input.close();
	}

	public void outcome(E e) {
		System.out.println("����ɵ����Ϊ" + e.calculation(x));
	}

}

class Z implements Calculate {

	@Override
	public float calculation(float x) {

		return x * x;
	}

}

class Y implements Calculate {
	final double pi = 3.14;

	@Override
	public float calculation(float x) {

		return (float) (x * x * pi);
	}

}