package ch03;

public class _8ParamRef {
	public static void reftest(_8Ref c) { // ���󴫵ݺ�����õ�ַ;
		System.out.println("���󴫵ݵ������󣬷����еĶ������c�����õ�ֵַc=" + c);
		// ���󴫵ݺ�����Ա���ֵ;
		System.out.println("in the reftest before cnt++,c.cnt=" + c.cnt);
		c.cnt++;
		// ��ʾ�޸ĺ�����Ա���ֵ��
		System.out.println("�ڷ����ڣ��޸ĺ�����Ա���ֵc.cnt=" + c.cnt);
	}

	public static void main(String args[]) {
		_8Ref d = new _8Ref();
		// ���󴫵�ǰ�����õ�ַ��
		System.out.println("_8ref��Ķ������d�����õ�ֵַd=" + d);
		System.out.println("�ڵ���reftest( )����ǰ������d�����Ա���ֵΪd.cnt=" + d.cnt);
		reftest(d);
		System.out.println("�ڵ���reftest( )�����󣬶���d�����Ա���ֵd.cnt=" + d.cnt);
	}
}
