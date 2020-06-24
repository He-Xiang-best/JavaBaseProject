package ch05;

import java.util.Hashtable;

public class TestHashtable {

	public static void main(String[] args) {
		Hashtable<Integer,String> myH=new Hashtable<Integer,String>();
		myH.put(new Integer(0),"测试泛型Hashtable");
		
		String s=(String)myH.get(new Integer(0));
		//如果直接赋值将会产生无法将Object类型转换为Stirng类型的错误
		//String s=myH.get(new Integer(0));
		System.out.println(s);
		
		
		
		
	}
	
}
