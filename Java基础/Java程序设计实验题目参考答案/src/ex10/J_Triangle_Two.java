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

public class J_Triangle_Two
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
    
    /**
	 * 使用System.out系统输出流打印倒立三角形
	 *  @param length 倒立三角形的行数
	 */
    public static String getTriangle(int length){  
    	StringBuffer tri=new StringBuffer();
    	for (int i=0;i<length;i++){
    		for (int m=0;m<i;m++)
    			tri.append(" ");
    		for (int n=0;n<2*(length-1-i)+1;n++)
    			tri.append("*");
    		tri.append("\r\n");
    	}//end for 
    	return tri.toString();
    }
    
    public static void main(String args[ ])
    {
    	 
 		String s=getTriangle(8);
 		try {
 			//将倒立三角形输出到控制台上
 			mb_write(System.out,s);
			//将倒立三角形输出到文件里
			mb_write(new PrintStream("triangle2.txt"),s);			
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	
		
	        
      } // 方法main结束
} // 类J_Write结束
