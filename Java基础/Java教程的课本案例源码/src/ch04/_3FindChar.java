package ch04;

public class _3FindChar {
	public static void main(String[] args) {
		String str = new String("this is a java string");
		System.out.println("str = " + str);
		// ��str�в����ַ�'a'��һ�γ��ֵ�λ��
		System.out.println("indexOf((int)'a') = "
			+ str.indexOf((int)'a'));
		// ��str�дӵ�10��λ�ÿ�ʼ�����ַ�'a'��һ�γ��ֵ�λ��'
		System.out.println("indexOf((int)'a', 10) = "
			+ str.indexOf((int)'a', 10));
		System.out.println("indexOf((int)'x') = "
			+ str.indexOf((int)'x'));
		// ��str�в����ַ�'a'���һ�γ��ֵ�λ��
		System.out.println("lastIndexOf((int)'a') = "
			+ str.lastIndexOf((int)'a'));
		// ��str�дӵ�10��λ�ÿ�ʼ��ǰ�����ַ�'a'��һ�γ��ֵ�λ��
		System.out.println("lastIndexOf((int)'a', 10) = "
			+ str.lastIndexOf((int)'a', 10));
		System.out.println("lastIndexOf((int)'x') = "
			+ str.lastIndexOf((int)'x'));
			System.out.println(str.startsWith("this"));
			System.out.println(str.startsWith("ood"));
			System.out.println(str.endsWith("ing"));
			String strarry[]=str.split("a");
			System.out.println("strarry[0]="+strarry[0]);
			char c; //���ĳһ��λ�õ��ַ�
			c=str.charAt(6);
			System.out.println ("c="+c);
			//�ҳ�str�ַ�����s�ĸ���
			int s_cnt=0;
			for(int i=0;i<str.length();i++)
			{if('s'==str.charAt(i))
				{
					s_cnt++;
				}	
			}
			System.out.println ("the number of s is "+s_cnt);
	}

}
