package ch07;

// ////////////////////////////////////////////////////////
// 
// J_Write.java
// 
// ////////////////////////////////////////////////////////
// ���:
//     ��������̡�
// ////////////////////////////////////////////////////////


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class J_Write
{
    public static void mb_write(OutputStream out)
    {
        String s = "���������";
        byte[ ] b = s.getBytes( );
        try
        {        	
        	out.write(b);
            out.flush( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_write����
    
    

    public static void main(String args[ ])
    {    	 
 		mb_write(System.out);
    }
    	
}		
	        
    