package ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J_FileInputOutputStream {

	public void writeFile(String filename){
		try
        {
            FileOutputStream f_out=  new FileOutputStream(filename);
            // 第3步：进行写操作    
   	     	String str = "Hello 你好!!!\r\ndddddddd";      
   	     	// 准备一个字符串    
   	     	byte b[] = str.getBytes();          
   	     	// 字符串转byte数组    
   	     	f_out.write(b);                
   	     	// 将内容输出    
   	     	// 第4步：关闭输出流    
   		    //f_out.close();                  
   	     	// 此时没有关闭    
        }
   	     catch (IOException e)
         {
             System.err.println("发生异常:" + e);
             e.printStackTrace( );
         } // try-catch结构结束
	}
	public void readFile(String filename){
		try{
			byte[]b=new byte[100];
			 FileInputStream f =new FileInputStream(filename);
	         f.read(b);
	         String re_str=new String(b);
	         System.out.println(re_str);
	         
	        }
	        catch (IOException e)
	        {
	            System.err.println("发生异常:" + e);
	            e.printStackTrace( );
	        } // try-catch结构结束
		
		
	}
	
	public static void main(String[] args) {
		J_FileInputOutputStream j_f=new J_FileInputOutputStream();
		j_f.writeFile("test.txt");
		j_f.readFile("test.txt");
            
   	     	
   	    
    } // 方法main结束	   
	
	      

}
