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
            // ��3��������д����    
   	     	String str = "Hello ���!!!\r\ndddddddd";      
   	     	// ׼��һ���ַ���    
   	     	byte b[] = str.getBytes();          
   	     	// �ַ���תbyte����    
   	     	f_out.write(b);                
   	     	// ���������    
   	     	// ��4�����ر������    
   		    //f_out.close();                  
   	     	// ��ʱû�йر�    
        }
   	     catch (IOException e)
         {
             System.err.println("�����쳣:" + e);
             e.printStackTrace( );
         } // try-catch�ṹ����
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
	            System.err.println("�����쳣:" + e);
	            e.printStackTrace( );
	        } // try-catch�ṹ����
		
		
	}
	
	public static void main(String[] args) {
		J_FileInputOutputStream j_f=new J_FileInputOutputStream();
		j_f.writeFile("test.txt");
		j_f.readFile("test.txt");
            
   	     	
   	    
    } // ����main����	   
	
	      

}
