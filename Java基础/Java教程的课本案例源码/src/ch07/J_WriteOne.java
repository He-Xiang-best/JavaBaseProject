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

public class J_WriteOne
{
    public static void mb_write(OutputStream out,String s)
    {
       //String s = "输出流例程";
        byte[ ] b = s.getBytes( );
        try
        {
        	
        	out.write(b);
            out.flush( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法mb_write结束
    
    public static String getTriangle(int a){
    	return "************";
    }

    public static void main(String args[ ])
    {
    	 
 		String s=J_WriteOne.getTriangle(3);
 		try {
 			J_WriteOne.mb_write(System.out,s);
			System.setOut(new PrintStream("triangle.txt"));
			J_WriteOne.mb_write(System.out,s);
			
			
			J_WriteOne.mb_write(System.out,s);
			BufferedOutputStream f = new BufferedOutputStream(new FileOutputStream("triangle.txt"));
			J_WriteOne.mb_write(f, s);
 		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	
		
	        
      } // 方法main结束
} // 类J_Write结束
