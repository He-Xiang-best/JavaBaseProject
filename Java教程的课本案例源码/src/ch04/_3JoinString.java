package ch04;

public class _3JoinString {
	public static void main(String[] args) {
		String firstString = "Many ";
	    String secondString = "hands ";
	    String thirdString = "make light work";
	    String myString;         
	   // �����������ַ��������������������浽�ַ���myString�У�
	    myString = firstString + secondString + thirdString;
	    System.out.println(myString);
	   // ������99�Զ�ת�����ַ���������������ַ�������������
	    int numHands = 99;
	    myString = numHands + " " + secondString + thirdString;
	    System.out.println(myString);
	    // �����ַ��������������Ĳ�����
	    myString = "hello " + 5 + 5;
	    System.out.println(myString);
	    myString = 5 + 5 + " hello";
	    System.out.println(myString);
	}

}
