package ch04;

public class _3ChangeString {
	public static void main(String[] args) {
		String str = new String("    This IS a String   ");
		System.out.println("str =" + str);  // �޸�ǰ
		//���÷���trim()����str�ַ����еĿո�
		System.out.println("str.trim() =" + str.trim());
	System.out.println("str.replace('S', 'Z') =" + str.replace('S', 'Z'));
		System.out.println("str.toLowerCase() =" + str.toLowerCase());
		System.out.println("str.toUpperCase() =" + str.toUpperCase());			
		System.out.println("str =" + str);  // �޸ĺ�
	}

}
