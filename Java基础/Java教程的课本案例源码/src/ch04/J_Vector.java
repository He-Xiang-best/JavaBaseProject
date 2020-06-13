package ch04;

import java.util.Iterator;
import java.util.Vector;

public class J_Vector {
	private Vector<String> v;
	
	public J_Vector(){
		v=new Vector<String>();
	}
	/**
	 * 将一个字符串数组转成一个向量
	 * @param a
	 */
	public void setV(String a[]){
		for (int i=0;i<a.length;i++)
		    v.add(a[i]);		
	}
	/**
	 * 使用迭代器遍历向量v
	 */
	public void print(){
		Iterator<String> itor=v.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
	}
	
	public static void main(String args[ ])
    {
		J_Vector jv=new J_Vector();
		String s[]={new String("Angle"),new String("Bob"),new String("Carl")};
		jv.setV(s);
		jv.print();
		jv.v.remove(0);
		jv.print();
		jv.v.add("大家huang");
		jv.print();
    }
}
 