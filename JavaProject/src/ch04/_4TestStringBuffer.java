package ch04;

public class _4TestStringBuffer {
	public static void main(String[] args) {
		//getStrFromStrBuf();
		modifyStrBuf();
	}
	static void getStrFromStrBuf()
	{StringBuffer strBuf = new StringBuffer("geting char(s) in a string");
		System.out.println("strBuf =" + strBuf);
		System.out.println("length = " + strBuf.length());
		System.out.println("strBuf.charAt(10) =" + strBuf.charAt(10));
		char[] dst = new char[20];
		// ��ȡstrBuf�д�λ��7��λ��14-1֮����ַ��Ӵ���������dst������
		strBuf.getChars(7, 14, dst, 0);
		System.out.print("dst =");
		System.out.println(dst);
		strBuf.setCharAt(0,'G');
		System.out.println("substring(0,6) ="+strBuf.substring(0,6) );
		// ��ȡstrBuf�д�λ��7��λ��14-1֮����ַ��Ӵ���
		// ����String���󷵻�
	System.out.println("substring(7, 14) =" + strBuf.substring(7, 14));
		//append���ӷ�������
		strBuf.append(15);
		System.out.println ("strBuf��"+strBuf);
	}
	static void modifyStrBuf()
	{	StringBuffer
	strBuf = new StringBuffer("leaning to modify the stringBuffer Object");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// ��strBuf�е���ʼ�ַ��޸�Ϊ'L'
	strBuf.setCharAt(0, 'L');
	System.out.println("\nresult of setCharat(0, 'L')");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// ɾ��strBuf�����һ���ַ�
	strBuf.deleteCharAt(strBuf.length() - 1);
	System.out.println("\nresult of deleteCharAt(strBuf.length - 1)");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// ɾ��strBuf�д�λ��8��ʼ��λ��18-1֮����ַ�
	strBuf.delete(8, 18);
	System.out.println("\nresult of delete(8, 18)");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// �޸�strBuf���ַ����ĳ���
	//strBuf.setLength(40);
	strBuf.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	// ��strBuf�е��ַ������ַ�����ǰ��ߵ�
	strBuf.reverse();
	System.out.println("\nresult of reverse()");
	System.out.println("strBuf =" + strBuf);
	System.out.println("length = " + strBuf.length() + "\tcapacity = "
		+ strBuf.capacity());
	}

}
