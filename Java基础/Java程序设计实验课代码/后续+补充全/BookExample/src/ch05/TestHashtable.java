package ch05;

import java.util.Hashtable;

public class TestHashtable {

	public static void main(String[] args) {
		Hashtable<Integer,String> myH=new Hashtable<Integer,String>();
		myH.put(new Integer(0),"���Է���Hashtable");
		
		String s=(String)myH.get(new Integer(0));
		//���ֱ�Ӹ�ֵ��������޷���Object����ת��ΪStirng���͵Ĵ���
		//String s=myH.get(new Integer(0));
		System.out.println(s);
		
		
		
		
	}
	
}
