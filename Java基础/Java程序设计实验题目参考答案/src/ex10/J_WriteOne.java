package ex10;

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
    
    //完成此方法，输出长度为length的倒立三角形
    public static String getTriangle(int length){
    	//完善此处代码
    	return "************";
    }

    public static void main(String args[ ])
    {
    	//得到倒立三角形 
 		String s=J_WriteOne.getTriangle(3);
 		try {
 			//向控制台输出倒立三角形
 			mb_write(System.out,s);
 			//向文件输出倒立三角形
			mb_write(new PrintStream("triangle.txt"),s);		
			
 		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	
		
	        
      } // 方法main结束
} // 类J_Write结束
