package ex02;
/**
 * @content:��������Ӧ�ó����˽���δ����������������
                        Ӧ�ó�����main�����Ĳ���String���͵�����args�ܽ����û��������м���Ĳ���
 * @author:04191315����
 * @time:2020��4��21������3:41:18
 */
public class Test_Three {

	public static void main(String args[]) {
		double n, sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Double.valueOf(args[i]).doubleValue();

		}
		n = sum / args.length;
		System.out.print("average" + n);
	}
}
/*
 ע�⣺
1��	�����ĸ�����������args.length��ȡ��
2��	������12.34�� ��34.45�� ��21212121���ֱ𸳸���main�����Ĳ���arges[0]��arges[1]  ��arges[2]
3��	����arges[0]��arges[1]��arges[2]��String���͵�
        ����Ҫ����Double.valueOf��String s��������String����ת����Double����
        ����double Value�����������double���͵�ֵ

 */
 