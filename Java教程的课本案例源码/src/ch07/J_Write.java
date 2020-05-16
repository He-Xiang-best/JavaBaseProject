package ch07;

// ////////////////////////////////////////////////////////
// 
// J_Write.java
// 
// ////////////////////////////////////////////////////////
// 简介:
//     输出流例程。
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
        String s = "输出流例程";
        byte[ ] b = s.getBytes( );
        try
        {        	
        	out.write(b);
            out.flush( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法mb_write结束
    
    

    public static void main(String args[ ])
    {    	 
 		mb_write(System.out);
    }
    	
}		
	        
    