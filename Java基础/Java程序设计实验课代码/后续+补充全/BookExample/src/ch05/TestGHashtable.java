package ch05;

import java.util.Hashtable;

public class TestGHashtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Hashtable<Integer,String> myH=new Hashtable<Integer,String>();
			myH.put(new Integer(0),"≤‚ ‘∑∫–ÕHashtable");
			
			String s=myH.get(new Integer(0));
			System.out.println(s);

	}

}
