package ch03;

public class _7Parambasic {
	static int i=5;
	public static void testParam(int x)
	{	System.out.println("���ݵ������еĲ���ֵx="+x);
		x=x*x;
		System.out.println("x�����ڷ������޸ĺ��ֵ="+x);
	}
	public static void main(String[] args) {
		// ���Ի����������͵Ĳ�������
		System.out.println("��������ǰ�������Ա�����ֵi="+i);
		testParam(i);
		System.out.println("�������ݺ������Ա���ֵi="+i);
	}

}
