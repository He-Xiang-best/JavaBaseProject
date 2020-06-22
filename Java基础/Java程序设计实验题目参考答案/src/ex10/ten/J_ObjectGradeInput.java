package ex10.ten;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;

public class J_ObjectGradeInput {
	/**
	 * 从对象流BufferedReader中读取一个对象
	 * @param in 对象流
	 * @return 返回所读取到的对象 
	 */
	public static StringBuffer GradeInput(BufferedReader in){
		//String st[]=new String[length];
		StringBuffer bs=new StringBuffer();
		String s="";
		 try
	        {
			   for(;s!=null;s=in.readLine()){
				   bs.append(s+"\n");
	            System.err.println(s);
   
			  }
			 }
	        catch (Exception e)
	        {
	            System.err.println("发生异常gradeInput:" + e);
	            e.printStackTrace( );
	        } // try-catch结构结束
		return bs;
	}
	/**
	 * 从文件中读取内容将其存放在字符串数组中。
	 * @param filename 读取文件的文件名
	 * @param length  读取出来的内容所存放字符串数组的长度
	 * @return字符串数组，保存文件的内容
	 */
	public static StringBuffer readFile(String filename){
		StringBuffer st=new StringBuffer();
		try{
			BufferedReader obin=new BufferedReader(new FileReader(filename));
			st=GradeInput(obin);
			obin.close();
		}catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
		
		return st;
	}

}
