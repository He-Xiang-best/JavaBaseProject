package ex07_old;

public class CharacterDemo {

	public static void main(String[] args) {
		String str = "www.google.com";
		int count1=0,count2=0;
		System.out.println("�ַ���"+str+"�ĳ���Ϊ��"+str.length());
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='o') {
				count1++;
			}
			if(str.charAt(i)=='g') {
				count2++;
			}
		}
		System.out.println("�ַ���o���ĸ���Ϊ��"+count1);
		System.out.println("�ַ���g���ĸ���Ϊ��"+count2);
		System.out.println("��ȡƬ�����Ϊ��"+str.substring(4, 10));

	}

}
